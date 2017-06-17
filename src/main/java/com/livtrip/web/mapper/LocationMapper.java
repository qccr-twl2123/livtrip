package com.livtrip.web.mapper;

import com.livtrip.web.domain.Location;
import com.livtrip.web.domain.LocationCriteria;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LocationMapper extends BaseMapper<Location, LocationCriteria, Integer> {
}