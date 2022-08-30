package com.citi.backend.service;

import java.util.List;

import com.citi.backend.entity.StockHold;

public interface StockHoldService {
    public List<StockHold> getStockHold(int clientId);
}
