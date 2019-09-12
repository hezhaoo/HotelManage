package com.newer.hotelmanage.mapper;


import java.util.List;

import com.newer.hotelmanage.domain.Reservetable;
import org.apache.ibatis.annotations.Param;

public interface ReservetableMapper {


    int deleteByPrimaryKey(Integer rtId);

    int insert(Reservetable record);

    int insertSelective(Reservetable record);

    Reservetable selectByPrimaryKey(Integer rtId);

    int updateByPrimaryKeySelective(Reservetable record);

    int updateByPrimaryKey(Reservetable record);
}