package com.peiying.herra.service.base;

import java.util.List;

import org.springframework.stereotype.Component;

import com.peiying.herra.mapper.ItemInfoMapper;
import com.peiying.herra.po.ItemInfo;
import com.peiying.herra.po.ItemInfoExample;

@Component
public class ItemInfoBaseService {
	private ItemInfoMapper itemInfoMapper;

	public boolean add(ItemInfo po) {
		try {
			return itemInfoMapper.insertSelective(po) > 0;
		} catch (Exception e) {
			return false;
		}
	}

	public ItemInfo selectById(int id) {
		try {
			return itemInfoMapper.selectByPrimaryKey(id);
		} catch (Exception e) {
			return null;
		}
	}

	public List<ItemInfo> selectByCategoryId(int categoryId) {
		try {
			ItemInfoExample example = new ItemInfoExample();
			example.createCriteria().andCategoryidEqualTo(categoryId);
			return itemInfoMapper.selectByExample(example);
		} catch (Exception e) {
			return null;
		}
	}
}
