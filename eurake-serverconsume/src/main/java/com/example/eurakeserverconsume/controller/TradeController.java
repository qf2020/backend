package com.example.eurakeserverconsume.controller;

import com.example.eurakeserverconsume.service.ConsumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@RestController
public class TradeController {

    @Autowired
    private ConsumeService consumeService;

    @GetMapping("/getTableData")
    @CrossOrigin
    public List<Object> getTableData(Map<String, Object> queryInfo){
       return consumeService.getTableData(queryInfo);
    }

    @PostMapping("/buyStock")
    @CrossOrigin
    public void buyStock(@RequestBody Map<String, Object> tradeInfo){
            consumeService.buyStock(tradeInfo);
    }
}
