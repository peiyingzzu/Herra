package com.peiying.herra.mapper;

import com.peiying.herra.po.CategoryInfo;
import com.peiying.herra.po.CategoryInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CategoryInfoMapper {
    long countByExample(CategoryInfoExample example);

    int deleteByExample(CategoryInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CategoryInfo record);

    int insertSelective(CategoryInfo record);

    List<CategoryInfo> selectByExample(CategoryInfoExample example);

    CategoryInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CategoryInfo record, @Param("example") CategoryInfoExample example);

    int updateByExample(@Param("record") CategoryInfo record, @Param("example") CategoryInfoExample example);

    int updateByPrimaryKeySelective(CategoryInfo record);

    int updateByPrimaryKey(CategoryInfo record);
}