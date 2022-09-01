package com.example.eurakeserverconsume.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient("servicesuppot")
@Service
public interface ConsumeService {
        @GetMapping("/HEL/WOR")
        public String hello();
        @GetMapping("/tradeStatistc/search")
        public List<Map<String,Object>> getChart(@RequestParam("fre")String fre);

        @GetMapping("/insert")
        public int mailSizeSend(@RequestParam("client_id")Integer id, @RequestParam("client_name")String name, @RequestParam("password")String password);
        @GetMapping("/getTableData")
        public List<Object> getTableData(@RequestParam("queryInfo") Map<String, Object> queryInfo);//
        @PostMapping("/buyStock")
        public boolean buyStock(@RequestBody Map<String, Object> tradeInfo);
        @GetMapping("/getStockHold")
        public List<Object> getStockHold(@RequestParam("clientId")int clientId);

        @PostMapping("/client/register")
        public boolean register(@RequestBody Object client);

        @PostMapping("/client/login")
        public Object login(@RequestBody Object loginRequest);

        @PostMapping("/client/changePassword")
        public Boolean changePassword(@RequestBody Map<String, Object> changePasswordRequest);

        @GetMapping("/stock/getAllStock")
        public List<Object> getAllStock(@RequestParam(required = false) Map<String, Object> queryInfo);

        @GetMapping("/stock/getStockByTicker")
        public Object getStockByTicker(@RequestParam("ticker") String ticker);

        @PostMapping("/sellStock")
        public Boolean sellStock(@RequestBody Map<String, Object> tradeInfo);

}


