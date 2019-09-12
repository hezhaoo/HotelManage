package com.newer.hotelmanage.mapper;


import java.util.List;

import com.newer.hotelmanage.domain.House;
import org.apache.ibatis.annotations.Param;

public interface HouseMapper {

    int deleteByPrimaryKey(Integer hid);

    int insert(House record);

    int insertSelective(House record);

    House selectByPrimaryKey(Integer hid);



    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);
}