package com.citi.backend.service;

import java.util.List;

import com.citi.backend.entity.Trade;
import com.citi.backend.enums.FrequencyEnum;

public interface TradeService {
    List<Trade> getTrade(FrequencyEnum fre, int pageSize, int currentPage);
}