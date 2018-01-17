package com.livtrip.web.util;

import java.util.*;

/**
 * @author xierongli
 * @version $$Id: livtrip, v 0.1 18/1/15 上午9:38 mark1xie Exp $$
 */

public class IteratorExample {

    public static void main(String args[]){
        List<String> myList = new ArrayList<String>();

        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");

        Iterator<String> it = myList.iterator();
        while(it.hasNext()){
            String value = it.next();
            if(value.equals("3")){
                System.out.println("----");
                it.remove();
            }
        }
        for(String str : myList){
            System.out.println("List Value:"+str);
        }

        Map<String,String> myMap = new HashMap<String,String>();
        myMap.put("1", "1");
        myMap.put("2", "2");
        myMap.put("3", "3");

        Iterator<String> it1 = myMap.keySet().iterator();
        while(it1.hasNext()){
            String key = it1.next();
            System.out.println("Map Value:"+myMap.get(key));
            if(key.equals("2")){
                myMap.put("1","4");
                //myMap.put("4", "4");
            }
        }

    }
}
