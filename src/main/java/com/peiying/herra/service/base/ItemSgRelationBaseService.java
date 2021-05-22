package com.peiying.herra.service.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.peiying.herra.mapper.ItemSgRelationMapper;
import com.peiying.herra.po.ItemSgRelation;
import com.peiying.herra.po.ItemSgRelationExample;

@Component
public class ItemSgRelationBaseService {
	@Autowired
	private ItemSgRelationMapper itemSgRelationMapper;

	public boolean add(ItemSgRelation po) {
		try {
			return itemSgRelationMapper.insertSelective(po) > 0;
		} catch (Exception e) {
			return false;
		}
	}

	public ItemSgRelation selectByItemId(int itemId) {
		ItemSgRelationExample example = new ItemSgRelationExample();
		example.createCriteria().andItemidEqualTo(itemId);
		try {
			List<ItemSgRelation> selectByExample = itemSgRelationMapper.selectByExample(example);
			if (selectByExample != null && selectByExample.size() != 1) {
				return null;
			}
			return selectByExample.get(0);

		} catch (Exception e) {
			return null;
		}
	}
	public List<ItemSgRelation> selectBySgId(int sgId) {
		ItemSgRelationExample example = new ItemSgRelationExample();
		example.createCriteria().andSgidEqualTo(sgId);
		try {
			return itemSgRelationMapper.selectByExample(example);
		} catch (Exception e) {
			return null;
		}
	}
}
