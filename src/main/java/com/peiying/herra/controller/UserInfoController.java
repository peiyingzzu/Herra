package com.peiying.herra.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peiying.herra.bo.UserInfoBO;
import com.peiying.herra.common.constants.CodeConstant;
import com.peiying.herra.common.utils.Response;
import com.peiying.herra.common.utils.ResponseBuilder;
import com.peiying.herra.service.UserInfoService;
import com.peiying.herra.vo.UserInfoVO;

@RestController
@RequestMapping("/herra/user")
public class UserInfoController {
	@Autowired
	UserInfoService userInfoService;

	@RequestMapping("/add")
	public Response<Boolean> add(@RequestBody UserInfoVO userVO) {
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
			return userInfoService.addUser(bo);
		} catch (Exception e) {
			return ResponseBuilder.fail(CodeConstant.SYS_ERR, "系统异常");
		}
	}

}