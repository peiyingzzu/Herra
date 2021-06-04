package com.peiying.herra.mapper;

import com.peiying.herra.po.SgUserRelation;
import com.peiying.herra.po.SgUserRelationExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SgUserRelationMapper {
    long countByExample(SgUserRelationExample example);

    int deleteByExample(SgUserRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SgUserRelation record);

    int insertSelective(SgUserRelation record);

    List<SgUserRelation> selectByExample(SgUserRelationExample example);

    SgUserRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SgUserRelation record, @Param("example") SgUserRelationExample example);

    int updateByExample(@Param("record") SgUserRelation record, @Param("example") SgUserRelationExample example);

    int updateByPrimaryKeySelective(SgUserRelation record);

    int updateByPrimaryKey(SgUserRelation record);
    
	int deleteBySgIdAndUserNo(@Param("sgId") int sgId, @Param("userNo") String userNo);
}