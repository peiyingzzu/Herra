package com.peiying.herra.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peiying.herra.bo.ServerGroupInfoBO;
import com.peiying.herra.common.constants.CodeConstant;
import com.peiying.herra.common.utils.Response;
import com.peiying.herra.common.utils.ResponseBuilder;
import com.peiying.herra.service.ServiceGroupService;

@RestController
@RequestMapping("/herra/sg")
public class ServiceGroupController {
	@Autowired
	private ServiceGroupService serviceGroupService;

	@RequestMapping("/add")
	public Response<Boolean> add(@RequestBody ServerGroupInfoBO serverGroupInfoBO) {
		if (serverGroupInfoBO == null) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest is null");
		}
		if (StringUtils.isAnyEmpty(serverGroupInfoBO.getName(), serverGroupInfoBO.getOwneruserno())) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest is null");
		}
		try {
			return serviceGroupService.add(serverGroupInfoBO);
		} catch (Exception e) {
			return ResponseBuilder.fail(CodeConstant.SYS_ERR, "系统异常");
		}
	}
}
