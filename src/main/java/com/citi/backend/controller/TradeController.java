package com.citi.backend.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.citi.backend.entity.Trade;
import com.citi.backend.service.TradeService;

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
}
