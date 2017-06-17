package com.livtrip.web.mapper;

import com.livtrip.web.domain.Dest;
import com.livtrip.web.domain.DestCriteria;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DestMapper extends BaseMapper<Dest, DestCriteria, Integer> {
}