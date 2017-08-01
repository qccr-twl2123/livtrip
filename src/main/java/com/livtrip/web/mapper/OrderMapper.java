package com.livtrip.web.mapper;

import com.livtrip.web.domain.Order;
import com.livtrip.web.domain.OrderCriteria;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Order, OrderCriteria, Integer> {
}