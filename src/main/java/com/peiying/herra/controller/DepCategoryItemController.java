package com.peiying.herra.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peiying.herra.bo.CategoryInfoBO;
import com.peiying.herra.bo.DepInfoBO;
import com.peiying.herra.bo.ItemInfoBO;
import com.peiying.herra.common.constants.CodeConstant;
import com.peiying.herra.common.utils.Response;
import com.peiying.herra.common.utils.ResponseBuilder;
import com.peiying.herra.service.DepCategoryItemService;
import com.peiying.herra.vo.BaseEntity;
import com.peiying.herra.vo.CategoryInfoVO;
import com.peiying.herra.vo.DepInfoVO;
import com.peiying.herra.vo.GetCategoryListRequest;
import com.peiying.herra.vo.GetItemListRequest;
import com.peiying.herra.vo.ItemInfoVO;

@RestController
@RequestMapping("/herra/ci")
public class DepCategoryItemController {
	@Autowired
	private DepCategoryItemService depCategoryItemService;

	@RequestMapping("/add/dep")
	public Response<Boolean> add(@RequestBody DepInfoVO depInfoVO) {
		if (depInfoVO == null) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest is null");
		}
		if (StringUtils.isAnyEmpty(depInfoVO.getName())) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest is null");
		}
		try {
			DepInfoBO bo = new DepInfoBO();
			BeanUtils.copyProperties(depInfoVO, bo);
			return depCategoryItemService.addDep(bo);
		} catch (Exception e) {
			return ResponseBuilder.fail(CodeConstant.SYS_ERR, "系统异常");
		}
	}

	@RequestMapping("/add/category")
	public Response<Boolean> addUsers(@RequestBody CategoryInfoVO categoryInfoVO) {
		if (categoryInfoVO == null) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest is null");
		}
		if (categoryInfoVO.getDepid() == null || categoryInfoVO.getName() == null
				|| categoryInfoVO.getName().length() <= 0) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest exist field is null");
		}
		try {
			CategoryInfoBO bo = new CategoryInfoBO();
			BeanUtils.copyProperties(categoryInfoVO, bo);
			return depCategoryItemService.addCategory(bo);
		} catch (Exception e) {
			return ResponseBuilder.fail(CodeConstant.SYS_ERR, "系统异常");
		}
	}

	@RequestMapping("/add/item")
	public Response<Boolean> addUsers(@RequestBody ItemInfoVO itemInfoVO) {
		if (itemInfoVO == null) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest is null");
		}
		if (itemInfoVO.getCategoryid() == null || itemInfoVO.getSgId() == null) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest exist field is null");
		}
		if (itemInfoVO.getName() == null || itemInfoVO.getName().length() <= 0) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest exist field is null");
		}
		try {
			ItemInfoBO bo = new ItemInfoBO();
			BeanUtils.copyProperties(itemInfoVO, bo);
			return depCategoryItemService.addItem(bo, itemInfoVO.getSgId());
		} catch (Exception e) {
			return ResponseBuilder.fail(CodeConstant.SYS_ERR, "系统异常");
		}
	}

	@RequestMapping("/get/depList")
	public Response<List<DepInfoVO>> getDepList(@RequestBody BaseEntity vo) {
		Response<List<DepInfoBO>> allDepInfo = depCategoryItemService.getAllDepInfo();
		List<DepInfoBO> data = allDepInfo.getData();
		if (data == null) {
			return ResponseBuilder.fail(CodeConstant.SYS_ERR, "系统异常");
		}
		try {
			List<DepInfoVO> collect = data.stream().map((a) -> {
				DepInfoVO voTemp = new DepInfoVO();
				BeanUtils.copyProperties(a, voTemp);
				return voTemp;
			}).collect(Collectors.toList());
			return ResponseBuilder.success(collect);
		} catch (Exception e) {
			return ResponseBuilder.fail(CodeConstant.SYS_ERR, "系统异常");
		}
	}

	@RequestMapping("/get/categoryList")
	public Response<List<CategoryInfoVO>> getCategoryList(@RequestBody GetCategoryListRequest vo) {
		if (vo == null) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest is null");
		}
		if (vo.getDepId() == null) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest exits field is null");
		}
		Response<List<CategoryInfoBO>> allDepInfoByDepId = depCategoryItemService
				.getAllCategoryInfoByDepId(vo.getDepId());
		if (allDepInfoByDepId == null || allDepInfoByDepId.getData() == null) {
			return ResponseBuilder.fail(CodeConstant.SYS_ERR, "系统异常");
		}
		List<CategoryInfoBO> data = allDepInfoByDepId.getData();
		try {
			List<CategoryInfoVO> collect = data.stream().map((a) -> {
				CategoryInfoVO voTemp = new CategoryInfoVO();
				BeanUtils.copyProperties(a, voTemp);
				return voTemp;
			}).collect(Collectors.toList());
			return ResponseBuilder.success(collect);
		} catch (Exception e) {
			return ResponseBuilder.fail(CodeConstant.SYS_ERR, "系统异常");
		}
	}

	@RequestMapping("/get/itemList")
	public Response<List<ItemInfoVO>> getItemList(@RequestBody GetItemListRequest vo) {
		if (vo == null) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest is null");
		}
		if (vo.getCategoryId() == null) {
			return ResponseBuilder.fail(CodeConstant.BAD_REQUEST, "requrest exits field is null");
		}
		Response<List<ItemInfoBO>> allItemInfoByCategoryId = depCategoryItemService
				.getAllItemInfoByCategoryId(vo.getCategoryId());
		if (allItemInfoByCategoryId == null || allItemInfoByCategoryId.getData() == null) {
			return ResponseBuilder.fail(CodeConstant.SYS_ERR, "系统异常");
		}
		List<ItemInfoBO> data = allItemInfoByCategoryId.getData();
		try {
			List<ItemInfoVO> collect = data.stream().map((a) -> {
				ItemInfoVO voTemp = new ItemInfoVO();
				BeanUtils.copyProperties(a, voTemp);
				return voTemp;
			}).collect(Collectors.toList());
			return ResponseBuilder.success(collect);
		} catch (Exception e) {
			return ResponseBuilder.fail(CodeConstant.SYS_ERR, "系统异常");
		}
	}

}
