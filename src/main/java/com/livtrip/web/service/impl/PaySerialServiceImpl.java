package com.livtrip.web.service.impl;

import com.livtrip.web.domain.PaySerial;
import com.livtrip.web.domain.PaySerialCriteria;
import com.livtrip.web.mapper.PaySerialMapper;
import com.livtrip.web.model.request.AliPayNotifyReq;
import com.livtrip.web.service.PaySerialService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xierongli on 17/8/6.
 */
@Service
public class PaySerialServiceImpl implements PaySerialService {

    @Autowired
    private PaySerialMapper paySerialMapper;

    @Override
    public int update(AliPayNotifyReq aliPayNotifyReq) {
        PaySerialCriteria paySerialCriteria = new PaySerialCriteria();
        paySerialCriteria.createCriteria().andOutTradeNoEqualTo(aliPayNotifyReq.getOut_trade_no());
        List<PaySerial> paySerialList = paySerialMapper.selectByCriteria(paySerialCriteria);
        if(CollectionUtils.isNotEmpty(paySerialList)){
            PaySerial paySerial = paySerialList.get(0);
            paySerial.setBillNo(aliPayNotifyReq.getTrade_no());
            paySerial.setPayAccount(aliPayNotifyReq.getBuyer_id());
            paySerial.setMerId(aliPayNotifyReq.getSeller_id());
            paySerial.setStatus(2);
            return paySerialMapper.updateByCriteria(paySerial,paySerialCriteria);
        }
        return 0;
    }
}
