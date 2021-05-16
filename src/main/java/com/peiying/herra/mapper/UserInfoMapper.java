package com.peiying.herra.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.peiying.herra.po.UserInfo;
import com.peiying.herra.po.UserInfoExample;

@Mapper
public interface UserInfoMapper {
	long countByExample(UserInfoExample example);

	int deleteByExample(UserInfoExample example);

	int deleteByPrimaryKey(Long id);

	int insert(UserInfo record);

	int insertSelective(UserInfo record);

	List<UserInfo> selectByExample(UserInfoExample example);

	UserInfo selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

	int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

	int updateByPrimaryKeySelective(UserInfo record);

	int updateByPrimaryKey(UserInfo record);

	List<String> getSequenceUserNo(String userNo);

}