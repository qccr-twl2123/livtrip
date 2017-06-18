package com.livtrip.web.service;

import com.livtrip.web.domain.Description;

import java.util.List;

/**
 * Created by xierongli on 17/6/18.
 */
public interface DescriptionService {

    int insert(Description description);

    List<Description> queryForList(Integer productId);
}
