package com.newer.hotelmanage.mapper;


import java.util.List;

import com.newer.hotelmanage.domain.Companyintroduce;
import org.apache.ibatis.annotations.Param;

public interface CompanyintroduceMapper {

    int deleteByPrimaryKey(Integer comid);

    int insert(Companyintroduce record);

    int insertSelective(Companyintroduce record);

    Companyintroduce selectByPrimaryKey(Integer comid);

    int updateByPrimaryKeySelective(Companyintroduce record);

    int updateByPrimaryKey(Companyintroduce record);
}