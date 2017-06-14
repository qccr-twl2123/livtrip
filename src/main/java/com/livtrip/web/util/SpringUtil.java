package com.livtrip.web.util;

import org.springframework.context.ApplicationContext;

public class SpringUtil {
	private static ApplicationContext applicationContext;

	public static void setApplicationContext(ApplicationContext context) {
	    applicationContext = context;
	}
	
	public static Object getBean(String name){

		return getApplicationContext().getBean(name);

	}

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}
	  
}
