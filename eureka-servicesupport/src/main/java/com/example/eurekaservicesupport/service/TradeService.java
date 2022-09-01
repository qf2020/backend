package com.example.eurekaservicesupport.service;


import java.util.Map;


public interface TradeService {
    Map<String, Object> getTrade(Map<String, Object> queryInfo);
    void buyStock(Map<String, Object> tradeInfo);
    void sellStock(Map<String, Object> tradeInfo);
}
