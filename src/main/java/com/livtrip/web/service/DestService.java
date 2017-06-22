package com.livtrip.web.service;

import com.github.pagehelper.PageInfo;
import com.livtrip.web.domain.Dest;
import com.livtrip.web.model.query.DestQuery;

import java.util.List;

/**
 * Created by xierongli on 17/6/17.
 */
public interface DestService {

     PageInfo<Dest> pageQueryListByCondition(DestQuery destQuery);

     Integer getDestinationIdByCityName(String cityName);

     int increaseSort(Integer destinationId);

     List<Dest> queryForList(String cityName);


}
