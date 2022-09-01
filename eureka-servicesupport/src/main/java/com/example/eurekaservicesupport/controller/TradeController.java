package com.example.eurekaservicesupport.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.example.eurekaservicesupport.service.TradeService;
import org.springframework.web.bind.annotation.*;


@RestController
public class TradeController {
    @Resource
    TradeService tradeService;

    @GetMapping("/getTableData")
    @CrossOrigin
    public Map<String, Object> getTableData(@RequestParam(required = false) Map<String, Object> queryInfo){
        Map<String, Object> trades = tradeService.getTrade(queryInfo);
        return trades;
    }

    @PostMapping("/buyStock")
    @CrossOrigin
    public boolean buyStock(@RequestBody Map<String, Object> tradeInfo){

        try{
            tradeService.buyStock(tradeInfo);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @PostMapping("/sellStock")
    @CrossOrigin
    public Boolean sellStock(@RequestBody Map<String, Object> tradeInfo){
        try {
            tradeService.sellStock(tradeInfo);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
