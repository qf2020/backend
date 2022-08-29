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
import com.citi.backend.enums.FrequencyEnum;
import com.citi.backend.service.TradeService;

@RestController
public class TradeController {
    @Resource
    TradeService tradeService;

    @GetMapping("/getTableData")
    @CrossOrigin
    public List<Trade> getTrade(String fre, int pageSize, int currentPage){
        List<Trade> trades = tradeService.getTrade(FrequencyEnum.valueOf("_" + fre), pageSize, currentPage);
        return trades;
    }

    @PostMapping("/buyStock")
    @CrossOrigin
    public Boolean buyStock(@RequestBody Map<String, Object> tradeInfo){
        try {
            tradeService.buyStock(tradeInfo);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
