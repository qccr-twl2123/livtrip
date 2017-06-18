package com.livtrip.web.mapper;

import com.livtrip.web.domain.RefPoint;
import com.livtrip.web.domain.RefPointCriteria;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RefPointMapper extends BaseMapper<RefPoint, RefPointCriteria, Integer> {
}