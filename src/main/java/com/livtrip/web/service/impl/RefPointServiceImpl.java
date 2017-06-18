package com.livtrip.web.service.impl;

import com.livtrip.web.domain.RefPoint;
import com.livtrip.web.domain.RefPointCriteria;
import com.livtrip.web.mapper.RefPointMapper;
import com.livtrip.web.service.RefPointService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xierongli on 17/6/18.
 */
@Service("refPointService")
public class RefPointServiceImpl implements RefPointService {

    @Autowired
    private RefPointMapper refPointMapper;
    @Override
    public int insert(RefPoint refPoint) {
        return refPointMapper.insert(refPoint);
    }

    @Override
    public List<RefPoint> queryForList(Integer productId) {
        RefPointCriteria refPointCriteria = new RefPointCriteria();
        refPointCriteria.createCriteria().andProductIdEqualTo(productId);
        List<RefPoint> refPoints = refPointMapper.selectByCriteria(refPointCriteria);
        if(CollectionUtils.isNotEmpty(refPoints)){return refPoints;}
        return null;
    }

    @Override
    public int delete(Integer id) {
        return refPointMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(RefPoint refPoint) {
        return refPointMapper.updateByCriteria(refPoint,null);
    }

    @Override
    public RefPoint queryForObject(Integer id) {
        return refPointMapper.selectByPrimaryKey(id);
    }
}
