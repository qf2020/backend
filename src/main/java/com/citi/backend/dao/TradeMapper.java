package com.citi.backend.dao;

import java.util.Date;
import java.util.List;

import com.citi.backend.entity.Trade;

public interface TradeMapper {
    int deleteByPrimaryKey(String tradeId);

    int insert(Trade row);

    int insertSelective(Trade row);

    Trade selectByPrimaryKey(String tradeId);

    List<Trade> selectByDate(Date startTime, Date endTime);

    int updateByPrimaryKeySelective(Trade row);

    int updateByPrimaryKey(Trade row);
}