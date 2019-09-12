package com.newer.hotelmanage.mapper;


import java.util.List;

import com.newer.hotelmanage.domain.Galleryimg;
import org.apache.ibatis.annotations.Param;

public interface GalleryimgMapper {

    int deleteByPrimaryKey(Integer yid);

    int insert(Galleryimg record);

    int insertSelective(Galleryimg record);

    Galleryimg selectByPrimaryKey(Integer yid);

    int updateByPrimaryKeySelective(Galleryimg record);

    int updateByPrimaryKey(Galleryimg record);
}