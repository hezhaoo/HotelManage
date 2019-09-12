package com.newer.hotelmanage.mapper;


import java.util.List;

import com.newer.hotelmanage.domain.Sheshi;
import org.apache.ibatis.annotations.Param;

public interface SheshiMapper {

    int deleteByPrimaryKey(Integer sid);

    int insert(Sheshi record);

    int insertSelective(Sheshi record);

    Sheshi selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Sheshi record);

    int updateByPrimaryKey(Sheshi record);
}