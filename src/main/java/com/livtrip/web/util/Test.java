package com.livtrip.web.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author xierongli
 * @version $$Id: livtrip, v 0.1 18/1/15 上午11:36 mark1xie Exp $$
 */
public class Test {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i=1; i<50; i++){
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("thread---");
                    Handler.test();
                }
            });
        }
    }


}
