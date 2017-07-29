package com.livtrip.web.mapper;

import com.livtrip.web.domain.InvokeLog;
import com.livtrip.web.domain.InvokeLogCriteria;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InvokeLogMapper extends BaseMapper<InvokeLog, InvokeLogCriteria, Integer> {
}