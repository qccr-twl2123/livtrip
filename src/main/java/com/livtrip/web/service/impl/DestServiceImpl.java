package com.livtrip.web.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.livtrip.web.domain.Dest;
import com.livtrip.web.domain.DestCriteria;
import com.livtrip.web.mapper.DestMapper;
import com.livtrip.web.query.DestQuery;
import com.livtrip.web.service.DestService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xierongli on 17/6/17.
 */
@Service("destService")
public class DestServiceImpl implements DestService {
    @Autowired
    private DestMapper destMapper;
    @Override
    public PageInfo<Dest> pageQueryListByCondition(DestQuery destQuery) {
        PageHelper.startPage(destQuery.getPageNumber(),destQuery.getPageSize(),true);
        DestCriteria destCriteria = new DestCriteria();
        if(StringUtils.isNoneBlank(destQuery.getCityName())){
            destCriteria.createCriteria().andCityNameLike(destQuery.getCityName());
        }
        if(StringUtils.isNoneBlank(destQuery.getState())){
            destCriteria.createCriteria().andStateLike(destQuery.getState());
        }
        if(destQuery.getDestinationId() != null){
            destCriteria.createCriteria().andDestinationIdEqualTo(destQuery.getDestinationId());
        }
        List<Dest> dests = destMapper.selectByCriteria(destCriteria);
        return new PageInfo<Dest>(dests);
    }
}
