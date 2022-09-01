package com.example.eurekaservicesupport.service;

import java.util.List;
import java.util.Map;

import com.example.eurekaservicesupport.entity.Stock;

public interface StockService {
    Stock getStockByTicker(String ticker); 
    List<Stock> getAllStock(Map<String, Object> queryInfo);
    List<String> getMatchTicker(String ticker);
    List<String> getMatchRic(String ticker,String ric);
    Map<String,Object> getMatchStock(String ticker,String ric);
}