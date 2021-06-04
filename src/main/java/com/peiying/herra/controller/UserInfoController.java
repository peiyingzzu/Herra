package com.peiying.herra.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peiying.herra.bo.UserInfoBO;
import com.peiying.herra.common.constants.CodeConstant;
import com.peiying.herra.common.utils.Response;
import com.peiying.herra.common.utils.ResponseBuilder;
import com.peiying.herra.po.UserInfo;
import com.peiying.herra.service.UserAccountService;
import com.peiying.herra.service.UserInfoService;
import com.peiying.herra.vo.LoginRequest;
import com.peiying.herra.vo.UserInfoVO;

@RestController
@RequestMapping("/herra/user")
public class UserInfoController {
	@Autowired
	private UserInfoService userInfoService;
	@Autowired
	private UserAccountService userAccountService;

	@RequestMapping("/add")
	public Response<String> add(@RequestBody UserInfoVO userVO) {
		if (userVO == null) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest is null");
		}
		if (userVO.getDepid() == null) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest is null");
		}
		if (StringUtils.isAnyEmpty(userVO.getCreateby(), userVO.getName(), userVO.getPhone(), userVO.getUserno())) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest is null");
		}
		try {
			UserInfoBO bo = new UserInfoBO();
			BeanUtils.copyProperties(userVO, bo);
			Response<String> addUser = userInfoService.addUser(bo, userVO.getPassword());
			if (addUser == null) {
				return ResponseBuilder.fail(CodeConstant.SYS_ERR, "系统异常");
			}
			if (addUser.getCode() != 200) {
				return ResponseBuilder.fail(addUser.getCode(), addUser.getMsg());
			}
			return ResponseBuilder.success(addUser.getData());
		} catch (Exception e) {
			return ResponseBuilder.fail(CodeConstant.SYS_ERR, "系统异常");
		}
	}

	@RequestMapping("/get/{userNo}")
	public Response<UserInfoVO> getUser(@PathVariable("userNo") String userNo) {
		if (userNo == null || userNo.length() <= 0) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest is null");
		}
		try {
			Response<UserInfo> userByUserNo = userInfoService.getUserByUserNO(userNo);
			if (userByUserNo == null) {
				return ResponseBuilder.fail(CodeConstant.SYS_ERR, "系统异常");
			}
			if (userByUserNo.getCode() != 200) {
				return ResponseBuilder.fail(userByUserNo.getCode(), userByUserNo.getMsg());
			}
			UserInfo userInfo = userByUserNo.getData();
			UserInfoVO vo = new UserInfoVO();
			BeanUtils.copyProperties(userInfo, vo);
			return ResponseBuilder.success(vo);
		} catch (Exception e) {
			return ResponseBuilder.fail(CodeConstant.SYS_ERR, "系统异常");
		}
	}

	@RequestMapping("/login")
	public Response<Boolean> login(@RequestBody LoginRequest request) {
		if (request == null || StringUtils.isAnyEmpty(request.getPassword(), request.getUserNo())) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest is null");
		}
		try {
			Response<Boolean> login = userAccountService.login(request.getUserNo(), request.getPassword());
			if (login == null) {
				return ResponseBuilder.fail(CodeConstant.SYS_ERR, "系统异常");
			}
			return login;
		} catch (Exception e) {
			return ResponseBuilder.fail(CodeConstant.SYS_ERR, "系统异常");
		}
	}
	@RequestMapping("/logout/{userNo}")
	public Response<Boolean> logout(@PathVariable("userNo") String userNo) {
		if (StringUtils.isAnyEmpty(userNo)) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest is null");
		}
		try {
			Response<Boolean> logout = userAccountService.logout(userNo);
			if (logout == null) {
				return ResponseBuilder.fail(CodeConstant.SYS_ERR, "系统异常");
			}
			return logout;
		} catch (Exception e) {
			return ResponseBuilder.fail(CodeConstant.SYS_ERR, "系统异常");
		}
	}
}