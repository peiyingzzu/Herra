package com.peiying.herra.mapper;

import com.peiying.herra.po.SgOnDutyInfo;
import com.peiying.herra.po.SgOnDutyInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SgOnDutyInfoMapper {
    long countByExample(SgOnDutyInfoExample example);

    int deleteByExample(SgOnDutyInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SgOnDutyInfo record);

    int insertSelective(SgOnDutyInfo record);

    List<SgOnDutyInfo> selectByExample(SgOnDutyInfoExample example);

    SgOnDutyInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SgOnDutyInfo record, @Param("example") SgOnDutyInfoExample example);

    int updateByExample(@Param("record") SgOnDutyInfo record, @Param("example") SgOnDutyInfoExample example);

    int updateByPrimaryKeySelective(SgOnDutyInfo record);

    int updateByPrimaryKey(SgOnDutyInfo record);
    
    SgOnDutyInfo selectOnCallUserBySgId(int sgId);
}