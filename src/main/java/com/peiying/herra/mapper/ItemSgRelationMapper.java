package com.peiying.herra.mapper;

import com.peiying.herra.po.ItemSgRelation;
import com.peiying.herra.po.ItemSgRelationExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ItemSgRelationMapper {
    long countByExample(ItemSgRelationExample example);

    int deleteByExample(ItemSgRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ItemSgRelation record);

    int insertSelective(ItemSgRelation record);

    List<ItemSgRelation> selectByExample(ItemSgRelationExample example);

    ItemSgRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ItemSgRelation record, @Param("example") ItemSgRelationExample example);

    int updateByExample(@Param("record") ItemSgRelation record, @Param("example") ItemSgRelationExample example);

    int updateByPrimaryKeySelective(ItemSgRelation record);

    int updateByPrimaryKey(ItemSgRelation record);
}