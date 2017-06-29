package com.livtrip.web.controller;

import com.google.common.base.Splitter;

/**
 * Created by xierongli on 17/6/29.
 */
public class Test1 {

    public static void main(String[] args) {
        String testString = "foo,what,more,";
        Iterable<String> split = Splitter.on(",").omitEmptyStrings().trimResults().split(testString);
        while (split.iterator().hasNext()){
            System.out.println(split.iterator().next());
        }
    }
}
