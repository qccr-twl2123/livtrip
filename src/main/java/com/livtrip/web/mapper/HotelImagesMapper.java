package com.livtrip.web.mapper;

import com.livtrip.web.domain.HotelImages;
import com.livtrip.web.domain.HotelImagesCriteria;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HotelImagesMapper extends BaseMapper<HotelImages, HotelImagesCriteria, Integer> {
}