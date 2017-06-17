package com.livtrip.web.mapper;

import com.livtrip.web.domain.Description;
import com.livtrip.web.domain.DescriptionCriteria;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DescriptionMapper extends BaseMapper<Description, DescriptionCriteria, Integer> {
}