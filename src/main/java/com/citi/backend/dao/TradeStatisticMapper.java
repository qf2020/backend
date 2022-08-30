package com.citi.backend.dao;

import java.util.List;
import java.util.Map;

import com.citi.backend.entity.TradeStatistic;

public interface TradeStatisticMapper {
    int deleteByPrimaryKey(Integer tradeStatisticId);

    int insert(TradeStatistic row);

    int insertSelective(TradeStatistic row);

    TradeStatistic selectByPrimaryKey(Integer tradeStatisticId);

    int updateByPrimaryKeySelective(TradeStatistic row);

    int updateByPrimaryKey(TradeStatistic row);

    List<Map<String,Object>> selectByDate(String startTime, String endTime);
}