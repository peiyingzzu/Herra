package com.peiying.herra.service.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.peiying.herra.mapper.ServerGroupInfoMapper;
import com.peiying.herra.po.ServerGroupInfo;

@Component
public class ServiceGroupBaseService {
	
	@Autowired
	private ServerGroupInfoMapper serverGroupInfoMapper;

	public boolean add(ServerGroupInfo po) {
		try {
			return serverGroupInfoMapper.insertSelective(po) > 0;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean updateById(ServerGroupInfo po) {
		try {
			return serverGroupInfoMapper.updateByPrimaryKeySelective(po) > 0;
		} catch (Exception e) {
			return false;
		}
	}

	public ServerGroupInfo selectById(int id) {
		try {
			return serverGroupInfoMapper.selectByPrimaryKey(id);
		} catch (Exception e) {
			return null;
		}
	}
}
