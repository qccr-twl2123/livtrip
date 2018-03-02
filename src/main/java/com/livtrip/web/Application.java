package com.livtrip.web;

import com.livtrip.web.enums.States;
import com.livtrip.web.util.SpringUtil;
import com.livtrip.web.enums.Events;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.support.ErrorPageFilter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.statemachine.StateMachine;

@SuppressWarnings("deprecation")
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    private static final Logger				LOG					= LoggerFactory.getLogger(Application.class);

    private static Class<Application>	applicationClass	= Application.class;

    @Autowired
    private StateMachine<States, Events> stateMachine;

    public static void main(String[] args) {
        final ApplicationContext  applicationContext=SpringApplication.run(Application.class, args);
        SpringUtil.setApplicationContext(applicationContext);
    }

    @Bean
    public ErrorPageFilter errorPageFilter() {
        return new ErrorPageFilter();
    }

    @Bean
    public FilterRegistrationBean disableSpringBootErrorFilter(ErrorPageFilter filter) {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(filter);
        filterRegistrationBean.setEnabled(false);
        return filterRegistrationBean;
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }



}
