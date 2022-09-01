package com.example.eurekaservicesupport.service.impl;


import com.example.eurekaservicesupport.dao.StockHoldMapper;
import com.example.eurekaservicesupport.service.StockHoldService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StockHoldImpI implements StockHoldService {

    @Resource
    StockHoldMapper stockHoldMapper;

    @Override
    public Map<String, Object> getStockHold(Integer clientId, Integer pageSize, Integer currentPage) {
        Integer startIndex = null;
        if(pageSize != null & currentPage != null){
            startIndex = (currentPage - 1) * pageSize;
        }
        Map<String, Object> map = new HashMap<String, Object>();
        List<Map<String, Object>> list = stockHoldMapper.selectByClientId(clientId,startIndex,pageSize);
        Integer total = stockHoldMapper.countAll(clientId);
        map.put("total", total);
        map.put("dataList", list);
        return map;
    }
    
}
