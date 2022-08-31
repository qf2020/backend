package com.citi.backend.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.citi.backend.dao.StockMapper;
import com.citi.backend.entity.Stock;
import com.citi.backend.service.StockService;

@Service
public class StockServiceImpl implements StockService {

    @Resource
    private StockMapper stockMapper;

    @Override
    public Stock getStockByTicker(String ticker) {
        Stock stock = stockMapper.selectByName(ticker);
        return stock;
    }

    @Override
    public List<Stock> getAllStock() {
        List<Stock> stocks = stockMapper.selectAll();
        return stocks;
    }
    
}
