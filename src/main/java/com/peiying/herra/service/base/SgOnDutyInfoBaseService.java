package com.peiying.herra.service.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.peiying.herra.mapper.SgOnDutyInfoMapper;
import com.peiying.herra.po.SgOnDutyInfo;
import com.peiying.herra.po.SgOnDutyInfoExample;

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

	public SgOnDutyInfo selectOnCallUserBySgId(int sgId) {
		try {
			return sgOnDutyInfoMapper.selectOnCallUserBySgId(sgId);
		} catch (Exception e) {
			return null;
		}
	}

	public SgOnDutyInfo selectBySgIdAndUserNo(int sgId, String userNo) {
		SgOnDutyInfoExample example = new SgOnDutyInfoExample();
		example.createCriteria().andSgidEqualTo(sgId).andUsernoEqualTo(userNo);
		try {
			List<SgOnDutyInfo> selectByExample = sgOnDutyInfoMapper.selectByExample(example);
			if (selectByExample.size() != 1) {
				return null;
			}
			return selectByExample.get(0);
		} catch (Exception e) {
			return null;
		}
	}

	public boolean updateById(SgOnDutyInfo record, int id) {
		record.setId(id);
		try {
			return sgOnDutyInfoMapper.updateByPrimaryKey(record) > 0;
		} catch (Exception e) {
			return false;
		}
	}
}
