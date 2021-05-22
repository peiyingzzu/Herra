package com.peiying.herra.service.base;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.peiying.herra.mapper.SgUserRelationMapper;
import com.peiying.herra.po.SgUserRelation;
import com.peiying.herra.po.SgUserRelationExample;

@Component
public class SgUserRelationBaseService {
	@Autowired
	private SgUserRelationMapper sgUserRelationMapper;

	public boolean insert(SgUserRelation po) {
		try {
			return sgUserRelationMapper.insertSelective(po) > 0;
		} catch (Exception e) {
			return false;
		}
	}

	public List<SgUserRelation> batchInsert(List<SgUserRelation> poList) {
		List<SgUserRelation> result = new ArrayList<>();
		for (SgUserRelation sg : poList) {
			boolean insert = insert(sg);
			if (!insert) {
				result.add(sg);
			}
		}
		return result;
	}

	public Integer selectSgIdByUser(String userNo) {
		SgUserRelationExample example = new SgUserRelationExample();
		example.createCriteria().andUsernoEqualTo(userNo);
		try {
			List<SgUserRelation> selectByExample = sgUserRelationMapper.selectByExample(example);
			if (selectByExample != null && selectByExample.size() != 1) {
				return null;
			}
			return selectByExample.get(0).getSgid();
		} catch (Exception e) {
			return null;
		}
	}
}
