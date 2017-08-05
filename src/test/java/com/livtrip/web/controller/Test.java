package com.livtrip.web.controller;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Optional;
import com.xiaoleilu.hutool.convert.Convert;

import java.util.Set;

/**
 * Created by xierongli on 17/6/29.
 */
public class Test {

    public static void main(String[] args) {
        UserReq userReq = new UserReq();
        userReq.setName("mark");
        User user = Convert.convert(User.class,userReq);
        System.out.println(JSON.toJSONString(user));
    }

}
