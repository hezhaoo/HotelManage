package com.newer.hotelmanage.mapper;


import java.util.List;

import com.newer.hotelmanage.domain.Deskbill;
import org.apache.ibatis.annotations.Param;

public interface DeskbillMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(Deskbill record);

    int insertSelective(Deskbill record);

    Deskbill selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Deskbill record);

    int updateByPrimaryKey(Deskbill record);
}