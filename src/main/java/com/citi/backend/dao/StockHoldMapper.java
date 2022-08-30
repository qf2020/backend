package com.citi.backend.dao;

import java.util.List;

import com.citi.backend.entity.StockHold;
import com.citi.backend.entity.StockHoldKey;

public interface StockHoldMapper {
    int deleteByPrimaryKey(StockHoldKey key);

    int insert(StockHold row);

    int insertSelective(StockHold row);

    StockHold selectByPrimaryKey(StockHoldKey key);

    int updateByPrimaryKeySelective(StockHold row);

    int updateByPrimaryKey(StockHold row);

    int updateStock(StockHold row);

    List<StockHold> selectByClientId(int clientId);
}