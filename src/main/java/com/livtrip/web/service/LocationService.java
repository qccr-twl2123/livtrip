package com.livtrip.web.service;

import com.livtrip.web.domain.Location;

import java.util.List;

/**
 * Created by xierongli on 17/6/18.
 */
public interface LocationService {

    int insert(Location localtion);

    int delete(Integer id);

    int update(Location location);


    List<Location> queryForList(Integer productId);
}
