package com.citi.backend.dao;

import com.citi.backend.entity.Trade;

public interface TradeMapper {
    int deleteByPrimaryKey(String tradeId);

    int insert(Trade row);

    int insertSelective(Trade row);

    Trade selectByPrimaryKey(String tradeId);

    int updateByPrimaryKeySelective(Trade row);

    int updateByPrimaryKey(Trade row);
}