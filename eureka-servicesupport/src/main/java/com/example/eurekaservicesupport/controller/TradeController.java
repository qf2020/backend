package com.example.eurekaservicesupport.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.example.eurekaservicesupport.entity.Trade;
import com.example.eurekaservicesupport.service.TradeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TradeController {
    @Resource
    TradeService tradeService;

    @GetMapping("/getTableData")
    @CrossOrigin
    public List<Trade> getTableData(Map<String, Object> queryInfo){
        List<Trade> trades = tradeService.getTrade(queryInfo);
        return trades;
    }

    @PostMapping("/buyStock")
    @CrossOrigin
    public void buyStock(@RequestBody Map<String, Object> tradeInfo){
            tradeService.buyStock(tradeInfo);
    }

    @PostMapping("/sellStock")
    @CrossOrigin
    public void sellStock(@RequestBody Map<String, Object> tradeInfo){
            tradeService.sellStock(tradeInfo);
    }
}
