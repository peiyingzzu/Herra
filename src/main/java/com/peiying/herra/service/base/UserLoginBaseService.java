package com.peiying.herra.service.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.peiying.herra.mapper.UserLoginMapper;
import com.peiying.herra.po.UserLogin;

@Component
public class UserLoginBaseService {
	@Autowired
	private UserLoginMapper userLoginMapper;

	public boolean add(UserLogin po) {
		try {
			return userLoginMapper.add(po) > 0;
		} catch (Exception e) {
			return false;
		}
	}

	public UserLogin selectByUserNo(String userNo) {
		try {
			return userLoginMapper.selectByUserName(userNo);
		} catch (Exception e) {
			return null;
		}
	}

	public boolean updateByUserNo(UserLogin po) {
		try {
			return userLoginMapper.updateByUserName(po) > 0;
		} catch (Exception e) {
			return false;
		}
	}
}
