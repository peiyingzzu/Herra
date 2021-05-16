package com.peiying.herra.mapper;

import com.peiying.herra.po.ServerGroupInfo;
import com.peiying.herra.po.ServerGroupInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ServerGroupInfoMapper {
    long countByExample(ServerGroupInfoExample example);

    int deleteByExample(ServerGroupInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ServerGroupInfo record);

    int insertSelective(ServerGroupInfo record);

    List<ServerGroupInfo> selectByExample(ServerGroupInfoExample example);

    ServerGroupInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ServerGroupInfo record, @Param("example") ServerGroupInfoExample example);

    int updateByExample(@Param("record") ServerGroupInfo record, @Param("example") ServerGroupInfoExample example);

    int updateByPrimaryKeySelective(ServerGroupInfo record);

    int updateByPrimaryKey(ServerGroupInfo record);
}