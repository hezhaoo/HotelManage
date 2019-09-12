package com.newer.hotelmanage.mapper;


import java.util.List;

import com.newer.hotelmanage.domain.Emple;
import org.apache.ibatis.annotations.Param;

public interface EmpleMapper {


    int deleteByPrimaryKey(Integer empno);

    int insert(Emple record);

    int insertSelective(Emple record);

    Emple selectByPrimaryKey(Integer empno);

    int updateByPrimaryKeySelective(Emple record);

    int updateByPrimaryKey(Emple record);
}