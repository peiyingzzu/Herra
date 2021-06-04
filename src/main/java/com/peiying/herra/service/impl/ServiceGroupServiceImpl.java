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
import com.peiying.herra.common.constants.DutyStatusCode;
import com.peiying.herra.common.constants.DutyTypeCode;
import com.peiying.herra.common.utils.DateTimeUtil;
import com.peiying.herra.common.utils.Response;
import com.peiying.herra.common.utils.ResponseBuilder;
import com.peiying.herra.po.ServerGroupInfo;
import com.peiying.herra.po.SgOnDutyConfig;
import com.peiying.herra.po.SgOnDutyInfo;
import com.peiying.herra.po.SgUserRelation;
import com.peiying.herra.service.ServiceGroupService;
import com.peiying.herra.service.base.ServiceGroupBaseService;
import com.peiying.herra.service.base.SgOnDutyConfigBaseService;
import com.peiying.herra.service.base.SgOnDutyInfoBaseService;
import com.peiying.herra.service.base.SgUserRelationBaseService;

@Service
public class ServiceGroupServiceImpl implements ServiceGroupService {
	@Autowired
	private ServiceGroupBaseService serviceGroupBaseService;
	@Autowired
	private SgUserRelationBaseService sgUserRelationBaseService;
	@Autowired
	private SgOnDutyConfigBaseService sgOnDutyConfigBaseService;
	@Autowired
	private SgOnDutyInfoBaseService sgOnDutyInfoBaseService;

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
	public Response<Boolean> addUsers(int sgId, List<String> userNoList, String operator) {
		ServerGroupInfo selectById = serviceGroupBaseService.selectById(sgId);
		if (selectById == null) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "query return null");
		}
		if (!selectById.getOwneruserno().equals(operator)) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "no permissions");
		}

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
	public Response<Boolean> deleteUsers(int sgId, List<String> userNoList, String operator) {
		ServerGroupInfo selectById = serviceGroupBaseService.selectById(sgId);
		if (selectById == null) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "query return null");
		}
		if (!selectById.getOwneruserno().equals(operator)) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "no permissions");
		}
		boolean result = sgUserRelationBaseService.batchDeleteBySgIdAndUserNo(sgId, userNoList);
		return ResponseBuilder.success(result);
	}

	@Override
	public Response<Boolean> addConfigOnDuty(SgOnDutyConfigBO bo) {
		if (null == bo) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest is null");
		}
		if (bo.getSgid() == null || bo.getDutytype() == null) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest exist field null");
		}
		if (StringUtils.isAllEmpty(bo.getCreateby(), bo.getDutysequence())) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest exist field null");
		}
		if (bo.getDutytype() == DutyTypeCode.SEVEN_DAY_PER) {
			if (bo.getDutyswitchtype() == null) {
				return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest exist field null");
			}
		}
		ServerGroupInfo selectById = serviceGroupBaseService.selectById(bo.getSgid());
		if (selectById == null) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "query return null");
		}
		if (!selectById.getOwneruserno().equals(bo.getCreateby())) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "no permissions");
		}
		String dutySequence = bo.getDutysequence();
		String[] split = dutySequence.split(",");
		if (split == null || split.length <= 0) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "dutySequence is illegal");
		}
		for (String userNo : split) {
			SgUserRelation selectSgIdByUserAndSgId = sgUserRelationBaseService.selectSgIdByUserAndSgId(userNo,
					bo.getSgid());
			if (selectSgIdByUserAndSgId == null) {
				return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, userNo + ", is not belong this service group");
			}
		}
		SgOnDutyConfig po = new SgOnDutyConfig();
		BeanUtils.copyProperties(bo, po);
		boolean add = sgOnDutyConfigBaseService.add(po);
		if (add) {
			Date zeroDate = DateTimeUtil.getZeroDate(new Date());
			int incur = 1;
			if (bo.getDutytype() == DutyTypeCode.SEVEN_DAY_PER) {
				incur = 7;
			}

			for (int i = 0; i < split.length; ++i) {
				SgOnDutyInfo sgOnDutyInfo = new SgOnDutyInfo();
				sgOnDutyInfo.setCreateby(bo.getCreateby());
				sgOnDutyInfo.setCreatetime(new Date());
				sgOnDutyInfo.setCurrentdutyendtime(zeroDate);
				sgOnDutyInfo.setCurrentdutystarttime(DateTimeUtil.getNextNDay(zeroDate, incur));
				zeroDate = DateTimeUtil.getNextNDay(zeroDate, incur);
				if (i == 0) {
					sgOnDutyInfo.setDutystatus(DutyStatusCode.ONLINE);
				} else {
					sgOnDutyInfo.setDutystatus(DutyStatusCode.OFFLINE);
				}
				sgOnDutyInfo.setSgid(bo.getSgid());
				sgOnDutyInfo.setUserno(split[i]);
				sgOnDutyInfoBaseService.add(sgOnDutyInfo);
			}
		}
		return ResponseBuilder.success(add);
	}

}
