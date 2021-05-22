package com.peiying.herra.mapper;

import com.peiying.herra.po.TicketInfo;
import com.peiying.herra.po.TicketInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TicketInfoMapper {
    long countByExample(TicketInfoExample example);

    int deleteByExample(TicketInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TicketInfo record);

    int insertSelective(TicketInfo record);

    List<TicketInfo> selectByExampleWithBLOBs(TicketInfoExample example);

    List<TicketInfo> selectByExample(TicketInfoExample example);

    TicketInfo selectByPrimaryKey(Long id);
    
    TicketInfo selectByTicketId(Long ticketId);

    int updateByExampleSelective(@Param("record") TicketInfo record, @Param("example") TicketInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") TicketInfo record, @Param("example") TicketInfoExample example);

    int updateByExample(@Param("record") TicketInfo record, @Param("example") TicketInfoExample example);

    int updateByPrimaryKeySelective(TicketInfo record);

    int updateByPrimaryKeyWithBLOBs(TicketInfo record);

    int updateByPrimaryKey(TicketInfo record);
}