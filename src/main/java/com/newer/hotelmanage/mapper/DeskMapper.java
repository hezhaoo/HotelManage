package com.newer.hotelmanage.mapper;


import java.util.List;

import com.newer.hotelmanage.domain.Desk;
import org.apache.ibatis.annotations.Param;

public interface DeskMapper {


    int deleteByPrimaryKey(Integer deskid);

    int insert(Desk record);

    int insertSelective(Desk record);

    Desk selectByPrimaryKey(Integer deskid);

    int updateByPrimaryKeySelective(Desk record);

    int updateByPrimaryKey(Desk record);
}