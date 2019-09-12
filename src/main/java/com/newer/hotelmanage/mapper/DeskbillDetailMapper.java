package com.newer.hotelmanage.mapper;


import java.util.List;

import com.newer.hotelmanage.domain.DeskbillDetail;
import org.apache.ibatis.annotations.Param;

public interface DeskbillDetailMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(DeskbillDetail record);

    int insertSelective(DeskbillDetail record);

    DeskbillDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DeskbillDetail record);

    int updateByPrimaryKey(DeskbillDetail record);
}