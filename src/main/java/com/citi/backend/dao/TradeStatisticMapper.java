package com.citi.backend.dao;

import com.citi.backend.entity.Trade;
import com.citi.backend.entity.TradeStatistic;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface TradeStatisticMapper {
    int deleteByPrimaryKey(String tradeStatisticId);

    int insert(TradeStatistic row);

    int insertSelective(TradeStatistic row);

    TradeStatistic selectByPrimaryKey(String tradeStatisticId);
    List<Map<String,Object>> selectByDate(String startTime, String endTime);
    int updateByPrimaryKeySelective(TradeStatistic row);

    int updateByPrimaryKey(TradeStatistic row);
}