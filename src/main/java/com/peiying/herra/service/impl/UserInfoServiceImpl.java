package com.peiying.herra.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peiying.herra.bo.UserInfoBO;
import com.peiying.herra.mapper.UserInfoMapper;
import com.peiying.herra.po.UserInfo;
import com.peiying.herra.po.UserInfoExample;

@Service
public class UserInfoServiceImpl implements com.peiying.herra.service.UserInfoService {
@Autowired
private UserInfoMapper userInfoMapper;
	public boolean addUser(UserInfoBO userInfoBO) {
		UserInfo user = new UserInfo();
		BeanUtils.copyProperties(userInfoBO, user, UserInfo.class);
		try {
		return userInfoMapper.insertSelective(user) > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public UserInfo getUserByUserNO(String userNO) {
		UserInfoExample example = new UserInfoExample();
		example.createCriteria().andUsernoEqualTo(userNO);
		List<UserInfo> list = userInfoMapper.selectByExample(example);
		if (list == null || list.isEmpty()) {
			return null;
		}
		if (list.size() > 1) {
			System.out.println("Error ! query user by userNO return more than 1 result ww");
			return null;
		}
		return list.get(0);
	}
}
