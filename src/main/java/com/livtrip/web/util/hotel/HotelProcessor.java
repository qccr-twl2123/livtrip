package com.livtrip.web.util.hotel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;


import com.livtrip.web.cache.KeyGenerate;
import com.livtrip.web.cache.LocalCache;
import com.livtrip.web.constant.Constant;
import com.livtrip.web.util.Money;
import com.livtrip.web.util.date.DateStyle;
import com.livtrip.web.util.date.DateUtil;
import com.livtrip.web.model.vo.HotelRoomTypeVO;
import com.livtrip.web.webservice.handler.HotelSOAPHandler;
import com.livtrip.web.webservice.hotel.*;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import org.apache.commons.collections.CollectionUtils;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *Hotel 处理器
 * @author xierongli
 * @version $Id:HotelProcessor.java v 0.1 2016年12月13日 16:14 xierongli
 */
public class HotelProcessor {

    protected static final Logger logger	= LoggerFactory.getLogger(HotelProcessor.class);


    private static IHotelFlow port = null;

    static{
        HotelFlow ss = new HotelFlow();
        ss.setHandlerResolver(new HandlerResolver() {
            @Override
            public List<Handler> getHandlerChain(PortInfo portInfo) {
                List<Handler> handlerList = new ArrayList<Handler>();
                handlerList.add(new HotelSOAPHandler());
                return handlerList;
            }
        });
         port = ss.getBasicHttpBindingIHotelFlow();
    }
    public static  List<Hotel> SearchHotelsByDestinationIds(List<Integer> destinationIds){
        return SearchHotelsByDestinationIds(destinationIds, defaultCheckIn(), defaultCheckOut(),defaultArrayOfRoomInfo());
    }

    public static  String defaultCheckIn(){
        return DateUtil.DateToString(DateUtil.addDay(DateUtil.getCurrentDate(),30), DateStyle.YYYY_MM_DD);
    }

    public static String defaultCheckOut(){
        return  DateUtil.DateToString(DateUtil.addDay(DateUtil.getCurrentDate(),31), DateStyle.YYYY_MM_DD);
    }

    /**
     * 
     * @name  根据destination 等信息查询酒店数据
     * @param  destinationIds 城市Id
     * @param checkIn 入住日期
     * @param checkOut 退房日期
     * @param arrayOfRoomInfo 入住人数信息 default(1 adult)
     * @return  
     * @author xierongli
     * @date 2016/12/13 16:58
     */
    public static List<Hotel> SearchHotelsByDestinationIds(List<Integer> destinationIds, String checkIn, String checkOut, ArrayOfRoomInfo arrayOfRoomInfo){
        //先从缓存取
        String key = KeyGenerate.generateHotelKey(destinationIds.get(0),checkIn,checkOut,arrayOfRoomInfo);
        String resultStr = LocalCache.get(key);
        if(StringUtils.isNotBlank(resultStr)){
            return JSON.parseArray(resultStr,Hotel.class);
        }
        if(CollectionUtils.isEmpty(destinationIds)){ return null;}
        try{

            SearchHotelsByDestinationIdsRequest request = new SearchHotelsByDestinationIdsRequest();
            ArrayOfDestinationIdInfo destinationIdsInfo = new ArrayOfDestinationIdInfo();
            for(Integer destinationId : destinationIds){
                DestinationIdInfo destinationIdInfo = new DestinationIdInfo();
                destinationIdInfo.setId(destinationId);
                destinationIdsInfo.getDestinationIdInfo().add(destinationIdInfo);
            }
            request.setDestinationIdsInfo(destinationIdsInfo);
            request.setCheckIn(transToTouricoFormate(checkIn));
            request.setCheckOut(transToTouricoFormate(checkOut));
            request.setRoomsInformation(arrayOfRoomInfo == null? defaultArrayOfRoomInfo() : arrayOfRoomInfo);
            request.setAvailableOnly(true);
            request.setMaxPrice(new BigDecimal(0));
            request.setPropertyType(PropertyType.HOTEL);
            request.setStarLevel(new BigDecimal(0));
            request.setExactDestination(false);


            SearchResult result = port.searchHotelsByDestinationIds(request, null);
            if(result != null && CollectionUtils.isNotEmpty(result.getHotelList().getHotel())){
                LocalCache.put(key,result.getHotelList().getHotel());
            }
            return result.getHotelList().getHotel();
        }catch (Exception e) {
            logger.error("tourico request error", e);
            e.printStackTrace();
        }
        return null;
    }

    public static  List<Hotel> searchHotelsById(List<Integer> hotelIds){
        return searchHotelsById(hotelIds, defaultCheckIn(),defaultCheckOut(),defaultArrayOfRoomInfo());
    }
    
