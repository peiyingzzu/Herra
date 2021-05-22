package com.peiying.herra.service.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.peiying.herra.mapper.SgOnDutyConfigMapper;
import com.peiying.herra.po.SgOnDutyConfig;
import com.peiying.herra.po.SgOnDutyConfigExample;

@Component
public class SgOnDutyConfigBaseService {
	@Autowired
	private SgOnDutyConfigMapper sgOnDutyConfigMapper;

	public boolean add(SgOnDutyConfig po) {
		try {
			return sgOnDutyConfigMapper.insertSelective(po) > 0;
		} catch (Exception e) {
			return false;
		}
	}

	public SgOnDutyConfig selectBySgId(int sgId) {
		SgOnDutyConfigExample example = new SgOnDutyConfigExample();
		example.createCriteria().andSgidEqualTo(sgId);
		try {
			List<SgOnDutyConfig> selectByExample = sgOnDutyConfigMapper.selectByExample(example);
			if (selectByExample != null && selectByExample.size() != 1) {
				return null;
			}
			return selectByExample.get(0);
		} catch (Exception e) {
			return null;
		}
	}
}
