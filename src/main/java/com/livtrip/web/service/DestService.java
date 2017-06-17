package com.livtrip.web.service;

import com.github.pagehelper.PageInfo;
import com.livtrip.web.domain.Dest;
import com.livtrip.web.query.DestQuery;

/**
 * Created by xierongli on 17/6/17.
 */
public interface DestService {

     PageInfo<Dest> pageQueryListByCondition(DestQuery destQuery);
}
