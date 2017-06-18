package com.livtrip.web.service;

import com.livtrip.web.domain.Amenity;

import java.util.List;

/**
 * Created by xierongli on 17/6/18.
 */
public interface AmenityService {

    int insert(Amenity amenity);

    List<Amenity> queryForList(Integer productId);


}
