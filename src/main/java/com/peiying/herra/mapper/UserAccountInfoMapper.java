package com.peiying.herra.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.peiying.herra.po.AccountInfo;
@Mapper
public interface UserAccountInfoMapper {
	int add(AccountInfo accountInfo);
}
