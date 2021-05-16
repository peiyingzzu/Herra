package com.peiying.herra.mapper;

import com.peiying.herra.po.SgOnDutyConfig;
import com.peiying.herra.po.SgOnDutyConfigExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SgOnDutyConfigMapper {
    long countByExample(SgOnDutyConfigExample example);

    int deleteByExample(SgOnDutyConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SgOnDutyConfig record);

    int insertSelective(SgOnDutyConfig record);

    List<SgOnDutyConfig> selectByExample(SgOnDutyConfigExample example);

    SgOnDutyConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SgOnDutyConfig record, @Param("example") SgOnDutyConfigExample example);

    int updateByExample(@Param("record") SgOnDutyConfig record, @Param("example") SgOnDutyConfigExample example);

    int updateByPrimaryKeySelective(SgOnDutyConfig record);

    int updateByPrimaryKey(SgOnDutyConfig record);
}