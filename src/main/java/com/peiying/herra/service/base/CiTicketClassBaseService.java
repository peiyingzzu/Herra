package com.peiying.herra.service.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.peiying.herra.mapper.CiTicketClassInfoMapper;
import com.peiying.herra.po.CiTicketClassInfo;
import com.peiying.herra.po.CiTicketClassInfoExample;

@Component
public class CiTicketClassBaseService {
	@Autowired
	private CiTicketClassInfoMapper ciTicketClassInfoMapper;

	public boolean add(CiTicketClassInfo po) {
		try {
			return ciTicketClassInfoMapper.insertSelective(po) > 0;
		} catch (Exception e) {
			return false;
		}
	}

	public CiTicketClassInfo selectById(long id) {
		try {
			return ciTicketClassInfoMapper.selectByPrimaryKey(id);
		} catch (Exception e) {
			return null;
		}
	}

	public List<CiTicketClassInfo> selectByClassnum(int classNum) {
		CiTicketClassInfoExample example = new CiTicketClassInfoExample();
		example.createCriteria().andClassnumEqualTo(classNum);
		try {
			return ciTicketClassInfoMapper.selectByExample(example);
		} catch (Exception e) {
			return null;
		}
	}
}
