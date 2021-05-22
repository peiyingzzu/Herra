package com.peiying.herra.service.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.peiying.herra.mapper.TicketStatusMapper;
import com.peiying.herra.po.TicketStatus;
import com.peiying.herra.po.TicketStatusExample;
import com.peiying.herra.po.TicketStatusExample.Criteria;

@Component
public class TicketStatusBaseService {
	@Autowired
	private TicketStatusMapper ticketStatusMapper;

	public boolean add(TicketStatus po) {
		try {
			return ticketStatusMapper.insertSelective(po) > 0;
		} catch (Exception e) {
			return false;
		}
	}

	public List<TicketStatus> slectByEntity(TicketStatus po) {
		TicketStatusExample example = new TicketStatusExample();
		Criteria createCriteria = example.createCriteria();
		if (po == null) {
			return null;
		}
		if (po.getCreateby() != null) {
			createCriteria.andCreatebyEqualTo(po.getCreateby());
		}
		if (po.getLevel() != null) {
			createCriteria.andLevelEqualTo(po.getLevel());
		}
		if (po.getOwneruserno() != null) {
			createCriteria.andOwnerusernoEqualTo(po.getOwneruserno());
		}
		if (po.getStatus() != null) {
			createCriteria.andStatusEqualTo(po.getStatus());
		}
		return ticketStatusMapper.selectByExample(example);
	}

	public boolean updateByTicketId(TicketStatus po, long ticketId) {
		TicketStatusExample example = new TicketStatusExample();
		example.createCriteria().andTicketidEqualTo(ticketId);
		try {
			return ticketStatusMapper.updateByExampleSelective(po, example) > 0;
		} catch (Exception e) {
			return false;
		}
	}
}
