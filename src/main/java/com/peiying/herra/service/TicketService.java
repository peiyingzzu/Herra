package com.peiying.herra.service;

import com.peiying.herra.bo.TicketInfoBO;
import com.peiying.herra.bo.TicketStatusBO;
import com.peiying.herra.common.utils.Response;

public interface TicketService {
	public Response<Boolean> createTicket(TicketInfoBO ticketInfoBO, TicketStatusBO ticketStatusBO);

	public Response<Boolean> flowTicket(long ticketId, String userId, String operator);

	public Response<Boolean> updateTicketInfoByTicketId(TicketInfoBO ticketInfoBO, long ticketId);

	public Response<Boolean> updateTicketStatusByTicketId(TicketStatusBO ticketStatusBO, long ticketId);
	
	public Response<Boolean> archiveTicket(int citicketclassid, String solution, String operator, long ticketId);

}
