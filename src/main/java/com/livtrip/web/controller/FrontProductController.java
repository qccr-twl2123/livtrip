package com.livtrip.web.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.livtrip.web.domain.Description;
import com.livtrip.web.domain.Dest;
import com.livtrip.web.domain.HotelImages;
import com.livtrip.web.model.dto.HotelProductDTO;
import com.livtrip.web.model.query.HotelProductRo;
import com.livtrip.web.model.query.ProductQuery;
import com.livtrip.web.model.vo.product.HotelDescriptionVO;
import com.livtrip.web.model.vo.product.HotelDetailVO;
import com.livtrip.web.model.vo.product.HotelImageVO;
import com.livtrip.web.service.DescriptionService;
import com.livtrip.web.service.DestService;
import com.livtrip.web.service.HotelImagesService;
import com.livtrip.web.service.ProductService;
import com.livtrip.web.util.ObjectConvert;
import com.livtrip.web.util.date.DateUtil;
import com.livtrip.web.util.hotel.HotelProcessor;
import com.livtrip.web.webservice.hotel.Hotel;
import com.livtrip.web.webservice.hotel.RoomType;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * 前台产品
 * @author xierongli
 * @version $Id:ProductController.java v 0.1 2016年12月16日 17:43 xierongli
 */
@Controller
@RequestMapping("/front/product")
public class FrontProductController extends BaseController{

    @Autowired
    private ProductService productService;
    @Autowired
    private HotelImagesService hotelImagesService;
    @Autowired
    private DescriptionService descriptionService;
    @Autowired
    private DestService destService;

    private static Map<String, Integer> cityNameIdMap = null;
    private static Map<Integer, String> cityIdNameMap = null;
    static {
        cityNameIdMap = Maps.newHashMap();
        cityNameIdMap.put("New York,NY", 7263);
        cityNameIdMap.put("Washington,DC", 949);

        cityIdNameMap = Maps.newHashMap();
        cityIdNameMap.put(7263,"New York,NY");
        cityIdNameMap.put(949,"Washington,DC");
    }

    @RequestMapping("/list")
    public String list(ProductQuery productQuery, ModelMap modelMap){
        try{
            if(productQuery.getPeopleNum() == null){productQuery.setPeopleNum("1");}
            String checkIn = StringUtils.isBlank(productQuery.getCheckIn())? HotelProcessor.defaultCheckIn() : productQuery.getCheckIn();
            String checkOut = StringUtils.isBlank(productQuery.getCheckOut())? HotelProcessor.defaultCheckOut() : productQuery.getCheckOut();

            //TODO 城市名称转ID
            List<Integer> destinationIds = Lists.newArrayList();
           // Integer destinationId =cityNameIdMap.get(productQuery.getDestination()) == null?7263:cityNameIdMap.get(productQuery.getDestination());
            Integer destinationId = destService.getDestinationIdByCityName(productQuery.getDestination());
            //增加sort
            destService.increaseSort(destinationId);
            destinationIds.add(destinationId);

            //赋值productQuery
            productQuery.setCheckIn(checkIn);
            productQuery.setCheckOut(checkOut);

            //实时获取酒店数据
            List<Hotel> hotelList = HotelProcessor.SearchHotelsByDestinationIds(destinationIds,checkIn,checkOut, HotelProcessor.getArrayOfRoomInfoByNum(Integer.parseInt(productQuery.getPeopleNum())));
            if(CollectionUtils.isEmpty(hotelList)){
                return "/front/product/no_product";
            }
            List<Integer> hotelIdList = Lists.newArrayList();
            Map<Integer, List<RoomType>> roomTypeMap = Maps.newHashMap();
            if(CollectionUtils.isNotEmpty(hotelList)){
                roomTypeMap = getRoomTypeMap(hotelList);
                for(Hotel hotel : hotelList){
                    hotelIdList.add(hotel.getHotelId());
                }
            }

            //查询酒店数据
            PageInfo<HotelProductDTO> pageInfo = productService.pageQueryHotelProduct(productQuery.getPageNumber(),productQuery.getPageSize(), hotelIdList);
            if(pageInfo.getTotal() == 0){
                return "/front/product/no_product";
            }
            List<HotelProductRo> hotelProductRos = ObjectConvert.convertList(pageInfo.getList(),HotelProductRo.class);

            for(HotelProductDTO hotelProductDTO : pageInfo.getList()){
                List<RoomType> roomTypeList = roomTypeMap.get(hotelProductDTO.getHotelId());
                Collections.sort(roomTypeList,(m1,m2)->m1.getOccupancies().getOccupancy().get(0).getAvrNightPrice().compareTo(m2.getOccupancies().getOccupancy().get(0).getAvrNightPrice()));
                //价格增加5个点
                BigDecimal avrNightPrice=roomTypeList.get(0).getOccupancies().getOccupancy().get(0).getAvrNightPrice();
                hotelProductDTO.setMinAvgNightPrice(HotelProcessor.plusCommission(avrNightPrice));

            }

            modelMap.put("page", pageInfo);
            modelMap.put("destination", productQuery.getDestination());
            modelMap.put("destinationId", destinationId);
            modelMap.put("destinationName", StringUtils.isBlank(productQuery.getDestination())?"New York,NY":productQuery.getDestination());
            modelMap.put("checkIn", productQuery.getCheckIn());
            modelMap.put("checkOut", productQuery.getCheckOut());
            modelMap.put("peopleNum", productQuery.getPeopleNum());
            StringBuilder pids = new StringBuilder();
            for(HotelProductRo hotelProductRo : hotelProductRos){
                hotelProductRo.setStarLevelText(productService.getProductStarLevel(hotelProductRo.getStartLevel().toString()));
                pids.append(hotelProductRo.getId()).append(",");
            }
        }catch (Exception e){
            return "/front/product/no_product";
        }
        return "/front/product/list";
    }

