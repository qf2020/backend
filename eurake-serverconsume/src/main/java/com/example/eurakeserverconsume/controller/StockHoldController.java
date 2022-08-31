package com.example.eurakeserverconsume.controller;

import com.example.eurakeserverconsume.service.ConsumeService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class StockHoldController {
    public String errorcode(String s){
        return s+"error request";
    }
    @Autowired
    private ConsumeService consumeService;

    @GetMapping("/getStockHold")
    @HystrixCommand(fallbackMethod = "errorcode")
    @CrossOrigin
    public List<Object> getStockHold(int clientId){
        return consumeService.getStockHold(clientId);
    }

}
