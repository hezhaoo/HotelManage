package com.newer.hotelmanage.mapper;


import java.util.List;

import com.newer.hotelmanage.domain.Houseimg;
import org.apache.ibatis.annotations.Param;

public interface HouseimgMapper {


    int deleteByPrimaryKey(Integer iid);

    int insert(Houseimg record);

    int insertSelective(Houseimg record);

    Houseimg selectByPrimaryKey(Integer iid);

    int updateByPrimaryKeySelective(Houseimg record);

    int updateByPrimaryKey(Houseimg record);
}