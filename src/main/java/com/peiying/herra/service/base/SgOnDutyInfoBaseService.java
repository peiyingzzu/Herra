package com.peiying.herra.service.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.peiying.herra.mapper.SgOnDutyInfoMapper;
import com.peiying.herra.po.SgOnDutyInfo;

@Component
public class SgOnDutyInfoBaseService {
	@Autowired
	private SgOnDutyInfoMapper sgOnDutyInfoMapper;

	public boolean add(SgOnDutyInfo po) {
		try {
			return sgOnDutyInfoMapper.insertSelective(po) > 0;
		} catch (Exception e) {
			return false;
		}
	}

	public String selectOnCallUserBySgId(int sgId) {
		try {
			return sgOnDutyInfoMapper.selectOnCallUserBySgId(sgId);
		} catch (Exception e) {
			return null;
		}
	}
}
