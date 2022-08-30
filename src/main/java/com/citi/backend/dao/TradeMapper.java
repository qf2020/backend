package com.citi.backend.dao;

import java.util.List;

import com.citi.backend.entity.Trade;
import com.citi.backend.entity.TradeKey;
import com.citi.backend.query.TradeQuery;

public interface TradeMapper {
    int deleteByPrimaryKey(TradeKey key);

    int insert(Trade row);

    int insertSelective(Trade row);

    Trade selectByPrimaryKey(TradeKey key);

    int updateByPrimaryKeySelective(Trade row);

    int updateByPrimaryKey(Trade row);

    List<Trade> select(TradeQuery tradeQuery);
}