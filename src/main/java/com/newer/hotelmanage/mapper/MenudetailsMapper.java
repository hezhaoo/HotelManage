package com.newer.hotelmanage.mapper;


import java.util.List;

import com.newer.hotelmanage.domain.Menudetails;
import org.apache.ibatis.annotations.Param;

public interface MenudetailsMapper {


    int insert(Menudetails record);

    int insertSelective(Menudetails record);


}