    public static List<Hotel> searchHotelsById(List<Integer> hotelIds, String checkIn, String checkOut, ArrayOfRoomInfo arrayOfRoomInfo){
        long start = System.currentTimeMillis();
        try {
            SearchHotelsByIdRequest request = new SearchHotelsByIdRequest();

            ArrayOfHotelIdInfo hotelInfo = new ArrayOfHotelIdInfo();
            if(CollectionUtils.isNotEmpty(hotelIds)){
                for(Integer hotelId : hotelIds){
                    HotelIdInfo hotelIdInfo = new HotelIdInfo();
                    hotelIdInfo.setId(hotelId);
                    hotelInfo.getHotelIdInfo().add(hotelIdInfo);
                }
            }
            request.setHotelIdsInfo(hotelInfo);
            request.setCheckIn(transToTouricoFormate(checkIn));
            request.setCheckOut(transToTouricoFormate(checkOut));

            request.setRoomsInformation(arrayOfRoomInfo == null? defaultArrayOfRoomInfo() : arrayOfRoomInfo);
            SearchResult result = port.searchHotelsById(request, null);

            if(result != null){
                return result.getHotelList().getHotel();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public static List<TWSHotelDetailsV3.Hotel> getHotelDetailsV3(List<Integer> hotelIds){
        try{
            ArrayOfHotelID arrayOfHotelID = generateArrayOfHotelID(hotelIds);
            GetHotelDetailsV3Response.GetHotelDetailsV3Result result = port.getHotelDetailsV3(arrayOfHotelID, null);
            TWSHotelDetailsV3 tWSHotelDetailsV3 = (TWSHotelDetailsV3) result.getAny();
            List lst = tWSHotelDetailsV3.getStatusCodeOrHotelOrHome();
            List<TWSHotelDetailsV3.Hotel> hotels = Lists.newArrayList();
            for(int i=0;i<lst.size(); i++){
                if (lst.get(i) instanceof TWSHotelDetailsV3.Hotel){
                    TWSHotelDetailsV3.Hotel hotel = (TWSHotelDetailsV3.Hotel) lst.get(i);
                    hotels.add(hotel);
                }
            }
            return hotels;

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return null;
    }

    public static List<Hotel> checkAvailabilityAndPrices(List<Integer> hotelIds, String checkIn,String checkOut,ArrayOfRoomInfo arrayOfRoomInfo)  {
           try{
               ArrayOfHotelIdInfo arrayOfHotelID = new ArrayOfHotelIdInfo();
               if(CollectionUtils.isNotEmpty(hotelIds)){
                   for(Integer hotelId : hotelIds){
                       HotelIdInfo hotelIdInfo = new HotelIdInfo();
                       hotelIdInfo.setId(hotelId);
                       arrayOfHotelID.getHotelIdInfo().add(hotelIdInfo);
                   }
                   SearchHotelsByIdRequest request = new SearchHotelsByIdRequest();
                   request.setHotelIdsInfo(arrayOfHotelID);
                   request.setCheckIn(transToTouricoFormate(checkIn));
                   request.setCheckOut(transToTouricoFormate(checkOut));
                   request.setMaxPrice(new BigDecimal(0));
                   request.setStarLevel(new BigDecimal(0));
                   request.setAvailableOnly(true);

                   request.setRoomsInformation(arrayOfRoomInfo == null? defaultArrayOfRoomInfo() : arrayOfRoomInfo);
                   SearchResult result = port.checkAvailabilityAndPrices(request, null);
                   if(result != null){
                       return result.getHotelList().getHotel();
                   }
               }
           }catch (Exception e){
               System.out.println(e.getMessage());
           }
        return null;
    }


    public static ArrayOfHotelID  generateArrayOfHotelID(List<Integer> hotelIds){
        ArrayOfHotelID arrayOfHotelID = new ArrayOfHotelID();
        if(CollectionUtils.isNotEmpty(hotelIds)){
            for(Integer hotelId : hotelIds){
                HotelID id = new HotelID();
                id.setId(hotelId);
                arrayOfHotelID.getHotelID().add(id);
            }
        }
        return arrayOfHotelID;
    }


    /**
     * 
     * @name  默认的入住信息(1 room 1 adult)
     * @param
     * @return  
     * @author xierongli
     * @date 2016/12/13 17:46
     */
    public static ArrayOfRoomInfo defaultArrayOfRoomInfo(){
        ArrayOfRoomInfo arrayOfRoomInfo = new ArrayOfRoomInfo();
        RoomInfo roomInfo = new RoomInfo();
        roomInfo.setAdultNum(1);
        roomInfo.setChildNum(0);
        ArrayOfChildAge age = new ArrayOfChildAge();
        roomInfo.setChildAges(age);
        arrayOfRoomInfo.getRoomInfo().add(roomInfo);
        return  arrayOfRoomInfo;
    }

    /**
     *
     * @name  转换日期格式
     * @param date (yyyy-mm-dd)
     * @return
     * @author xierongli
     * @date 2016/12/13 17:12
     */
    public static XMLGregorianCalendarImpl transToTouricoFormate(String date){
        String[] dateArray = date.split("-");
        XMLGregorianCalendarImpl  xmlCalendar = new XMLGregorianCalendarImpl();
        xmlCalendar.setYear(Integer.parseInt(dateArray[0]));
        xmlCalendar.setMonth(Integer.parseInt(dateArray[1]));
        xmlCalendar.setDay(Integer.parseInt(dateArray[2]));
        return xmlCalendar;
    }

    /**
     * @param  orginPrice
     * @return  增加手续费之后价格
     * @author xierongli
     * @date 17/5/21 上午9:39
     */
    public static  BigDecimal plusCommission(BigDecimal orginPrice){
        return orginPrice.multiply(new BigDecimal(1+ Constant.COMMISSION)).setScale(2,BigDecimal.ROUND_UP);
    }

    public static ArrayOfRoomInfo getArrayOfRoomInfoByNum(Integer peopleNum){
        if(peopleNum == null){peopleNum = 1;}
        ArrayOfRoomInfo arrayOfRoomInfo = new ArrayOfRoomInfo();
        RoomInfo roomInfo = new RoomInfo();
        roomInfo.setAdultNum(peopleNum);
        roomInfo.setChildNum(0);
        ArrayOfChildAge age = new ArrayOfChildAge();
        roomInfo.setChildAges(age);
        arrayOfRoomInfo.getRoomInfo().add(roomInfo);
        return  arrayOfRoomInfo;
    }

    /**
     *  转换房型数据
     * @param   roomTypes 房型集合
     * @return
     * @author xierongli
     * @date 17/6/3 下午4:32
     */
    public static List<HotelRoomTypeVO> convertRoomTypeList(List<RoomType> roomTypes){
        if(CollectionUtils.isEmpty(roomTypes)){return new ArrayList<HotelRoomTypeVO>();}
        List<HotelRoomTypeVO> hotelRoomTypeVOS = Lists.newArrayList();
        for(RoomType roomType : roomTypes){
            HotelRoomTypeVO hotelRoomTypeVO = new HotelRoomTypeVO();
            hotelRoomTypeVO.setName(roomType.getName());
            hotelRoomTypeVO.setCommission(Constant.COMMISSION);
            hotelRoomTypeVO.setNights(roomType.getNights());
            hotelRoomTypeVO.setCheckIn(HotelProcessor.defaultCheckIn());
            hotelRoomTypeVO.setCheckOut(HotelProcessor.defaultCheckOut());
            //每晚均价，总价（总价）
            Double avgNightPrice = roomType.getOccupancies().getOccupancy().get(0).getAvrNightPrice().doubleValue();
            hotelRoomTypeVO.setOriginalPrice(avgNightPrice);
            Money originalMoney = Money.ofYuan(avgNightPrice);
            Money totalPrice = originalMoney.multipliedBy(new Double(roomType.getNights()));
            hotelRoomTypeVO.setTotalOriginalPrice(totalPrice.getYuan());

            //每晚均价,总价（销售价）
            Money saleAvgNightPrice = originalMoney.multipliedBy(1+Constant.COMMISSION);
            Money totalSalePrice = saleAvgNightPrice.multipliedBy(new Double(roomType.getNights()));
            hotelRoomTypeVO.setSaleAvgPrice(saleAvgNightPrice.getYuan());
            hotelRoomTypeVO.setTotalSalePrice(totalSalePrice.getYuan());

            double profit = new BigDecimal(hotelRoomTypeVO.getTotalSalePrice()).subtract(new BigDecimal(hotelRoomTypeVO.getTotalOriginalPrice())).doubleValue();
            hotelRoomTypeVO.setProfit(profit);
            hotelRoomTypeVOS.add(hotelRoomTypeVO);
            hotelRoomTypeVO = null;
        }
        return hotelRoomTypeVOS;
    }




    public static void main(String[] args) {
        //根据hotelIds 查询
//        List<Integer> hotelIds = Lists.newArrayList();
//        hotelIds.add(2205);
//        List<Hotel> hotel = searchHotelsById(hotelIds, "2017-07-18","2017-07-19",null);
//        System.out.println(JSON.toJSONString(hotel));

        //根据destinationIds 查询
        List<Integer> destinationIds = Lists.newArrayList();
        destinationIds.add(7263); //new york
        List<Hotel> hotel1 = SearchHotelsByDestinationIds(destinationIds, "2017-07-22","2017-07-23",null);
        System.out.println(JSON.toJSONString(hotel1));

           List<Integer> hotelIds = Lists.newArrayList();
           hotelIds.add(2205);
           List<TWSHotelDetailsV3.Hotel> hotels =getHotelDetailsV3(hotelIds);
           for(TWSHotelDetailsV3.Hotel hotel : hotels){
                hotel.getDescriptions();
               hotel.getStarLevel();
           }
            System.out.println(JSON.toJSONString(hotels));



//           List<Integer> hotelIds1 = Lists.newArrayList();
//           hotelIds.add(1249960);
//           List<Hotel> hotels =checkAvailabilityAndPrices(hotelIds1,defaultCheckIn(),defaultCheckOut(),defaultArrayOfRoomInfo());
//           System.out.println(JSON.toJSONString(hotels));
    }




}
