package com.newer.hotelmanage.mapper;


import java.util.List;

import com.newer.hotelmanage.domain.Rtype;
import org.apache.ibatis.annotations.Param;

public interface RtypeMapper {

    int deleteByPrimaryKey(Integer rid);

    int insert(Rtype record);

    int insertSelective(Rtype record);

    Rtype selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Rtype record);

    int updateByPrimaryKey(Rtype record);
}