package com.newer.hotelmanage.mapper;


import java.util.List;

import com.newer.hotelmanage.domain.Dish;
import org.apache.ibatis.annotations.Param;

public interface DishMapper {


    int deleteByPrimaryKey(Integer dishid);

    int insert(Dish record);

    int insertSelective(Dish record);

    Dish selectByPrimaryKey(Integer dishid);

    int updateByPrimaryKeySelective(Dish record);

    int updateByPrimaryKey(Dish record);
}