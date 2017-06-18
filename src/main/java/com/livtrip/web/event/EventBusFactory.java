package com.livtrip.web.event;


import com.google.common.eventbus.EventBus;

/**
 * Created by xierongli on 17/5/11.
 */
public class EventBusFactory {

    private static EventBus instance = null;
    private EventBusFactory(){}


    public static EventBus getIstance() {
        if (instance == null) {
            synchronized (EventBus.class) {
                if (instance == null) {
                    instance = new EventBus();
                }
            }
        }
        return instance;
    }

}
