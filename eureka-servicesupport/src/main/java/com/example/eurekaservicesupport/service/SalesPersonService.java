package com.example.eurekaservicesupport.service;

import com.example.eurekaservicesupport.enums.FrequencyEnum;

import java.util.List;
import java.util.Map;

public interface SalesPersonService {
    List<Map<String,Object>> getMatchSalesperson(String key);

}
