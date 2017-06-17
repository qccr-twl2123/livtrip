package com.livtrip.web.mapper;

import com.livtrip.web.domain.CityLocation;
import com.livtrip.web.domain.CityLocationCriteria;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CityLocationMapper extends BaseMapper<CityLocation, CityLocationCriteria, Integer> {
}