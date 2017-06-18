package com.livtrip.web.service;

import com.livtrip.web.domain.HotelProduct;

import java.util.List;

/**
 * Created by xierongli on 17/6/18.
 */
public interface HotelProductService {
    int insert(HotelProduct hotelProduct);

    int updateFlagByHotelIds(List<Integer> hotelIds);

    /**
     *
     * @name 查询flag 未采集 前50条数据
     * @return
     * @author xierongli
     * @date 2016/12/27 18:41
     */
    List<HotelProduct> queryFiftyHotelProductList();

    HotelProduct queryByHotelId(Integer hotelId);


}
