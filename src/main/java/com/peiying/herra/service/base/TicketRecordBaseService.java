package com.peiying.herra.service.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.peiying.herra.mapper.TicketRecordMapper;
import com.peiying.herra.po.TicketRecord;
import com.peiying.herra.po.TicketRecordExample;

@Component
public class TicketRecordBaseService {
	@Autowired
	private TicketRecordMapper ticketRecordMapper;

	public boolean add(TicketRecord po) {
		try {
			return ticketRecordMapper.insertSelective(po) > 0;
		} catch (Exception e) {
			return false;
		}
	}

	public TicketRecord selectByTicketId(long ticketId) {
		TicketRecordExample example = new TicketRecordExample();
		example.createCriteria().andTicketidEqualTo(ticketId);
		try {
			List<TicketRecord> selectByExampleWithBLOBs = ticketRecordMapper.selectByExampleWithBLOBs(example);
			if (selectByExampleWithBLOBs != null && selectByExampleWithBLOBs.size() != 1) {
				return null;
			}
			return selectByExampleWithBLOBs.get(0);
		} catch (Exception e) {
			return null;
		}
	}

	public List<TicketRecord> selectByClassicalId(int classicalId) {
		TicketRecordExample example = new TicketRecordExample();
		example.createCriteria().andCiticketclassidEqualTo(classicalId);
		try {
			return ticketRecordMapper.selectByExampleWithBLOBs(example);
		} catch (Exception e) {
			return null;
		}
	}

}
