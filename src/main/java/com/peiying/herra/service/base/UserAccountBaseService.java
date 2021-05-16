package com.peiying.herra.service.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.peiying.herra.mapper.UserAccountInfoMapper;
import com.peiying.herra.po.AccountInfo;

@Component
public class UserAccountBaseService {
	@Autowired
	private UserAccountInfoMapper userAccountInfoMapper;

	public boolean add(AccountInfo po) {
		try {
			return userAccountInfoMapper.add(po) > 0;
		} catch (Exception e) {
			return false;
		}
	}
}
