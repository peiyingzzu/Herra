package com.peiying.herra.mapper;

import com.peiying.herra.po.CiTicketClassInfo;
import com.peiying.herra.po.CiTicketClassInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CiTicketClassInfoMapper {
    long countByExample(CiTicketClassInfoExample example);

    int deleteByExample(CiTicketClassInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CiTicketClassInfo record);

    int insertSelective(CiTicketClassInfo record);

    List<CiTicketClassInfo> selectByExampleWithBLOBs(CiTicketClassInfoExample example);

    List<CiTicketClassInfo> selectByExample(CiTicketClassInfoExample example);

    CiTicketClassInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CiTicketClassInfo record, @Param("example") CiTicketClassInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") CiTicketClassInfo record, @Param("example") CiTicketClassInfoExample example);

    int updateByExample(@Param("record") CiTicketClassInfo record, @Param("example") CiTicketClassInfoExample example);

    int updateByPrimaryKeySelective(CiTicketClassInfo record);

    int updateByPrimaryKeyWithBLOBs(CiTicketClassInfo record);

    int updateByPrimaryKey(CiTicketClassInfo record);
}