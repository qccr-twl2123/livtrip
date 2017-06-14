package com.livtrip.web;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.livtrip.web.enums.States;
import com.livtrip.web.util.SpringUtil;
import com.livtrip.web.enums.Events;
import com.livtrip.web.framework.ds.DBContextHolder;
import com.livtrip.web.framework.ds.DynamicDataSource;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.apache.tomcat.jdbc.pool.PoolConfiguration;
import org.apache.tomcat.jdbc.pool.PoolProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
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

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }

    @Bean
    public CommandLineRunner commandLineRunner(final ApplicationContext ctx) {
        return new CommandLineRunner() {

            @Override
            public void run(String... args) throws Exception {
                System.out.println("init ---------");
                stateMachine.start();
                String[] beanNames = ctx.getBeanDefinitionNames();
                Arrays.sort(beanNames);
                for (String bn : beanNames) {
                    LOG.info(bn);
                }
            }
        };
    }

    @Bean
    public EmbeddedServletContainerCustomizer containerCustomizer(){
        return new EmbeddedServletContainerCustomizer() {
            @Override
            public void customize(ConfigurableEmbeddedServletContainer container) {
                container.setSessionTimeout(600);//单位为S
            }
        };
    }


    @Bean
    @Primary
    public javax.sql.DataSource jkwebDynamicDataSource() throws Exception {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        Map<Object, Object> targetDataSources = new HashMap<Object, Object>();
        DataSource dataSourceMaster = new DataSource(trbsPoolConfiguration());
        dataSourceMaster.createPool();
        targetDataSources.put(DBContextHolder.DATA_SOURCE_MASTER, dataSourceMaster);
        //targetDataSources.put(DBContextHolder.DATA_SOURCE_SLAVER, dataSourceMaster);
        dynamicDataSource.setTargetDataSources(targetDataSources);
        dynamicDataSource.setDefaultTargetDataSource(dataSourceMaster);
        return dynamicDataSource;
    }

    @Bean
    @ConfigurationProperties(prefix="app.thread.pool")
    public ThreadPoolTaskExecutor taskExecutor() {
        return new ThreadPoolTaskExecutor();
    }

    @Bean
    @ConfigurationProperties("app.datasource.trbs")
    public PoolConfiguration trbsPoolConfiguration() {
        return new PoolProperties();
    }

    @Bean(initMethod = "createPool")
    public DataSource trbsDataSource() {
        return new DataSource(trbsPoolConfiguration());
    }

    @Bean
    public JdbcTemplate trbsJdbcTemplate() {
        return new JdbcTemplate(trbsDataSource());
    }
}
