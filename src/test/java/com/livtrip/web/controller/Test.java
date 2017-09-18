package com.livtrip.web.controller;


import org.assertj.core.util.Lists;

import java.util.List;

/**
 * Created by xierongli on 17/6/29.
 */
public class Test {

    public static void main(String[] args) {

        List<String> list = Lists.newArrayList();
        list.add("a");
        list.add("b");
        list.add("c");

        String  a = list.get(0);
        a= "555";
        for (String str : list){
            System.out.println(str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ab").append("cd");
    }

}
