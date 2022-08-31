package com.example.eurekaservicesupport.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.eurekaservicesupport.entity.Stock;
import com.example.eurekaservicesupport.service.StockService;


@RestController
@RequestMapping("/stock")
public class StockController {
    
    @Resource
    StockService stockService;

    @GetMapping("/getAllStock")
    @CrossOrigin
    public List<Stock> getAllStock(@RequestParam(required = false) Map<String, Object> queryInfo){
        return stockService.getAllStock(queryInfo);
    }

    @GetMapping("/getStockByTicker")
    @CrossOrigin
    public Stock getStockByTicker(String ticker){
        return stockService.getStockByTicker(ticker);
    }
}