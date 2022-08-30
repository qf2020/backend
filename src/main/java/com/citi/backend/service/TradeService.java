package com.citi.backend.service;

import java.util.List;
import java.util.Map;

import com.citi.backend.entity.Trade;

public interface TradeService {
    List<Trade> getTrade(Map<String, Object> queryInfo);
    void buyStock(Map<String, Object> tradeInfo);
}
