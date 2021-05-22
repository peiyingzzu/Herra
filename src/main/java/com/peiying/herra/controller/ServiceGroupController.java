package com.peiying.herra.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peiying.herra.bo.ServerGroupInfoBO;
import com.peiying.herra.common.constants.CodeConstant;
import com.peiying.herra.common.utils.Response;
import com.peiying.herra.common.utils.ResponseBuilder;
import com.peiying.herra.service.ServiceGroupService;
import com.peiying.herra.vo.AddUsersToSgRequest;
import com.peiying.herra.vo.ServerGroupInfoVO;

@RestController
@RequestMapping("/herra/sg")
public class ServiceGroupController {
	@Autowired
	private ServiceGroupService serviceGroupService;

	@RequestMapping("/add")
	public Response<Boolean> add(@RequestBody ServerGroupInfoVO serverGroupInfoBO) {
		if (serverGroupInfoBO == null) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest is null");
		}
		if (StringUtils.isAnyEmpty(serverGroupInfoBO.getName(), serverGroupInfoBO.getOwneruserno())) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest is null");
		}
		try {
			ServerGroupInfoBO bo = new ServerGroupInfoBO();
			BeanUtils.copyProperties(serverGroupInfoBO, bo);
			return serviceGroupService.add(bo);
		} catch (Exception e) {
			return ResponseBuilder.fail(CodeConstant.SYS_ERR, "系统异常");
		}
	}

	@RequestMapping("/add/users")
	public Response<Boolean> addUsers(@RequestBody AddUsersToSgRequest request) {
		if (request == null) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest is null");
		}
		if (request.getSgId() == null || request.getUserList() == null) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest exist field is null");
		}
		if (request.getUserList().size() < 1) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "add user count less than 1");
		}
		try {
			return serviceGroupService.addUsers(request.getSgId(), request.getUserList());
		} catch (Exception e) {
			return ResponseBuilder.fail(CodeConstant.SYS_ERR, "系统异常");
		}
	}
}
