package com.livtrip.web.handler;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.google.common.eventbus.EventBus;
import com.livtrip.web.domain.HotelProduct;
import com.livtrip.web.domain.Product;
import com.livtrip.web.event.DataEvent;
import com.livtrip.web.service.*;
import com.livtrip.web.util.Money;
import com.livtrip.web.util.date.DateStyle;
import com.livtrip.web.util.date.DateUtil;
import com.livtrip.web.util.hotel.HotelProcessor;
import com.livtrip.web.webservice.hotel.Hotel;
import com.livtrip.web.webservice.hotel.TWSHotelDetailsV3;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xierongli on 17/6/18.
 */
@Component
public class HotelHandler {
    protected static final Logger logger	= LoggerFactory.getLogger(HotelHandler.class);


    public EventBus eventBus = new EventBus();
    @Autowired
    private ProductService productService;
    @Autowired
    private HotelProductService hotelProductService;
    @Autowired
    private LocationService locationService;
    @Autowired
    private AmenityService amenityService;

    @Autowired
    private HotelImagesService hotelImagesService;

    @Autowired
    private RefPointService refPointService;

    @Autowired
    private DescriptionService descriptionService;

    /**
     *
     * @name  根据destinationId 采集产品
     * @param  destinationIds
     * @return
     * @author xierongli
     * @date 2016/12/19 14:49
     */
    public void fetchProductDateByDestinationId(List<Integer> destinationIds){
        try{
            String current = defaultCheckIn();
            String tomorrow = defaultCheckOut();
            logger.info("采集酒店入参,destinationId[{}],checkIn[{}]",destinationIds,defaultCheckIn());
            List<Hotel> hotelList = HotelProcessor.SearchHotelsByDestinationIds(destinationIds, current,tomorrow, null);
            logger.info("采集实时获取的酒店数据, Hotels[{}]", JSON.toJSONString(hotelList));
            if(!CollectionUtils.isEmpty(hotelList)){
                for(final Hotel hotel : hotelList){
                    //product
                    Product product = new Product();
                    product.setName(hotel.getName());
                    product.setCurrency(hotel.getCurrency());
                    product.setBrandName(hotel.getBrandName());
                    product.setType(1);

                    product.setClearPrice(Money.convertYuanToCent(hotel.getMinAverPrice().doubleValue()).intValue());
                    product.setIsBest(hotel.isBestValue()? (byte)1:(byte)0);
                    product.setKeywords(hotel.getDesc());
                    product.setThumb(hotel.getThumb());
                    product.setSalePrice(Money.convertYuanToCent(hotel.getMinAverPrice().doubleValue()).intValue());
                    product.setVendor("tourico");
                    product.setLabel(hotel.getCategory());
                    final Integer primaryKey = productService.insertAndGetId(product);
                    //线上设置延时
                    List<Integer> hotelIds = Lists.newArrayList();
                    hotelIds.add(hotel.getHotelId());
                    List<TWSHotelDetailsV3.Hotel> hotels = HotelProcessor.getHotelDetailsV3(hotelIds);
                    final TWSHotelDetailsV3.Hotel hotelDetail =hotels.get(0);
                    if(!CollectionUtils.isEmpty(hotels) && primaryKey != null){
                        ExecutorService executorService = Executors.newSingleThreadExecutor();
                        executorService.execute(new Runnable() {
                            @Override
                            public void run() {
                                eventBus.register(hotelProductService);
                                eventBus.post(new DataEvent(primaryKey,hotelDetail,hotel));
                            }
                        });
                    }
                }
            }

        }catch (Exception e){
            logger.error("采集hotel酒店数据异常 error" + e.getMessage());
        }
    }

    public String defaultCheckIn(){
        return DateUtil.DateToString(DateUtil.addDay(DateUtil.getCurrentDate(),30), DateStyle.YYYY_MM_DD);
    }

    public String defaultCheckOut(){
        return  DateUtil.DateToString(DateUtil.addDay(DateUtil.getCurrentDate(),31), DateStyle.YYYY_MM_DD);
    }

    /**
     *
     * @name 采集酒店扩展信息
     * @return
     * @author xierongli
     * @date 2016/12/27 18:45
     */
    public  void fetchHotelExtData(){
        List<HotelProduct> hotelProducts = hotelProductService.queryFiftyHotelProductList();
        List<Integer> hotelfetchIds = Lists.newArrayList();
        if(!CollectionUtils.isEmpty(hotelProducts)){
            for(final HotelProduct hotelProduct : hotelProducts){
                hotelfetchIds.add(hotelProduct.getHotelId());

                List<Integer> hotelIds = Lists.newArrayList();
                hotelIds.add(hotelProduct.getHotelId());
                final List<TWSHotelDetailsV3.Hotel> hotels = HotelProcessor.getHotelDetailsV3(hotelIds);
                if(!CollectionUtils.isEmpty(hotels)){
                    ExecutorService executorService = Executors.newSingleThreadExecutor();
                    executorService.execute(new Runnable() {
                        @Override
                        public void run() {
                            eventBus.register(hotelImagesService);
                            eventBus.register(locationService);
                            eventBus.register(amenityService);
                            eventBus.register(refPointService);
                            eventBus.register(descriptionService);
                            System.out.println("-------fetch hotel ext------------");
                            eventBus.post(new DataEvent(hotelProduct.getProductId(), hotels.get(0), null));
                        }
                    });
                }
            }
        }

        if(!CollectionUtils.isEmpty(hotelProducts)){
            //更新采集状态
            int update = hotelProductService.updateFlagByHotelIds(hotelfetchIds);
            //递归调用.
            fetchHotelExtData();
        }
    }


}

