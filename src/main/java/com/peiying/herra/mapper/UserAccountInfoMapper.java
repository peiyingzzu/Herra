package com.peiying.herra.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.peiying.herra.po.AccountInfo;

@Mapper
public interface UserAccountInfoMapper {
	int add(AccountInfo accountInfo);

	AccountInfo selectByUserNameAndPassword(@Param("userName") String userName, @Param("password") String password);
}
