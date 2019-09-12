package com.newer.hotelmanage.mapper;


import java.util.List;

import com.newer.hotelmanage.domain.Livein;
import org.apache.ibatis.annotations.Param;

public interface LiveinMapper {


    int deleteByPrimaryKey(Integer livid);

    int insert(Livein record);

    int insertSelective(Livein record);


    Livein selectByPrimaryKey(Integer livid);


    int updateByPrimaryKeySelective(Livein record);

    int updateByPrimaryKey(Livein record);
}