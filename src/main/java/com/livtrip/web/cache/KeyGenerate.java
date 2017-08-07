package com.livtrip.web.cache;

import com.alibaba.fastjson.JSON;

/**
 * key生成器
 * Created by xierongli on 17/8/5.
 */
public class KeyGenerate {

    public static String generateHotelKey(Object... objects){
        StringBuilder sb = new StringBuilder();
        for(Object object : objects){
            sb.append(JSON.toJSONString(object)).append("-");
        }
        return sb.toString();
    }
}
