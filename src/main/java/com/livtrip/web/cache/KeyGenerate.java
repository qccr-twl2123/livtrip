package com.livtrip.web.cache;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * key生成器
 * Created by xierongli on 17/8/5.
 */
public class KeyGenerate {
    public final static Logger logger = LoggerFactory.getLogger(KeyGenerate.class);


    public static String generateHotelKey(Object... objects){
        StringBuilder sb = new StringBuilder();
        for(Object object : objects){
            sb.append(JSON.toJSONString(object)).append("-");
        }
        logger.info("hotel cache key:"+ sb.toString());
        return sb.toString();
    }
}
