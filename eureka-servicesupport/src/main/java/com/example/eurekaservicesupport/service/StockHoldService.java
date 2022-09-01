package com.example.eurekaservicesupport.service;


import java.util.List;
import java.util.Map;


public interface StockHoldService {
    public List<Map<String, Object>> getStockHold(Integer clientId, Integer pageSize, Integer currentPage);
}
