package com.peiying.herra.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;

import com.peiying.herra.bo.ServerGroupInfoBO;
import com.peiying.herra.common.constants.CodeConstant;
import com.peiying.herra.common.utils.Response;
import com.peiying.herra.common.utils.ResponseBuilder;
import com.peiying.herra.po.ServerGroupInfo;
import com.peiying.herra.service.ServiceGroupService;
import com.peiying.herra.service.base.ServiceGroupBaseService;

public class ServiceGroupServiceImpl implements ServiceGroupService {

	private ServiceGroupBaseService serviceGroupBaseService;

	@Override
	public Response<Boolean> add(ServerGroupInfoBO serverGroupInfoBO) {
		if (serverGroupInfoBO == null) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest is null");
		}
		if (serverGroupInfoBO.getCreatetime() == null) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest.createTime is null");
		}
		if (StringUtils.isAnyEmpty(serverGroupInfoBO.getCreateby(), serverGroupInfoBO.getName(),
				serverGroupInfoBO.getOwneruserno())) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest exist filed   null");

		}
		ServerGroupInfo po = new ServerGroupInfo();
		BeanUtils.copyProperties(serverGroupInfoBO, po);
		boolean result = serviceGroupBaseService.add(po);
		return ResponseBuilder.success(result);
	}

}
