package com.citi.backend.dao;

import com.citi.backend.entity.StockHold;

public interface StockHoldMapper {
    int deleteByPrimaryKey(String stockHoldId);

    int insert(StockHold row);

    int insertSelective(StockHold row);

    StockHold selectByPrimaryKey(String stockHoldId);

    int updateByPrimaryKeySelective(StockHold row);

    int updateByPrimaryKey(StockHold row);
}