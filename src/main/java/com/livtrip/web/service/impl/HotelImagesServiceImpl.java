package com.livtrip.web.service.impl;

import com.google.common.eventbus.Subscribe;
import com.livtrip.web.domain.HotelImages;
import com.livtrip.web.domain.HotelImagesCriteria;
import com.livtrip.web.event.DataEvent;
import com.livtrip.web.mapper.HotelImagesMapper;
import com.livtrip.web.service.HotelImagesService;
import com.livtrip.web.webservice.hotel.TWSHotelDetailsV3;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xierongli on 17/6/18.
 */
@Service("hotelImagesService")
public class HotelImagesServiceImpl implements HotelImagesService {

    @Autowired
    private HotelImagesMapper hotelImagesMapper;

    @Override
    public int insert(HotelImages hotelImages) {
        return hotelImagesMapper.insert(hotelImages);
    }


    @Override
    public List<HotelImages> queryForList(Integer productId) {
        HotelImagesCriteria hotelImagesCriteria = new HotelImagesCriteria();
        hotelImagesCriteria.createCriteria().andProductIdEqualTo(productId);
        List<HotelImages> hotelImages = hotelImagesMapper.selectByCriteria(hotelImagesCriteria);
        if(CollectionUtils.isNotEmpty(hotelImages)){return hotelImages;}
        return null;
    }

    /**
     *
     * @name  采集图片
     * @param
     * @return
     * @author xierongli
     * @date 2016/12/20 9:41
     */
    @Subscribe
    public void fetchHotelImages(DataEvent dataEvent){
        TWSHotelDetailsV3.Hotel hotelDetail = dataEvent.getHotelDetail();
        Integer productId = dataEvent.getProductId();
        List<TWSHotelDetailsV3.Hotel.Media.Images.Image> images = hotelDetail.getMedia().get(0).getImages().get(0).getImage();
        for(TWSHotelDetailsV3.Hotel.Media.Images.Image image : images){
            HotelImages hotelImages = new HotelImages();
            hotelImages.setHotelId(hotelDetail.getHotelID());
            hotelImages.setProductId(productId);
            hotelImages.setType(image.getType().byteValue());
            hotelImages.setPath(image.getPath());
            insert(hotelImages);
        }
    }
}
