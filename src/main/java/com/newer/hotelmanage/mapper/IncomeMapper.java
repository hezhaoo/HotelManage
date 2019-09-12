package com.newer.hotelmanage.mapper;


import java.util.List;

import com.newer.hotelmanage.domain.Income;
import org.apache.ibatis.annotations.Param;

public interface IncomeMapper {


    int deleteByPrimaryKey(Integer inid);

    int insert(Income record);

    int insertSelective(Income record);

    Income selectByPrimaryKey(Integer inid);

    int updateByPrimaryKeySelective(Income reord);

    int updateByPrimaryKey(Income record);
}