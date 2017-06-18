package com.livtrip.web.mapper;

import com.livtrip.web.domain.HotelProduct;
import com.livtrip.web.domain.HotelProductCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HotelProductMapper extends BaseMapper<HotelProduct, HotelProductCriteria, Integer> {

    int updateFlagByHotelIds(@Param("hotelIds") List<Integer> hotelIds);

    List<HotelProduct> queryFiftyHotelProductList();
}