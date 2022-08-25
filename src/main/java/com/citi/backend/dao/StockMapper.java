package com.citi.backend.dao;

import com.citi.backend.entity.Stock;

public interface StockMapper {
    int deleteByPrimaryKey(String stockId);

    int insert(Stock row);

    int insertSelective(Stock row);

    Stock selectByPrimaryKey(String stockId);

    int updateByPrimaryKeySelective(Stock row);

    int updateByPrimaryKey(Stock row);
}