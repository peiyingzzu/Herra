package com.peiying.herra.vo;

public class GetItemListRequest extends BaseEntity {
	private static final long serialVersionUID = 1L;
	private Integer categoryId;

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

}
