package com.peiying.herra.mapper;

import com.peiying.herra.po.TicketRecord;
import com.peiying.herra.po.TicketRecordExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TicketRecordMapper {
    long countByExample(TicketRecordExample example);

    int deleteByExample(TicketRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TicketRecord record);

    int insertSelective(TicketRecord record);

    List<TicketRecord> selectByExampleWithBLOBs(TicketRecordExample example);

    List<TicketRecord> selectByExample(TicketRecordExample example);

    TicketRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TicketRecord record, @Param("example") TicketRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") TicketRecord record, @Param("example") TicketRecordExample example);

    int updateByExample(@Param("record") TicketRecord record, @Param("example") TicketRecordExample example);

    int updateByPrimaryKeySelective(TicketRecord record);

    int updateByPrimaryKeyWithBLOBs(TicketRecord record);

    int updateByPrimaryKey(TicketRecord record);
}