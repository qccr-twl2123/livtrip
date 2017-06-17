package com.livtrip.web.mapper;

import com.livtrip.web.domain.City;
import com.livtrip.web.domain.CityCriteria;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CityMapper extends BaseMapper<City, CityCriteria, Integer> {
}