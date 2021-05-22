package com.peiying.herra.service.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.peiying.herra.mapper.CategoryInfoMapper;
import com.peiying.herra.po.CategoryInfo;
import com.peiying.herra.po.CategoryInfoExample;

@Component
public class CategoryBaseService {
	@Autowired
	private CategoryInfoMapper categoryInfoMapper;

	public boolean add(CategoryInfo po) {
		try {
			return categoryInfoMapper.insertSelective(po) > 0;
		} catch (Exception e) {
			return false;
		}
	}

	public CategoryInfo selectById(int id) {
		try {
			return categoryInfoMapper.selectByPrimaryKey(id);
		} catch (Exception e) {
			return null;
		}
	}

	public List<CategoryInfo> selectByDepId(int depId) {
		CategoryInfoExample example = new CategoryInfoExample();
		example.createCriteria().andDepidEqualTo(depId);
		try {
			return categoryInfoMapper.selectByExample(example);
		} catch (Exception e) {
			return null;
		}
	}
	

}
