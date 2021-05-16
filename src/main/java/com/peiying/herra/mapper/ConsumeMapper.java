package com.peiying.herra.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.peiying.herra.po.Consume;
@Mapper
public interface ConsumeMapper {
	int insert(Consume consume);
	Consume loadById(int coid);
	List<Consume> selectAll();
}
