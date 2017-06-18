package com.livtrip.web.service.impl;

import com.livtrip.web.domain.HotelProduct;
import com.livtrip.web.domain.HotelProductCriteria;
import com.livtrip.web.mapper.HotelProductMapper;
import com.livtrip.web.service.HotelProductService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xierongli on 17/6/18.
 */
@Service("hotelProductService")
public class HotelProductServiceImpl implements HotelProductService {

    @Autowired
    private HotelProductMapper hotelProductMapper;

    @Override
    public int insert(HotelProduct hotelProduct) {
        return hotelProductMapper.insert(hotelProduct);
    }

    @Override
    public int updateFlagByHotelIds(List<Integer> hotelIds) {
        return hotelProductMapper.updateFlagByHotelIds(hotelIds);
    }

    @Override
    public List<HotelProduct> queryFiftyHotelProductList() {
        return hotelProductMapper.queryFiftyHotelProductList();
    }

    @Override
    public HotelProduct queryByHotelId(Integer hotelId) {
        HotelProductCriteria hotelProductCriteria = new HotelProductCriteria();
        hotelProductCriteria.createCriteria().andHotelIdEqualTo(hotelId);
        List<HotelProduct> hotelProducts = hotelProductMapper.selectByCriteria(hotelProductCriteria);
        if(CollectionUtils.isNotEmpty(hotelProducts)){return  hotelProducts.get(0);}
        return null;
    }
}
