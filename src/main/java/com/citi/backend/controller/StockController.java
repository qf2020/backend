package com.citi.backend.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citi.backend.entity.Stock;
import com.citi.backend.service.StockService;

@RestController
@RequestMapping("/stock")
public class StockController {
    
    @Resource
    StockService stockService;

    @GetMapping("/getAllStock")
    @CrossOrigin
    public List<Stock> getAllStock(){
        return stockService.getAllStock();
    }

    @GetMapping("/getStockByTicker")
    @CrossOrigin
    public Stock getStockByTicker(String ticker){
        return stockService.getStockByTicker(ticker);
    }
}
