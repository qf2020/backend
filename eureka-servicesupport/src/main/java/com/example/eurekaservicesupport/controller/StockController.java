package com.example.eurekaservicesupport.controller;

import java.util.HashMap;
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

    @GetMapping("/getMatchTicker")
    @CrossOrigin
    public Map<String, List<String>> getMatchTicker(String ticker){
        List<String> tickers = stockService.getMatchTicker("%"+ticker+"%");
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        map.put("tickerList", tickers);
        return map;
    }

    @GetMapping("/getMatchRic")
    @CrossOrigin
    public Map<String,List<String>> getMatchRic(String ticker,String ric){
        Map<String ,List<String>> n = new HashMap<>();
        n.put("ricList",stockService.getMatchRic(ticker,"%"+ric+"%"));
        return n;
    }
    @GetMapping("/getMatchStock")
    @CrossOrigin
    public Map<String,Map<String,Object>> getMatchStock(String ticker,String ric){
        Map<String ,Map<String,Object>> n = new HashMap<>();
        n.put("stock",stockService.getMatchStock(ticker,ric));
        return n;
    }
}