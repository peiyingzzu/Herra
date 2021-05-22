package com.peiying.herra.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peiying.herra.bo.CategoryInfoBO;
import com.peiying.herra.bo.DepInfoBO;
import com.peiying.herra.bo.ItemInfoBO;
import com.peiying.herra.common.constants.CodeConstant;
import com.peiying.herra.common.utils.Response;
import com.peiying.herra.common.utils.ResponseBuilder;
import com.peiying.herra.po.CategoryInfo;
import com.peiying.herra.po.DepInfo;
import com.peiying.herra.po.ItemInfo;
import com.peiying.herra.po.ItemSgRelation;
import com.peiying.herra.service.DepCategoryItemService;
import com.peiying.herra.service.base.CategoryBaseService;
import com.peiying.herra.service.base.DepInfoBaseService;
import com.peiying.herra.service.base.ItemInfoBaseService;
import com.peiying.herra.service.base.ItemSgRelationBaseService;

@Service
public class DepCategoryItemServiceImpl implements DepCategoryItemService {
	@Autowired
	private DepInfoBaseService depInfoBaseService;
	@Autowired
	private CategoryBaseService categoryBaseService;
	@Autowired
	private ItemInfoBaseService itemInfoBaseService;
	@Autowired
	private ItemSgRelationBaseService itemSgRelationBaseService;

	@Override
	public Response<Boolean> addDep(DepInfoBO bo) {
		DepInfo po = new DepInfo();
		BeanUtils.copyProperties(bo, po);
		boolean add = depInfoBaseService.add(po);
		return ResponseBuilder.success(add);
	}

	@Override
	public Response<Boolean> addCategory(CategoryInfoBO bo) {
		CategoryInfo po = new CategoryInfo();
		BeanUtils.copyProperties(bo, po);
		boolean add = categoryBaseService.add(po);
		return ResponseBuilder.success(add);
	}

	@Override
	public Response<Boolean> addItem(ItemInfoBO bo, int sgId) {
		ItemInfo po = new ItemInfo();
		BeanUtils.copyProperties(bo, po);
		boolean add = itemInfoBaseService.add(po);
		if (add) {
			ItemSgRelation itemSgRelationPo = new ItemSgRelation();
			itemSgRelationPo.setCreateby(bo.getCreateby());
			itemSgRelationPo.setCreatetime(bo.getCreatetime());
			itemSgRelationPo.setItemid(bo.getId());
			itemSgRelationPo.setSgid(sgId);
			boolean add2 = itemSgRelationBaseService.add(itemSgRelationPo);
			return ResponseBuilder.success(add2);
		}
		return ResponseBuilder.fail(CodeConstant.SYS_ERR, "添加失败");
	}

}
