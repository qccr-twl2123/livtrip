package com.livtrip.web.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.livtrip.web.domain.Dest;
import com.livtrip.web.model.query.DestQuery;
import com.livtrip.web.service.DestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xierongli on 17/6/17.
 */
@Controller
@RequestMapping("/backend/dest")
public class DestController extends BaseController{

    @Autowired
    private DestService destService;
//    @Autowired
//    private HotelEventBus hotelEventBus;


    @RequestMapping("list")
    public String list(DestQuery destQuery, ModelMap modelMap){
        PageInfo<Dest> destPageInfo = destService.pageQueryListByCondition(destQuery);
        modelMap.put("page", destPageInfo);
        modelMap.put("cityName", destQuery.getCityName());
        modelMap.put("state",destQuery.getState());
        modelMap.put("destinationId", destQuery.getDestinationId());
        System.out.println(JSON.toJSONString(destPageInfo));
        return "/backend/dest/list";
    }

//    @RequestMapping("fetch")
//    @ResponseBody
//    public String fetch(Integer destinationId){
//        ExecutorService executor = Executors.newSingleThreadExecutor();
//        executor.submit(new Runnable() {
//            @Override
//            public void run() {
//                hotelEventBus.productFetchTask(destinationId);
//            }
//        });
//        return getSuccessJsonResult(Constant.SUCCESS);
//    }
}
