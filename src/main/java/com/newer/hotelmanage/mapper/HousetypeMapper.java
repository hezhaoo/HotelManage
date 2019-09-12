package com.newer.hotelmanage.mapper;


import java.util.List;

import com.newer.hotelmanage.domain.Housetype;
import org.apache.ibatis.annotations.Param;

public interface HousetypeMapper {

    int insert(Housetype record);

    int insertSelective(Housetype record);



   }