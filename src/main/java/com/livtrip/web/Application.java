package com.livtrip.web;

import com.livtrip.web.util.SpringUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.support.ErrorPageFilter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SuppressWarnings("deprecation")
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

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





}
