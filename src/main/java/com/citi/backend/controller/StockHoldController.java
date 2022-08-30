package com.citi.backend.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citi.backend.entity.StockHold;
import com.citi.backend.service.StockHoldService;

@RestController
public class StockHoldController {

    @Resource
    StockHoldService stockHoldService;

    @GetMapping("/getStockHold")
    @CrossOrigin
    public List<StockHold> getStockHold(int clientId){
        return stockHoldService.getStockHold(clientId);
    }
}
