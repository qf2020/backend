package com.citi.backend.dao;

import com.citi.backend.entity.TradeStatistic;

public interface TradeStatisticMapper {
    int deleteByPrimaryKey(String tradeStatisticId);

    int insert(TradeStatistic row);

    int insertSelective(TradeStatistic row);

    TradeStatistic selectByPrimaryKey(String tradeStatisticId);

    int updateByPrimaryKeySelective(TradeStatistic row);

    int updateByPrimaryKey(TradeStatistic row);
}