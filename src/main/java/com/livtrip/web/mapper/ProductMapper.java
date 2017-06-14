package com.livtrip.web.mapper;

import com.livtrip.web.domain.Product;
import com.livtrip.web.domain.ProductCriteria;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper extends BaseMapper<Product, ProductCriteria, Integer> {
}