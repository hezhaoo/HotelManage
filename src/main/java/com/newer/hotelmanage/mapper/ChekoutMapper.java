package com.newer.hotelmanage.mapper;


import java.util.List;

import com.newer.hotelmanage.domain.Chekout;
import org.apache.ibatis.annotations.Param;

public interface ChekoutMapper {


    int deleteByPrimaryKey(Integer chid);

    int insert(Chekout record);

    int insertSelective(Chekout record);


    Chekout selectByPrimaryKey(Integer chid);



    int updateByPrimaryKeySelective(Chekout record);

    int updateByPrimaryKey(Chekout record);
}