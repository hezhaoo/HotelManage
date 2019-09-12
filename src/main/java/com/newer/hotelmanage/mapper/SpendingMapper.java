package com.newer.hotelmanage.mapper;


import java.util.List;

import com.newer.hotelmanage.domain.Spending;
import org.apache.ibatis.annotations.Param;

public interface SpendingMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Spending record);

    int insertSelective(Spending record);


    Spending selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Spending record);

    int updateByPrimaryKey(Spending record);
}