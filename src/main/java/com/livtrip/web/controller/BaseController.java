package com.livtrip.web.controller;

import com.alibaba.fastjson.JSON;
import com.livtrip.web.constant.Constant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by xierongli on 17/6/2.
 */
public class BaseController {

  public final static Logger logger = LoggerFactory.getLogger(BaseController.class);

  @InitBinder
  public void InitBinder(WebDataBinder dataBinder) {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    dateFormat.setLenient(false);
    dataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
  }

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

  public String getIRealIPAddr(HttpServletRequest request) {
    String ip = request.getHeader("x-forwarded-for");
    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip) || "null".equalsIgnoreCase(ip))    {
      ip = request.getHeader("Proxy-Client-IP");
    }
    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)   || "null".equalsIgnoreCase(ip)) {
      ip = request.getHeader("WL-Proxy-Client-IP");
    }
    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)    || "null".equalsIgnoreCase(ip)) {
      ip = request.getRemoteAddr();
    }
    return ip;
  }
}
