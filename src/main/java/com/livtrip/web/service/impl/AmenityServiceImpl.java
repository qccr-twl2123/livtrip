package com.livtrip.web.service.impl;

import com.google.common.eventbus.Subscribe;
import com.livtrip.web.domain.Amenity;
import com.livtrip.web.domain.AmenityCriteria;
import com.livtrip.web.event.DataEvent;
import com.livtrip.web.mapper.AmenityMapper;
import com.livtrip.web.service.AmenityService;
import com.livtrip.web.webservice.hotel.TWSHotelDetailsV3;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xierongli on 17/6/18.
 */
@Service("amenityService")
public class AmenityServiceImpl implements AmenityService {

    @Autowired
    private AmenityMapper amenityMapper;

    @Override
    public int insert(Amenity amenity) {
        return amenityMapper.insert(amenity);
    }

    @Override
    public List<Amenity> queryForList(Integer productId) {
        AmenityCriteria amenityCriteria = new AmenityCriteria();
        amenityCriteria.createCriteria().andProductIdEqualTo(productId);
        List<Amenity> amenities = amenityMapper.selectByCriteria(amenityCriteria);
        if(CollectionUtils.isNotEmpty(amenities)){return  amenities;}
        return null;
    }

    @Subscribe
    public void fetchAmenity(DataEvent dataEvent){
        System.out.print("========Amenity======");
        TWSHotelDetailsV3.Hotel hotelDetail = dataEvent.getHotelDetail();
        List<TWSHotelDetailsV3.Hotel.Amenities.Amenity> amenities =  hotelDetail.getAmenities().get(0).getAmenity();
        Integer hotelId = hotelDetail.getHotelID();
        Integer productId = dataEvent.getProductId();

        if(!org.springframework.util.CollectionUtils.isEmpty(amenities)){
            for(TWSHotelDetailsV3.Hotel.Amenities.Amenity amenity : amenities){
                Amenity amenityModel = new Amenity();
                amenityModel.setHotelId(hotelId);
                amenityModel.setProductId(productId);
                amenityModel.setAmenityId(amenity.getAmenityID());
                amenityModel.setName(amenity.getName());
                insert(amenityModel);
            }
        }
    }
}
