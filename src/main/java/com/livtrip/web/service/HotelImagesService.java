package com.livtrip.web.service;

import com.livtrip.web.domain.HotelImages;

import java.util.List;

/**
 * Created by xierongli on 17/6/18.
 */
public interface HotelImagesService {

    int insert(HotelImages hotelImages);




    List<HotelImages> queryForList(Integer productId);
}
