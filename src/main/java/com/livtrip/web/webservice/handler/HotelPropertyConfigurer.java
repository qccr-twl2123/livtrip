package com.livtrip.web.webservice.handler;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by xierongli on 17/6/16.
 */
public class HotelPropertyConfigurer {


        private static Properties properties;

        static {
            properties = new Properties();
            try {
                properties.load(HotelPropertyConfigurer.class.getResourceAsStream("/tourico.properties"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static String getValue(String key) {
            return properties.getProperty(key);
        }

        public static int getIntValue(String key) {
            return Integer.parseInt(properties.getProperty(key));
        }

        public static boolean getBooleanValue(String key) {
            return Boolean.parseBoolean(properties.getProperty(key));
        }

        public static final  String GETHOTELFLOWWSDL = properties.getProperty("hotelflow.wsdl");

        public static final String GETHOTELFLOWUSERNAME = properties.getProperty("hotelflow.username");

        public static final String GETHOTELFLOWPWD = properties.getProperty("hotelflow.password");

        public static final String GETDESTINATIONWSDL = properties.getProperty("destination.wsdl");

        public static final String GETDESTINATIONUSERNAME = properties.getProperty("hotelflow.username");

        public static final String GETDESTINATIONPWD = properties.getProperty("hotelflow.password");


}
