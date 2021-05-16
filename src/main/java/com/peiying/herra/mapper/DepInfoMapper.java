package com.peiying.herra.mapper;

import com.peiying.herra.po.DepInfo;
import com.peiying.herra.po.DepInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface DepInfoMapper {
    long countByExample(DepInfoExample example);

    int deleteByExample(DepInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DepInfo record);

    int insertSelective(DepInfo record);

    List<DepInfo> selectByExample(DepInfoExample example);

    DepInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DepInfo record, @Param("example") DepInfoExample example);

    int updateByExample(@Param("record") DepInfo record, @Param("example") DepInfoExample example);

    int updateByPrimaryKeySelective(DepInfo record);

    int updateByPrimaryKey(DepInfo record);
}