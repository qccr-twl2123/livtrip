package com.livtrip.web.aspect;

import com.alibaba.fastjson.JSON;
import com.google.common.eventbus.EventBus;
import com.livtrip.web.event.EventBusFactory;
import com.livtrip.web.event.LogEvent;
import com.livtrip.web.service.InvokeLogService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * Created by xierongli on 17/6/20.
 */
@Aspect
@Component
public class ControllerAspect {


    ThreadLocal<Long> startTime = new ThreadLocal<Long>();
    ThreadLocal<LogEvent> logEventThreadLocal = new ThreadLocal<LogEvent>(){
        @Override
        protected LogEvent initialValue() {
            return new LogEvent();
        }
    };
    EventBus eventBus = EventBusFactory.getIstance();

    @Autowired
    private InvokeLogService invokeLogService;

    @Pointcut("execution(public * com.livtrip.web.controller..*.*(..))")
    public void webLog(){}

    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        startTime.set(System.currentTimeMillis());
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        generateLogEvent(joinPoint,request);
    }


    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable {
        LogEvent logEvent = logEventThreadLocal.get();
        Long cost = System.currentTimeMillis() - startTime.get();
        logEvent.setCost(cost.intValue());
        eventBus.register(invokeLogService);
        eventBus.post(logEvent);
    }

    public void generateLogEvent(JoinPoint joinPoint,HttpServletRequest request){
        LogEvent logEvent = logEventThreadLocal.get();
        logEvent.setClassExpression(joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        logEvent.setIp(request.getRemoteAddr());
        logEvent.setParams(JSON.toJSONString(Arrays.toString(joinPoint.getArgs())));
        logEvent.setUrl(request.getRequestURL().toString());
    }

}
