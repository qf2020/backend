package com.citi.backend.dao;

import com.citi.backend.entity.Stock;

public interface StockMapper {
    int deleteByPrimaryKey(Integer stockId);

    int insert(Stock row);

    int insertSelective(Stock row);

    Stock selectByPrimaryKey(Integer stockId);

    int updateByPrimaryKeySelective(Stock row);

    int updateByPrimaryKey(Stock row);
}