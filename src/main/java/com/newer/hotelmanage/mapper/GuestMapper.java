package com.newer.hotelmanage.mapper;


import java.util.List;

import com.newer.hotelmanage.domain.Guest;
import org.apache.ibatis.annotations.Param;

public interface GuestMapper {


    int deleteByPrimaryKey(Integer gid);

    int insert(Guest record);

    int insertSelective(Guest record);

    Guest selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(Guest record);

    int updateByPrimaryKey(Guest record);
}