    public Map<Integer, List<RoomType>> getRoomTypeMap(List<Hotel> hotels){
        Map<Integer, List<RoomType>> map = Maps.newHashMap();
        if(CollectionUtils.isNotEmpty(hotels)){
            for(Hotel hotel : hotels){
                map.put(hotel.getHotelId(), hotel.getRoomTypes().getRoomType());
            }
        }
        return map;
    }
    public List<RoomType> getRoomTypeList(List<Hotel> hotels,Integer hotelId){
        if(CollectionUtils.isNotEmpty(hotels)){
            for(Hotel hotel: hotels){
                if(hotelId != null && hotel.equals(hotel.getHotelId())){
                    return  hotel.getRoomTypes().getRoomType();
                }
            }
        }
        return  hotels.get(0).getRoomTypes().getRoomType();
    }

    @RequestMapping("/detail")
    public String getHotelDetail(ProductQuery productQuery, ModelMap modelMap){
        if(productQuery !=null){productQuery.setDestination(productQuery.getDestination().replace(",",""));}
        HotelProductDTO hotelProductRo = productService.getHotelProductById(productQuery.getProductId());
        if(hotelProductRo == null){
            return "/front/product/no_product";
        }

        //实时查询房型数据
        List<Integer> destinationIds = Lists.newArrayList();
//        Integer destination = destService.getDestinationIdByCityName(productQuery.getDestination());
        //增加sort
        destService.increaseSort(productQuery.getDestinationId());
        destinationIds.add(productQuery.getDestinationId());
        List<Hotel> hotelList = HotelProcessor.SearchHotelsByDestinationIds(destinationIds,productQuery.getCheckIn(),productQuery.getCheckOut(),
                HotelProcessor.getArrayOfRoomInfoByNum(Integer.parseInt(productQuery.getPeopleNum())));
        List<RoomType> roomTypeList = null;

        if(CollectionUtils.isNotEmpty(hotelList)){
            roomTypeList =  getRoomTypeList(hotelList,hotelProductRo.getHotelId());
            //房型价格增加5个点
            if(CollectionUtils.isNotEmpty(roomTypeList)){
                Collections.sort(roomTypeList,(m1,m2)->m1.getOccupancies().getOccupancy().get(0).getAvrNightPrice().compareTo(m2.getOccupancies().getOccupancy().get(0).getAvrNightPrice()));
                for(RoomType roomType: roomTypeList){
                    BigDecimal avrNightPrice = roomType.getOccupancies().getOccupancy().get(0).getAvrNightPrice();
                    BigDecimal taxPublish = roomType.getOccupancies().getOccupancy().get(0).getTaxPublish();
                    roomType.getOccupancies().getOccupancy().get(0).setAvrNightPrice(HotelProcessor.plusCommission(avrNightPrice));
                    roomType.getOccupancies().getOccupancy().get(0).setTaxPublish(HotelProcessor.plusCommission(taxPublish));
                }
                HotelDetailVO hotelDetailVO = ObjectConvert.convertObject(hotelProductRo, HotelDetailVO.class);
                List<HotelImages> hotelImagesList = hotelImagesService.queryForList(productQuery.getProductId());
                hotelDetailVO.setHotelImageVOList(ObjectConvert.convertList(hotelImagesList, HotelImageVO.class));

                List<Description> descriptions = descriptionService.queryForList(productQuery.getProductId());
                hotelDetailVO.setHotelDescriptionVOList(ObjectConvert.convertList(descriptions, HotelDescriptionVO.class));
                hotelDetailVO.setRoomTypeList(roomTypeList);
                hotelDetailVO.setMinAvgNightPrice(roomTypeList.get(0).getOccupancies().getOccupancy().get(0).getAvrNightPrice());
                hotelDetailVO.setCityName(productQuery.getDestination());
                modelMap.put("hotelDetail", hotelDetailVO);
                modelMap.put("productQuery",productQuery);
            }
        }


        return "/front/product/detail";
    }

