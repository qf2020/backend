package com.example.eurakeserverconsume.controller;

import com.example.eurakeserverconsume.service.ConsumeService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class TradeController {

    @Autowired
    private ConsumeService consumeService;

    @GetMapping("/getTableData")
    //@HystrixCommand(fallbackMethod = "error_code")
    @CrossOrigin
    public Object getTableData(Map<String, Object> queryInfo){
       return consumeService.getTableData(queryInfo);
    }
    public Object error_code(Map<String, Object> queryInfo){
        Map<String,Object> tp = new HashMap<>();
        tp.put("false","服务器异常");
        return tp;
    }
    @PostMapping("/buyStock")
    @HystrixCommand(fallbackMethod = "error_code")
    @CrossOrigin
    public void buyStock(@RequestBody Map<String, Object> tradeInfo){
            consumeService.buyStock(tradeInfo);
    }

}
