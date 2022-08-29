package com.citi.backend.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import com.citi.backend.entity.Trade;
import com.citi.backend.enums.FrequencyEnum;
import com.citi.backend.service.TradeService;

@Controller
public class TradeController {
    @Resource
    TradeService tradeService;

    @GetMapping("/gettrade")
    @CrossOrigin
    public List<Trade> getTrade(String fre, int pageSize, int currentPage){
        List<Trade> trades = tradeService.getTrade(FrequencyEnum.valueOf("_" + fre), pageSize, currentPage);
        return trades;
    }
}
