package com.peiying.herra.service.impl;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peiying.herra.bo.TicketInfoBO;
import com.peiying.herra.bo.TicketStatusBO;
import com.peiying.herra.common.constants.CodeConstant;
import com.peiying.herra.common.constants.TicketStatusCode;
import com.peiying.herra.common.utils.Response;
import com.peiying.herra.common.utils.ResponseBuilder;
import com.peiying.herra.po.TicketInfo;
import com.peiying.herra.po.TicketRecord;
import com.peiying.herra.po.TicketStatus;
import com.peiying.herra.service.TicketService;
import com.peiying.herra.service.base.TicketInfoBaseService;
import com.peiying.herra.service.base.TicketRecordBaseService;
import com.peiying.herra.service.base.TicketStatusBaseService;

@Service
public class TicketServiceImpl implements TicketService {
	@Autowired
	private TicketInfoBaseService ticketInfoBaseService;
	@Autowired
	private TicketStatusBaseService ticketStatusBaseService;
	@Autowired
	private TicketRecordBaseService ticketRecordBaseService;

	@Override
	public Response<Boolean> createTicket(TicketInfoBO ticketInfoBO, TicketStatusBO ticketStatusBO) {
		if (ticketInfoBO == null || ticketStatusBO == null) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest is null");
		}
		if (ticketStatusBO.getLevel() == null || ticketInfoBO.getItemid() == null
				|| StringUtils.isAnyEmpty(ticketInfoBO.getAskeruserno(), ticketInfoBO.getContent(),
						ticketInfoBO.getCreateby(), ticketInfoBO.getTitle(), ticketStatusBO.getCreateby(),
						ticketStatusBO.getOwneruserno(), ticketStatusBO.getWatcheduserlist())) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest is null");
		}
		if (ticketStatusBO.getStatus() == null) {
			ticketStatusBO.setStatus(TicketStatusCode.WAIT_SOLVE);
		}
		TicketInfo ticketInfoPO = new TicketInfo();
		BeanUtils.copyProperties(ticketInfoBO, ticketInfoPO);
		ticketInfoPO.setCreatetime(new Date());
		boolean add2 = ticketInfoBaseService.add(ticketInfoPO);
		if (add2) {
			ticketStatusBO.setTicketid(ticketInfoPO.getId());
			ticketStatusBO.setCreatetime(new Date());
			TicketStatus ticketStatusPO = new TicketStatus();
			BeanUtils.copyProperties(ticketStatusBO, ticketStatusPO);
			boolean add = ticketStatusBaseService.add(ticketStatusPO);
			return ResponseBuilder.success(Boolean.TRUE);
		}
		return ResponseBuilder.fail(CodeConstant.SYS_ERR, "插入失败");
	}

	@Override
	public Response<Boolean> flowTicket(long ticketId, String userId, String operator) {
		if (StringUtils.isEmpty(userId)) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest is null");
		}
		TicketStatus ticketStatusPO = new TicketStatus();
		ticketStatusPO.setOwneruserno(userId);
		ticketStatusPO.setUpdateby(operator);
		ticketStatusPO.setUpdatetime(new Date());
		boolean result = ticketStatusBaseService.updateByTicketId(ticketStatusPO, ticketId);
		return ResponseBuilder.success(result);
	}

	@Override
	public Response<Boolean> updateTicketInfoByTicketId(TicketInfoBO ticketInfoBO, long ticketId) {
		if (ticketInfoBO == null) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest is null");
		}
		TicketInfo ticketInfoPO = new TicketInfo();
		BeanUtils.copyProperties(ticketInfoBO, ticketInfoPO);
		boolean updateByTickId = ticketInfoBaseService.updateByTickedId(ticketInfoPO, ticketId);
		return ResponseBuilder.success(updateByTickId);
	}

	@Override
	public Response<Boolean> updateTicketStatusByTicketId(TicketStatusBO ticketStatusBO, long ticketId) {
		if (ticketStatusBO == null) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest is null");
		}
		TicketStatus ticketStatusPO = new TicketStatus();
		BeanUtils.copyProperties(ticketStatusBO, ticketStatusPO);
		ticketStatusPO.setUpdatetime(new Date());
		boolean updateByTicketId = ticketStatusBaseService.updateByTicketId(ticketStatusPO, ticketId);
		return ResponseBuilder.success(updateByTicketId);
	}

	@Override
	public Response<Boolean> archiveTicket(int citicketclassid, String solution, String operator, long ticketId) {
		TicketRecord selectByTicketId = ticketRecordBaseService.selectByTicketId(ticketId);
		TicketStatus ticketStatus = ticketStatusBaseService.selectByTicketId(ticketId);
		if (ticketStatus == null) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "ticket status is null, ticketId is " + ticketId);
		}
		ticketStatus.setSolvedtime(new Date());
		ticketStatus.setUpdateby(operator);
		ticketStatus.setUpdatetime(new Date());
		ticketStatus.setStatus(TicketStatusCode.SOLVED);
		ticketStatusBaseService.updateByTicketId(ticketStatus, ticketId);
		long startTime = ticketStatus.getCreatetime().getTime();
		long responseTime = ticketStatus.getResponsetime().getTime();
		long solvedTime = ticketStatus.getSolvedtime().getTime();
		boolean add = true;
		if (selectByTicketId == null) {
			selectByTicketId = new TicketRecord();
			selectByTicketId.setCreateby(operator);
			selectByTicketId.setCreatetime(new Date());
			selectByTicketId.setTicketid(ticketId);
		} else {
			selectByTicketId.setUpdateby(operator);
			selectByTicketId.setUpdatetime(new Date());
			add = false;
		}
		selectByTicketId.setCiticketclassid(citicketclassid);
		selectByTicketId.setSolution(solution);
		selectByTicketId.setResponseduration(responseTime - startTime);
		selectByTicketId.setSolvedduration(solvedTime);
		if (add) {
			ticketRecordBaseService.add(selectByTicketId);
		} else {
			ticketRecordBaseService.updateByTicket(selectByTicketId, ticketId);
		}
		return ResponseBuilder.success(Boolean.TRUE);
	}

}
