package com.livtrip.web.service;

import com.livtrip.web.domain.RefPoint;

import java.util.List;

/**
 * Created by xierongli on 17/6/18.
 */
public interface RefPointService {

    int insert(RefPoint refPoint);

    List<RefPoint> queryForList(Integer productId);

    int delete( Integer id);

    int update(RefPoint refPoint);

    RefPoint queryForObject( Integer id);
}
