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
import com.peiying.herra.po.TicketStatus;
import com.peiying.herra.service.TicketService;
import com.peiying.herra.service.base.TicketInfoBaseService;
import com.peiying.herra.service.base.TicketStatusBaseService;

@Service
public class TicketServiceImpl implements TicketService {
	@Autowired
	private TicketInfoBaseService ticketInfoBaseService;
	@Autowired
	private TicketStatusBaseService ticketStatusBaseService;

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

}
