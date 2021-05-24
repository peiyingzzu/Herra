package com.peiying.herra.service;

import java.util.List;

import com.peiying.herra.bo.CategoryInfoBO;
import com.peiying.herra.bo.DepInfoBO;
import com.peiying.herra.bo.ItemInfoBO;
import com.peiying.herra.common.utils.Response;

public interface DepCategoryItemService {

	public Response<Boolean> addDep(DepInfoBO bo);

	public Response<Boolean> addCategory(CategoryInfoBO bo);

	public Response<Boolean> addItem(ItemInfoBO bo, int sgId);

	public Response<List<DepInfoBO>> getAllDepInfo();

	public Response<List<CategoryInfoBO>> getAllCategoryInfoByDepId(int depId);
	
	public Response<List<ItemInfoBO>> getAllItemInfoByCategoryId(int categoryId);

}
