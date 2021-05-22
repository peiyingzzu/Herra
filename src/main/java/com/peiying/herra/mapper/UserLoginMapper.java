package com.peiying.herra.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.peiying.herra.po.UserLogin;

@Mapper
public interface UserLoginMapper {
	int add(UserLogin po);

	int updateByUserName(UserLogin po);

	int updateBySessionId(UserLogin po);

	UserLogin selectByUserName(String userName);

	UserLogin selectBySessionId(String sessionId);

}
