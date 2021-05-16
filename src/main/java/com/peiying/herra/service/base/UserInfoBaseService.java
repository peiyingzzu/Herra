package com.peiying.herra.service.base;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.peiying.herra.bo.UserInfoBO;
import com.peiying.herra.mapper.UserInfoMapper;
import com.peiying.herra.po.UserInfo;
import com.peiying.herra.po.UserInfoExample;

@Component
public class UserInfoBaseService {
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
			System.out.println("Error ! query user by userNO return more than 1 result");
			return null;
		}
		return list.get(0);
	}

	public UserInfo getUserByPhone(String phone) {
		UserInfoExample example = new UserInfoExample();
		example.createCriteria().andPhoneEqualTo(phone);
		List<UserInfo> list = userInfoMapper.selectByExample(example);
		if (list == null || list.isEmpty()) {
			return null;
		}
		if (list.size() > 1) {
			System.out.println("Error ! query user by userNO return more than 1 result");
			return null;
		}
		return list.get(0);

	}

	public List<String> getSequenceUserNo(String userNO) {
		List<String> list = userInfoMapper.getSequenceUserNo(userNO);
		if (list == null) {
			return null;
		}
		return list;
	}
}
