package com.livtrip.web.controller;

import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.livtrip.web.constant.Constant;
import com.livtrip.web.domain.Description;
import com.livtrip.web.domain.HotelImages;
import com.livtrip.web.dto.HotelProductDTO;
import com.livtrip.web.handler.HotelHandler;
import com.livtrip.web.query.HotelProductQuery;
import com.livtrip.web.query.RoomTypeQuery;
import com.livtrip.web.service.DescriptionService;
import com.livtrip.web.service.DestService;
import com.livtrip.web.service.HotelImagesService;
import com.livtrip.web.service.ProductService;
import com.livtrip.web.util.ObjectConvert;
import com.livtrip.web.util.hotel.HotelProcessor;
import com.livtrip.web.vo.HotelRoomTypeVO;
import com.livtrip.web.vo.product.HotelDescriptionVO;
import com.livtrip.web.vo.product.HotelDetailVO;
import com.livtrip.web.vo.product.HotelImageVO;
import com.livtrip.web.webservice.hotel.Hotel;
import com.livtrip.web.webservice.hotel.RoomType;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;
import java.util.List;

/**
 * Created by xierongli on 17/6/18.
 */
@Controller
@RequestMapping("/backend/product")
public class ProductController extends BaseController{

    @Autowired
    private ProductService productService;

    @Autowired
    private HotelHandler hotelHandler;
    @Autowired
    private HotelImagesService hotelImagesService;
    @Autowired
    private DescriptionService descriptionService;
    @Autowired
    private DestService destService;

    @RequestMapping("/add")
    public String fetchProducts(@RequestParam Integer destinationId){
        System.out.println("add product..." + destinationId);
        List<Integer> destinationIds = Lists.newArrayList();
        destinationIds.add(destinationId);//7263 new york 7693
        hotelHandler.fetchProductDateByDestinationId(destinationIds);
        hotelHandler.fetchHotelExtData();
        logger.info("酒店数据采集完成, 参数destinationId:[{}]", destinationId);
        return "/success";
    }

    @RequestMapping("/list")
    public String list(HotelProductQuery hotelProductQuery, ModelMap modelMap){
        if(hotelProductQuery.getCity() == null){
            hotelProductQuery.setCity("New York");
        }
        logger.info("产品搜索, htoelProductQuery[{}]", hotelProductQuery);
        PageInfo<HotelProductDTO> pageInfo = productService.pageQueryHotelProductForAdmin(hotelProductQuery.getPageNumber(),hotelProductQuery.getPageSize(),hotelProductQuery);
        modelMap.put("page", pageInfo);
        modelMap.put("name",hotelProductQuery.getName());
        modelMap.put("city",hotelProductQuery.getCity());
        modelMap.put("hotelId",hotelProductQuery.getHotelId());
        modelMap.put("isBest",hotelProductQuery.getIsBest());
        modelMap.put("starLevel",hotelProductQuery.getStarLevel());
        return "/backend/product/list";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam String productId){
        System.out.println(productId);
        productService.deleteProduct(productId);
        return "redirect:list";
    }

    @RequestMapping("/edit")
    public String edit(@RequestParam  String productId, ModelMap modelMap){
        //查询酒店基础信息
        HotelProductDTO hotelProductRo = productService.getHotelProductById(Integer.parseInt(productId.trim()));
        HotelDetailVO hotelDetailVO = ObjectConvert.convertObject(hotelProductRo, HotelDetailVO.class);
        //酒店图片
        List<HotelImages> hotelImagesList = hotelImagesService.queryForList(Integer.parseInt(productId.trim()));
        hotelDetailVO.setHotelImageVOList(ObjectConvert.convertList(hotelImagesList, HotelImageVO.class));
        //酒店描述
        List<Description> descriptions = descriptionService.queryForList(Integer.parseInt(productId.trim()));
        hotelDetailVO.setHotelDescriptionVOList(ObjectConvert.convertList(descriptions, HotelDescriptionVO.class));

        //酒店房型数据
        List<Integer> hotelIds = Lists.newArrayList();
        hotelIds.add(hotelProductRo.getHotelId());

        List<Hotel> hotels = HotelProcessor.checkAvailabilityAndPrices(hotelIds, HotelProcessor.defaultCheckIn(), HotelProcessor.defaultCheckOut(), HotelProcessor.defaultArrayOfRoomInfo());
        if(CollectionUtils.isNotEmpty(hotels)){

            List<RoomType> roomTypeList = hotels.get(0).getRoomTypes().getRoomType();
            //房型价格排序
            Collections.sort(roomTypeList,(m1, m2)->m1.getOccupancies().getOccupancy().get(0).getAvrNightPrice().compareTo(m2.getOccupancies().getOccupancy().get(0).getAvrNightPrice()));
            hotelDetailVO.setHotelRoomTypeVOS(HotelProcessor.convertRoomTypeList(roomTypeList));

        }
        hotelDetailVO.setCheckIn(HotelProcessor.defaultCheckIn());
        hotelDetailVO.setCheckOut(HotelProcessor.defaultCheckOut());
        modelMap.put("product", hotelDetailVO);
        return "/backend/product/edit";
    }

    @RequestMapping("getRoomTypeList")
    @ResponseBody
    public String getRoomTypeList(RoomTypeQuery roomTypeQuery){
        logger.info("查询房型, roomTypeList[{}]",roomTypeQuery);
        List<Integer> hotelIds = Lists.newArrayList();
        hotelIds.add(roomTypeQuery.getHotelId());
        List<Hotel> hotels = HotelProcessor.checkAvailabilityAndPrices(hotelIds, roomTypeQuery.getCheckIn(), roomTypeQuery.getCheckOut(), HotelProcessor.getArrayOfRoomInfoByNum(roomTypeQuery.getPeopleNum()));
        if(CollectionUtils.isNotEmpty(hotels)){
            List<RoomType> roomTypes = hotels.get(0).getRoomTypes().getRoomType();
            if(CollectionUtils.isNotEmpty(roomTypes)){
                List<HotelRoomTypeVO> hotelRoomTypeVOS = HotelProcessor.convertRoomTypeList(roomTypes);
                return getSuccessJsonResult(hotelRoomTypeVOS);
            }
        }
        return getFailedJsonResult(Constant.DATA_EMPTY);
    }


}
