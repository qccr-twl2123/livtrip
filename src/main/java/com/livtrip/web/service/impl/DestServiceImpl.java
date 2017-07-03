package com.livtrip.web.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.livtrip.web.domain.Dest;
import com.livtrip.web.domain.DestCriteria;
import com.livtrip.web.mapper.DestMapper;
import com.livtrip.web.model.query.DestQuery;
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
        destCriteria.createCriteria();
        if(StringUtils.isNoneBlank(destQuery.getCityName())){
            destCriteria.getOredCriteria().get(0).andCityNameLike(destQuery.getCityName());
        }
        if(StringUtils.isNoneBlank(destQuery.getState())){
            destCriteria.getOredCriteria().get(0).andStateLike(destQuery.getState());
        }
        if(destQuery.getDestinationId() != null){
            destCriteria.getOredCriteria().get(0).andDestinationIdEqualTo(destQuery.getDestinationId());
        }
        List<Dest> dests = destMapper.selectByCriteria(destCriteria);
        return new PageInfo<Dest>(dests);
    }


    public Integer getDestinationIdByCityName(String cityName){
        DestCriteria destCriteria = new DestCriteria();
        destCriteria.createCriteria().andCityNameEqualTo(cityName);
        return destMapper.selectByCriteria(destCriteria).get(0).getDestinationId();
    }

    @Override
    public int increaseSort(Integer destinationId) {
        DestCriteria destCriteria = new DestCriteria();
        destCriteria.createCriteria().andDestinationIdEqualTo(destinationId);
        Dest dest = destMapper.selectByCriteria(destCriteria).get(0);
        dest.setSort(dest.getSort() + 1);
        return destMapper.updateByCriteria(dest, destCriteria);
    }

    @Override
    public List<Dest> queryForList(String cityName) {
        DestCriteria destCriteria = new DestCriteria();
        destCriteria.setOrderByClause("sort desc");
        destCriteria.createCriteria().andCityNameLike("%"+cityName+"%");
        return destMapper.selectByCriteria(destCriteria);
    }
}
