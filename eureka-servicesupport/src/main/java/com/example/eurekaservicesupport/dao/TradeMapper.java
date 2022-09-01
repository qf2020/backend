package com.example.eurekaservicesupport.dao;

import com.example.eurekaservicesupport.entity.Trade;
import com.example.eurekaservicesupport.entity.TradeKey;
import com.example.eurekaservicesupport.query.TradeQuery;

import java.util.List;
import java.util.Map;



public interface TradeMapper {
    int deleteByPrimaryKey(TradeKey key);

    int insert(Trade row);

    int insertSelective(Trade row);

    Trade selectByPrimaryKey(TradeKey key);

    int updateByPrimaryKeySelective(Trade row);

    int updateByPrimaryKey(Trade row);

    List<Map<String, Object>> selectALL(TradeQuery tradeQuery);

    Integer countAll(TradeQuery tradeQuery);
}