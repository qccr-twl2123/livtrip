package com.livtrip.web.service.impl;

import com.google.common.eventbus.Subscribe;
import com.livtrip.web.domain.Location;
import com.livtrip.web.domain.LocationCriteria;
import com.livtrip.web.event.DataEvent;
import com.livtrip.web.mapper.LocationMapper;
import com.livtrip.web.service.LocationService;
import com.livtrip.web.webservice.hotel.TWSHotelDetailsV3;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xierongli on 17/6/18.
 */
@Service("locationService")
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationMapper locationMapper;

    @Override
    public int insert(Location Location) {
        return locationMapper.insert(Location);
    }

    @Override
    public int delete(Integer id) {
        return locationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(Location Location) {
        return locationMapper.updateByCriteria(Location,null);
    }



    @Override
    public List<Location> queryForList(Integer productId) {
        LocationCriteria locationCriteria = new LocationCriteria();
        locationCriteria.createCriteria().andProductIdEqualTo(productId);
        List<Location> locationList = locationMapper.selectByCriteria(locationCriteria);
        if(CollectionUtils.isNotEmpty(locationList)){return locationList;}
        return null;
    }

    /**
     *
     * @name  采集地理信息
     * @param dataEvent
     * @return
     * @author xierongli
     * @date 2016/12/20 9:39
     */
    @Subscribe
    public void fetchLocation(DataEvent dataEvent){
        System.out.println("==========location==========");
        //去重
        List<Location> LocationList = queryForList(dataEvent.getProductId());
        if(CollectionUtils.isNotEmpty(LocationList)){
            return ;
        }

        TWSHotelDetailsV3.Hotel hotelDetail = dataEvent.getHotelDetail();
        Integer productId = dataEvent.getProductId();
        Location Location = new Location();
        Location.setHotelId(hotelDetail.getHotelID());
        Location.setProductId(productId);

        Location.setCountry(hotelDetail.getLocation().get(0).getCountry());
        Location.setState(hotelDetail.getLocation().get(0).getState());
        Location.setCity(hotelDetail.getLocation().get(0).getCity());
        Location.setDestinationCode(hotelDetail.getLocation().get(0).getDestinationCode());
        Location.setDestinationId(hotelDetail.getLocation().get(0).getDestinationId());
        Location.setAddress(hotelDetail.getLocation().get(0).getAddress());
        Location.setLatitude(hotelDetail.getLocation().get(0).getLatitude().toString());
        Location.setLongitude(hotelDetail.getLocation().get(0).getLongitude().toString());

        Location.setSearchCity(hotelDetail.getLocation().get(0).getSearchingCity());
        Location.setZip(hotelDetail.getLocation().get(0).getZip());
        insert(Location);
    }
}
