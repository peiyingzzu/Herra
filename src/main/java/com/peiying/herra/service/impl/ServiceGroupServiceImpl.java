package com.peiying.herra.service.impl;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peiying.herra.bo.ServerGroupInfoBO;
import com.peiying.herra.bo.SgOnDutyConfigBO;
import com.peiying.herra.common.constants.CodeConstant;
import com.peiying.herra.common.utils.Response;
import com.peiying.herra.common.utils.ResponseBuilder;
import com.peiying.herra.po.ServerGroupInfo;
import com.peiying.herra.po.SgOnDutyConfig;
import com.peiying.herra.po.SgUserRelation;
import com.peiying.herra.service.ServiceGroupService;
import com.peiying.herra.service.base.ServiceGroupBaseService;
import com.peiying.herra.service.base.SgOnDutyConfigBaseService;
import com.peiying.herra.service.base.SgUserRelationBaseService;

@Service
public class ServiceGroupServiceImpl implements ServiceGroupService {
	@Autowired
	private ServiceGroupBaseService serviceGroupBaseService;
	@Autowired
	private SgUserRelationBaseService sgUserRelationBaseService;
	@Autowired
	private SgOnDutyConfigBaseService sgOnDutyConfigBaseService;

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

	@Override
	public Response<Boolean> addUsers(int sgId, List<String> userNoList) {
		List<SgUserRelation> collect = userNoList.stream().map((a) -> {
			SgUserRelation entity = new SgUserRelation();
			entity.setCreateby(a);
			entity.setCreatetime(new Date());
			entity.setSgid(sgId);
			entity.setUserno(a);
			return entity;
		}).collect(Collectors.toList());
		List<String> batchInsert = sgUserRelationBaseService.batchInsert(collect);
		if (batchInsert == null) {
			return ResponseBuilder.fail(CodeConstant.SYS_ERR, "system error");
		}
		if (batchInsert.size() != 0) {
			StringBuilder sb = new StringBuilder();
			batchInsert.forEach(a -> sb.append(a).append(','));
			sb.append("等人添加失败");
			return ResponseBuilder.fail(CodeConstant.SYS_ERR, sb.toString());
		}
		return ResponseBuilder.success(Boolean.TRUE);
	}

	@Override
	public Response<Boolean> configOnDuty(SgOnDutyConfigBO bo) {
		SgOnDutyConfig po = new SgOnDutyConfig();
		BeanUtils.copyProperties(bo, po);
		boolean add = sgOnDutyConfigBaseService.add(po);
		
		return ResponseBuilder.success(Boolean.TRUE);
	}

}
