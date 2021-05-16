package com.peiying.herra.mapper;

import com.peiying.herra.po.TicketStatus;
import com.peiying.herra.po.TicketStatusExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TicketStatusMapper {
    long countByExample(TicketStatusExample example);

    int deleteByExample(TicketStatusExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TicketStatus record);

    int insertSelective(TicketStatus record);

    List<TicketStatus> selectByExample(TicketStatusExample example);

    TicketStatus selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TicketStatus record, @Param("example") TicketStatusExample example);

    int updateByExample(@Param("record") TicketStatus record, @Param("example") TicketStatusExample example);

    int updateByPrimaryKeySelective(TicketStatus record);

    int updateByPrimaryKey(TicketStatus record);
}