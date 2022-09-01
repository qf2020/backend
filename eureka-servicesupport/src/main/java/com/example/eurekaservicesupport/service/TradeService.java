package com.example.eurekaservicesupport.service;


import java.util.List;
import java.util.Map;


public interface TradeService {
    List<Map<String, Object>> getTrade(Map<String, Object> queryInfo);
    void buyStock(Map<String, Object> tradeInfo);
    void sellStock(Map<String, Object> tradeInfo);
}
