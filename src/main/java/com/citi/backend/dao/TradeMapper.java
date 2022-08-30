package com.citi.backend.dao;

import java.util.List;

import com.citi.backend.entity.Trade;
import com.citi.backend.entity.TradeKey;

public interface TradeMapper {
    int deleteByPrimaryKey(TradeKey key);

    int insert(Trade row);

    int insertSelective(Trade row);

    Trade selectByPrimaryKey(TradeKey key);

    int updateByPrimaryKeySelective(Trade row);

    int updateByPrimaryKey(Trade row);

    List<Trade> selectByDateAndPage(String startTime, String endTime, int startIndex, int pageSize);
}