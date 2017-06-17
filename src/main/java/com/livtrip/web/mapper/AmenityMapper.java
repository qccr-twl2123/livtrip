package com.livtrip.web.mapper;

import com.livtrip.web.domain.Amenity;
import com.livtrip.web.domain.AmenityCriteria;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AmenityMapper extends BaseMapper<Amenity, AmenityCriteria, Integer> {
}