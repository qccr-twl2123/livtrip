package com.livtrip.web.service.impl;

import com.google.common.eventbus.Subscribe;
import com.livtrip.web.domain.InvokeLog;
import com.livtrip.web.event.LogEvent;
import com.livtrip.web.mapper.InvokeLogMapper;
import com.livtrip.web.service.InvokeLogService;
import com.livtrip.web.util.ObjectConvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by xierongli on 17/7/29.
 */
@Service
public class InvokeLogServiceImpl implements InvokeLogService {

    @Autowired
    private InvokeLogMapper invokeLogMapper;


    @Subscribe
    public void addLog(LogEvent logEvent){
        InvokeLog invokeLog = ObjectConvert.convertObject(logEvent,InvokeLog.class);
        insert(invokeLog);
    }


    @Override
    public void insert(InvokeLog invokeLog) {
        invokeLogMapper.insertSelective(invokeLog);
    }
}
