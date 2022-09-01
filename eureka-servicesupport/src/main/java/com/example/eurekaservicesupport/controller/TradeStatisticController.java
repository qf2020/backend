package com.example.eurekaservicesupport.controller;



import com.example.eurekaservicesupport.enums.FrequencyEnum;
import com.example.eurekaservicesupport.service.TradeStatisticService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/tradeStatistc")
public class TradeStatisticController {
    @Resource
    TradeStatisticService tradeStatisticService;

    @GetMapping("/search")
    @CrossOrigin
    public Map<String,Object> getChart(String fre){

        List<Map<String,Object>> tradeStatistic = tradeStatisticService.getChart(FrequencyEnum.valueOf("_" + fre));
        List<Object> dateList = new ArrayList<>();
        List<Object> buySeries = new ArrayList<>();
        List<Object> sellSeries = new ArrayList<>();
        for(Map<String,Object> k:tradeStatistic){
            dateList.add(k.get("statistic_date"));
            buySeries.add(k.get("total_buy"));
            sellSeries.add(k.get("total_sell"));
        }

        Map<String,Object> k1 = new HashMap<>();

        k1.put("dateList",dateList);
        k1.put("buySeries",buySeries);
        k1.put("sellSeries",sellSeries);



        return k1;
    }
}
