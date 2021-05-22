package com.peiying.herra.service.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.peiying.herra.mapper.TicketInfoMapper;
import com.peiying.herra.po.TicketInfo;
import com.peiying.herra.po.TicketInfoExample;

@Component
public class TicketInfoBaseService {
	@Autowired
	private TicketInfoMapper ticketInfoMapper;

	public boolean add(TicketInfo po) {
		try {
			return ticketInfoMapper.insertSelective(po) > 0;
		} catch (Exception e) {
			return false;
		}
	}

	public TicketInfo selectById(long id) {
		try {
			return ticketInfoMapper.selectByPrimaryKey(id);
		} catch (Exception e) {
			return null;
		}
	}

	public TicketInfo selectByTicketId(long ticketId) {
		try {
			return ticketInfoMapper.selectByTicketId(ticketId);
		} catch (Exception e) {
			return null;
		}
	}

	public List<TicketInfo> selectByItemId(int itemId) {
		TicketInfoExample example = new TicketInfoExample();
		example.createCriteria().andItemidEqualTo(itemId);
		try {
			return ticketInfoMapper.selectByExampleWithBLOBs(example);
		} catch (Exception e) {
			return null;
		}
	}

	public boolean updateByTickedId(TicketInfo po, long ticketId) {
		try {
			TicketInfo selectByTicketId = selectByTicketId(ticketId);
			if (null == selectByTicketId) {
				return false;
			}
			return ticketInfoMapper.updateByPrimaryKeySelective(po) > 0;
		} catch (Exception e) {
			return false;
		}
	}
}
