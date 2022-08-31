package com.citi.backend.service;

import java.util.List;

import com.citi.backend.entity.Stock;

public interface StockService {
    Stock getStockByTicker(String ticker); 
    List<Stock> getAllStock();
}
