package com.peiying.herra.service.base;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

	public List<String> batchInsert(List<SgUserRelation> poList) {
		List<String> result = new ArrayList<>();
		for (SgUserRelation sg : poList) {
			boolean insert = insert(sg);
			if (!insert) {
				result.add(sg.getUserno());
			}
		}
		return result;
	}

	public List<Integer> selectSgIdByUser(String userNo) {
		SgUserRelationExample example = new SgUserRelationExample();
		example.createCriteria().andUsernoEqualTo(userNo);
		try {
			return sgUserRelationMapper.selectByExample(example).stream().map(SgUserRelation::getSgid)
					.collect(Collectors.toList());
		} catch (Exception e) {
			return null;
		}
	}

	public SgUserRelation selectSgIdByUserAndSgId(String userNo, int sgId) {
		SgUserRelationExample example = new SgUserRelationExample();
		example.createCriteria().andUsernoEqualTo(userNo).andSgidEqualTo(sgId);
		try {
			List<SgUserRelation> selectByExample = sgUserRelationMapper.selectByExample(example);
			if (selectByExample == null) {
				return null;
			}
			if (selectByExample.size() != 1) {
				return null;
			}
			return selectByExample.get(0);
		} catch (Exception e) {
			return null;
		}
	}

	public boolean deleteBySgIdAndUserNo(int sgId, String userNo) {
		try {
			return sgUserRelationMapper.deleteBySgIdAndUserNo(sgId, userNo) > 0;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean batchDeleteBySgIdAndUserNo(int sgId, List<String> userNoList) {
		for (String suerNo : userNoList) {
			deleteBySgIdAndUserNo(sgId, suerNo);
		}
		return true;
	}
}
