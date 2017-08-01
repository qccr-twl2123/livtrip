package com.livtrip.web.mapper;

import com.livtrip.web.domain.PaySerial;
import com.livtrip.web.domain.PaySerialCriteria;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaySerialMapper extends BaseMapper<PaySerial, PaySerialCriteria, Integer> {
}