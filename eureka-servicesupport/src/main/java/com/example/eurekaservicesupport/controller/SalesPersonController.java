package com.example.eurekaservicesupport.controller;

import com.example.eurekaservicesupport.service.SalesPersonService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/salesPerson")
public class SalesPersonController {
    @Resource
    SalesPersonService salesPersonService;

    @GetMapping("/getMatchSalesperson")
    @CrossOrigin
    public Map<String,List<Map<String,Object>>> getMatchSalesperson(@RequestParam("key") String key){
        List<Map<String,Object>> tickers = salesPersonService.getMatchSalesperson("%"+key+"%");
        Map<String,List<Map<String,Object>>> map = new HashMap<>();
        map.put("salespersonList", tickers);
        return map;
    }

}
