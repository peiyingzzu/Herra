package com.peiying.herra.service.impl;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.peiying.herra.common.constants.CodeConstant;
import com.peiying.herra.common.constants.LoginConstant;
import com.peiying.herra.common.utils.MD5Util;
import com.peiying.herra.common.utils.Response;
import com.peiying.herra.common.utils.ResponseBuilder;
import com.peiying.herra.po.AccountInfo;
import com.peiying.herra.po.UserLogin;
import com.peiying.herra.service.UserAccountService;
import com.peiying.herra.service.base.UserAccountBaseService;
import com.peiying.herra.service.base.UserLoginBaseService;

public class UserAccountServiceImpl implements UserAccountService {
	@Autowired
	private UserAccountBaseService userAccountBaseService;
	@Autowired
	private UserLoginBaseService userLoginBaseService;

	@Override
	public Response<Boolean> signUp(String userName, String password) {
		if (StringUtils.isAllEmpty(userName, password)) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "参数异常");
		}
		AccountInfo po = new AccountInfo();
		po.setUserName(userName);
		String md5 = MD5Util.getMD5(password);
		po.setPassword(md5);
		boolean add = userAccountBaseService.add(po);
		return ResponseBuilder.success(add);
	}

	@Override
	public Response<Boolean> login(String userName, String password) {
		if (StringUtils.isAllEmpty(userName, password)) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "参数异常");
		}
		String md5 = MD5Util.getMD5(password);
		AccountInfo selectByUserNameAndPassword = userAccountBaseService.selectByUserNameAndPassword(userName, md5);
		if (selectByUserNameAndPassword == null) {
			return ResponseBuilder.fail(CodeConstant.USERNAME_PASSWORD_NOT_MATCH, "用户名密码错误");
		}
		UserLogin selectByUserNo = userLoginBaseService.selectByUserNo(userName);
		Boolean reuslt = null;
		if (selectByUserNo == null) {
			selectByUserNo = new UserLogin();
			selectByUserNo.setCreateBy(userName);
			selectByUserNo.setCreateTime(new Date());
			selectByUserNo.setStatus(LoginConstant.ONLINE);
			selectByUserNo.setUserName(userName);
			selectByUserNo.setToken(userName+password);
			reuslt = userLoginBaseService.add(selectByUserNo);
		} else {
			selectByUserNo.setToken(userName+password);
			selectByUserNo.setUpdateBy(userName);
			selectByUserNo.setUpdateTime(new Date());
			selectByUserNo.setStatus(LoginConstant.ONLINE);
			reuslt = userLoginBaseService.updateByUserNo(selectByUserNo);
		}
		return ResponseBuilder.success(reuslt);
	}

	@Override
	public Response<Boolean> logout(String userName) {
		if (StringUtils.isAllEmpty(userName)) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "参数异常");
		}
		UserLogin selectByUserNo = userLoginBaseService.selectByUserNo(userName);
		if (selectByUserNo == null) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "该用户并未登陆");
		}
		selectByUserNo.setUpdateBy(userName);
		selectByUserNo.setUpdateTime(new Date());
		selectByUserNo.setStatus(LoginConstant.OFFLINE);
		Boolean reuslt = userLoginBaseService.updateByUserNo(selectByUserNo);
		return ResponseBuilder.success(reuslt);
	}

}
