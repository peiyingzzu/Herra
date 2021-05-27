package com.peiying.herra.service;

import com.peiying.herra.bo.UserInfoBO;
import com.peiying.herra.common.utils.Response;
import com.peiying.herra.po.UserInfo;

public interface UserInfoService {

	public Response<String> addUser(UserInfoBO userInfoBO, String password);

	public Response<UserInfo> getUserByUserNO(String userNO);
}
