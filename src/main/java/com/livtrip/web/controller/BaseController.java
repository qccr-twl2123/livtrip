package com.livtrip.web.controller;

import com.alibaba.fastjson.JSON;
import com.livtrip.web.constant.Constant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xierongli on 17/6/2.
 */
public class BaseController {

  public final static Logger logger = LoggerFactory.getLogger(BaseController.class);

  public String getSuccessJsonResult(Object data){
    Map<String, Object> resultMap = new HashMap<String, Object>();
    resultMap.put("data", JSON.toJSONString(data));
    resultMap.put("success", true);
    resultMap.put("message", Constant.SUCCESS);
    return JSON.toJSONString(resultMap);
  }

  public String getFailedJsonResult(String errorMsg){
    Map<String, Object> resultMap = new HashMap<String, Object>();
    resultMap.put("success", false);
    resultMap.put("message", errorMsg);
    return JSON.toJSONString(resultMap);
  }
}
