package com.citi.backend.service.impl;

import com.citi.backend.dao.StockHoldMapper;
import com.citi.backend.entity.StockHold;
import com.citi.backend.service.StockHoldService;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class StockHoldImpI implements StockHoldService {

    @Resource
    StockHoldMapper stockHoldMapper;

    @Override
    public List<StockHold> getStockHold(int clientId) {
        return stockHoldMapper.selectByClientId(clientId);
    }
    
}
