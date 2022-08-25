package com.citi.backend.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.citi.backend.dao.TradeMapper;
import com.citi.backend.entity.Trade;
import com.citi.backend.service.TradeService;

public class TradeServiceImpl implements TradeService {

    @Resource
    TradeMapper tradeMapper;
    
    @Override
    public List<Trade> getTrade() {
        return null;
    }
    
}
