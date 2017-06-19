package com.livtrip.web.mapper;

import com.livtrip.web.domain.Product;
import com.livtrip.web.domain.ProductCriteria;
import com.livtrip.web.model.dto.HotelProductDTO;
import com.livtrip.web.model.query.HotelProductQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper extends BaseMapper<Product, ProductCriteria, Integer> {

    List<HotelProductDTO>  queryHotelProduct();

    HotelProductDTO getHotelProductById(Integer productId);

    List<HotelProductDTO> queryProductByHotelIds(List<Integer> hotelIds);

    List<HotelProductDTO> queryHotelProductByReq(HotelProductQuery hotelProductQuery);
}