    @RequestMapping("toBookingOne")
    public String toBookingOne(@RequestParam Integer hotelId, @RequestParam Integer roomId,
                               @RequestParam String checkIn, @RequestParam String checkOut, @RequestParam Integer peopleNum, ModelMap modelMap){
        logger.info("进入酒店预定页面,hotelId[{}] roomId[{}]",hotelId, roomId);
        List<Integer> hotelIds = Lists.newArrayList();
        hotelIds.add(hotelId);
        List<Hotel> hotels = HotelProcessor.checkAvailabilityAndPrices(hotelIds,checkIn,checkOut,HotelProcessor.getArrayOfRoomInfoByNum(peopleNum));
        System.out.println(JSON.toJSONString(hotels));
        modelMap.put("hotel",hotels.get(0));
        modelMap.put("checkIn",checkIn);
        modelMap.put("checkOut",checkOut);
        Integer nights = DateUtil.getIntervalDays(checkIn,checkOut);
        modelMap.put("nights",nights);
        modelMap.put("peopleNum",peopleNum);
        List<RoomType> roomTypes = hotels.get(0).getRoomTypes().getRoomType();
        RoomType roomType = null;
        for(RoomType roomType1 : roomTypes){
            if(roomType1.getRoomId() == roomId){
                roomType = roomType1;
            }
        }
        if(roomType != null){
            BigDecimal orderPrice = roomType.getOccupancies().getOccupancy().get(0).getAvrNightPrice().multiply(new BigDecimal(nights));
            BigDecimal totalTax = roomType.getOccupancies().getOccupancy().get(0).getTax().multiply(new BigDecimal(nights));
            modelMap.put("orderPrice", HotelProcessor.plusCommission(orderPrice));
            modelMap.put("tax", HotelProcessor.plusCommission(totalTax));
            modelMap.put("roomName", roomType.getName());
        }
        return "/front/product/bookingOne";
    }

    @RequestMapping("getCity")
    @ResponseBody
    public String getCity(String query){
        List<Dest> dests =  destService.queryForList(query);
        List<String> cityList = Lists.newArrayList();
        for(Dest dest:dests){
            cityList.add(dest.getCityName());
        }
        cityList = cityList.subList(0,12);
        Map map = Maps.newHashMap();
        map.put("suggestions", cityList);
        return JSON.toJSONString(map);
    }



}
