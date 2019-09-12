package com.newer.hotelmanage.mapper;


import java.util.List;

import com.newer.hotelmanage.domain.Engage;
import org.apache.ibatis.annotations.Param;

public interface EngageMapper {

    int deleteByPrimaryKey(Integer enid);

    int insert(Engage record);

    int insertSelective(Engage record);

    Engage selectByPrimaryKey(Integer enid);

    int updateByPrimaryKeySelective(Engage record);

    int updateByPrimaryKey(Engage record);
}