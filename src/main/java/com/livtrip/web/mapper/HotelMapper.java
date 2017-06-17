package com.livtrip.web.mapper;

import com.livtrip.web.domain.Hotel;
import com.livtrip.web.domain.HotelCriteria;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HotelMapper extends BaseMapper<Hotel, HotelCriteria, Integer> {
}