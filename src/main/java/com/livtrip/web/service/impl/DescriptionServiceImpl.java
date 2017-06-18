package com.livtrip.web.service.impl;

import com.google.common.eventbus.Subscribe;
import com.livtrip.web.domain.Description;
import com.livtrip.web.domain.DescriptionCriteria;
import com.livtrip.web.event.DataEvent;
import com.livtrip.web.mapper.DescriptionMapper;
import com.livtrip.web.service.DescriptionService;
import com.livtrip.web.webservice.hotel.TWSHotelDetailsV3;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xierongli on 17/6/18.
 */
@Service("descriptionService")
public class DescriptionServiceImpl implements DescriptionService {

    @Autowired
    private DescriptionMapper descriptionMapper;

    @Override
    public int insert(Description description) {
        return descriptionMapper.insert(description);
    }

    @Override
    public List<Description> queryForList(Integer productId) {
        DescriptionCriteria descriptionCriteria = new DescriptionCriteria();
        descriptionCriteria.createCriteria().andProductIdEqualTo(productId);
        List<Description> descriptions = descriptionMapper.selectByCriteria(descriptionCriteria);
        if(CollectionUtils.isNotEmpty(descriptions)){return  descriptions;}
        return null;
    }
    @Subscribe
    public void fetchDescription(DataEvent dataEvent){
        System.out.print("========description======");
        TWSHotelDetailsV3.Hotel hotelDetail = dataEvent.getHotelDetail();
        Integer hotelId = hotelDetail.getHotelID();
        Integer productId = dataEvent.getProductId();
        List<TWSHotelDetailsV3.Hotel.Descriptions> descriptionses =  hotelDetail.getDescriptions();

        if(!org.springframework.util.CollectionUtils.isEmpty(descriptionses)){
            TWSHotelDetailsV3.Hotel.Descriptions descriptions = descriptionses.get(0);
            List<TWSHotelDetailsV3.Hotel.Descriptions.LongDescription> longDescriptions = descriptions.getLongDescription();
            if(!org.springframework.util.CollectionUtils.isEmpty(longDescriptions)) {
                List<TWSHotelDetailsV3.Hotel.Descriptions.LongDescription.Description> descriptionList = longDescriptions.get(0).getDescription();

                for (TWSHotelDetailsV3.Hotel.Descriptions.LongDescription.Description description : descriptionList) {
                    Description descriptionModel = new Description();
                    descriptionModel.setProductId(productId);
                    descriptionModel.setHotelId(hotelId);
                    descriptionModel.setCategory(description.getCategory());
                    descriptionModel.setValue(description.getValue());
                    insert(descriptionModel);
                }
            }
        }

    }
}
