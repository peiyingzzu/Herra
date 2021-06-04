package com.peiying.herra.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

	@Transactional
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
			if (!add2) {
				throw new RuntimeException("添加失败， 事务回滚");
			}
			return ResponseBuilder.success(add2);
		}
		return ResponseBuilder.fail(CodeConstant.SYS_ERR, "添加失败");
	}

	@Override
	public Response<List<DepInfoBO>> getAllDepInfo() {
		List<DepInfo> all = depInfoBaseService.getAll();
		if (all == null) {
			ResponseBuilder.fail(CodeConstant.SYS_ERR, "查询失败");
		}
		List<DepInfoBO> collect = all.stream().map((a) -> {
			DepInfoBO bo = new DepInfoBO();
			BeanUtils.copyProperties(a, bo);
			return bo;
		}).collect(Collectors.toList());
		return ResponseBuilder.success(collect);
	}

	@Override
	public Response<List<CategoryInfoBO>> getAllCategoryInfoByDepId(int depId) {
		List<CategoryInfo> selectByDepId = categoryBaseService.selectByDepId(depId);
		if (selectByDepId == null) {
			return ResponseBuilder.fail(CodeConstant.SYS_ERR, "系统异常");
		}
		List<CategoryInfoBO> collect = selectByDepId.stream().map((a) -> {
			CategoryInfoBO bo = new CategoryInfoBO();
			BeanUtils.copyProperties(a, bo);
			return bo;
		}).collect(Collectors.toList());
		return ResponseBuilder.success(collect);
	}

	@Override
	public Response<List<ItemInfoBO>> getAllItemInfoByCategoryId(int categoryId) {
		List<ItemInfo> selectByCategoryId = itemInfoBaseService.selectByCategoryId(categoryId);
		if (selectByCategoryId == null) {
			return ResponseBuilder.fail(CodeConstant.SYS_ERR, "系统异常");
		}
		List<ItemInfoBO> collect = selectByCategoryId.stream().map((a) -> {
			ItemInfoBO bo = new ItemInfoBO();
			BeanUtils.copyProperties(a, bo);
			return bo;
		}).collect(Collectors.toList());
		return ResponseBuilder.success(collect);
	}
}
