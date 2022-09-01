package com.example.eurakeserverconsume.controller;

import com.example.eurakeserverconsume.res.ERROR;
import com.example.eurakeserverconsume.res.SUCCESS;
import com.example.eurakeserverconsume.service.ConsumeService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/stock")
public class StockController {
    @Autowired
    private ConsumeService consumeService;


//    @HystrixCommand(fallbackMethod = "error_code")
//
//    public Object error_code(@RequestBody Object client){
//        Map<String,Object> tp = new HashMap<>();
//        tp.put("false","服务器异常");
//        return tp;
//    }
    @GetMapping("/getAllStock")
    @CrossOrigin
    public Object getAllStock(@RequestParam(required = false) Map<String, Object> queryInfo){
        return new SUCCESS(consumeService.getAllStock(queryInfo));
    }

    @GetMapping("/getStockByTicker")
    @CrossOrigin
    public Object getStockByTicker(String ticker){
        return new SUCCESS(consumeService.getStockByTicker(ticker));
    }

    @GetMapping("/getMatchTicker")
    @CrossOrigin
    public Object getMatchTicker(String ticker){
        return new SUCCESS(consumeService.getMatchTicker(ticker));
    }

    @GetMapping("/getMatchRic")
    @CrossOrigin
    public Object getMatchRic(String ticker,String ric){
        return new SUCCESS(consumeService.getMatchRic(ticker,ric));
    }

    @GetMapping("/getMatchStock")
    @CrossOrigin
    public Object getMatchStock(String ticker,String ric){
        return new SUCCESS(consumeService.getMatchStock(ticker,ric));
    }
}
