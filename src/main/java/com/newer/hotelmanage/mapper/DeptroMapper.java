package com.newer.hotelmanage.mapper;

import java.util.List;

import com.newer.hotelmanage.domain.Deptro;
import org.apache.ibatis.annotations.Param;

public interface DeptroMapper {


    int deleteByPrimaryKey(Integer deptno);

    int insert(Deptro record);

    int insertSelective(Deptro record);



    Deptro selectByPrimaryKey(Integer deptno);



    int updateByPrimaryKeySelective(Deptro record);

    int updateByPrimaryKey(Deptro record);
}