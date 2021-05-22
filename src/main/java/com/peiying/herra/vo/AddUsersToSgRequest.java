package com.peiying.herra.vo;

import java.util.List;

public class AddUsersToSgRequest extends BaseEntity {
	private Integer sgId;
	private List<String> userList;
	public Integer getSgId() {
		return sgId;
	}
	public void setSgId(Integer sgId) {
		this.sgId = sgId;
	}
	public List<String> getUserList() {
		return userList;
	}
	public void setUserList(List<String> userList) {
		this.userList = userList;
	}
	
}
