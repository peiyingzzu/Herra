package com.peiying.herra.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.peiying.herra.common.constants.CodeConstant;
import com.peiying.herra.common.utils.Response;
import com.peiying.herra.common.utils.ResponseBuilder;
import com.peiying.herra.po.AccountInfo;
import com.peiying.herra.service.UserAccountService;
import com.peiying.herra.service.base.UserAccountBaseService;

public class UserAccountServiceImpl implements UserAccountService {
	@Autowired
	private UserAccountBaseService userAccountBaseService;

	@Override
	public Response<Boolean> logup(String userName, String password) {
		if (StringUtils.isAllEmpty(userName, password)) {
			ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "参数异常");
		}
		AccountInfo po = new AccountInfo();
		po.setUserName(userName);
		po.setPassword(password);
		boolean add = userAccountBaseService.add(po);
		return ResponseBuilder.success(add);
	}

	@Override
	public Response<Boolean> login(String userName, String password) {
		return null;
	}

}
