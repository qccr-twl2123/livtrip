package com.livtrip.web.util;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author xierongli
 * @version $$Id: livtrip, v 0.1 18/1/15 上午11:39 mark1xie Exp $$
 */
public class Handler {


    public static  void test(){
        List<String> stringList = Lists.newArrayList();
        stringList.add("a1");
        stringList.add("a2");
        stringList.add("a3");

        for(String str : stringList){
            System.out.println(str);
        }
    }
}
