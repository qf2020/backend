package com.citi.backend.service;

import com.citi.backend.entity.Trade;
import com.citi.backend.entity.TradeStatistic;
import com.citi.backend.enums.FrequencyEnum;

import java.util.List;
import java.util.Map;

public interface TradeStatisticService {
    List<Map<String,Object>> getChart(FrequencyEnum fre);
}
