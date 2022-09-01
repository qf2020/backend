package com.example.eurekaservicesupport.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.eurekaservicesupport.dao.StockMapper;
import com.example.eurekaservicesupport.entity.Stock;
import com.example.eurekaservicesupport.service.StockService;

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
    public List<Stock> getAllStock(Map<String, Object> queryInfo) {
        Integer startIndex = null;
        Integer pageSize = null;
        System.out.println("===========================");
        System.out.println(queryInfo);
        if(queryInfo.containsKey("pageSize") & queryInfo.containsKey("currentPage")){
            pageSize = Integer.parseInt((String)queryInfo.get("pageSize"));
            Integer currentPage = Integer.parseInt((String)queryInfo.get("currentPage"));
            startIndex = (currentPage - 1) * pageSize;
        }
        List<Stock> stocks = stockMapper.selectAll(startIndex, pageSize);
        return stocks;
    }

    @Override
    public List<String> getMatchTicker(String ticker) {
        return stockMapper.getMatchTicker(ticker);
    }
    public List<String> getMatchRic(String ticker,String ric){
        return stockMapper.getMatchRic(ticker,ric);
    }
    public Map<String,Object> getMatchStock(String ticker,String ric){
        return stockMapper.getMatchStock(ticker,ric);
    }
}
