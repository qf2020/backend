package com.example.eurakeserverconsume.controller;

import com.example.eurakeserverconsume.service.ConsumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class StockHoldController {

    @Autowired
    private ConsumeService consumeService;

    @GetMapping("/getStockHold")
    @CrossOrigin
    public List<Object> getStockHold(int clientId){
        return consumeService.getStockHold(clientId);
    }
}
