package com.example.eurekaservicesupport.service.impl;

import com.example.eurekaservicesupport.controller.SalesPersonController;
import com.example.eurekaservicesupport.dao.SalesPersonMapper;
import com.example.eurekaservicesupport.service.SalesPersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class SalesPersonImpl implements SalesPersonService {
    @Resource
    SalesPersonMapper salesPersonMapper;

    public List<Map<String,Object>> getMatchSalesperson(String key){
        return  salesPersonMapper.selectByPrimaryKey(key);
    }
}
