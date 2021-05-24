package com.peiying.herra.service.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.peiying.herra.mapper.DepInfoMapper;
import com.peiying.herra.po.DepInfo;
import com.peiying.herra.po.DepInfoExample;

@Component
public class DepInfoBaseService {
	@Autowired
	DepInfoMapper depInfoMapper;

	public boolean add(DepInfo po) {
		try {
			return depInfoMapper.insertSelective(po) > 0;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * @return
	 */
	public List<DepInfo> getAll() {
		try {
			return depInfoMapper.selectByExample(new DepInfoExample());
		} catch (Exception e) {
			return null;
		}
	}
}
