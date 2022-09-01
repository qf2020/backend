package com.example.eurekaservicesupport.dao;


import java.util.List;

import com.example.eurekaservicesupport.entity.Stock;

public interface StockMapper {
    int deleteByPrimaryKey(Integer stockId);

    int insert(Stock row);

    int insertSelective(Stock row);

    Stock selectByPrimaryKey(Integer stockId);

    int updateByPrimaryKeySelective(Stock row);

    int updateByPrimaryKey(Stock row);

    List<Stock> selectAll(Integer startIndex, Integer pageSize);

    Stock selectByName(String ticker);

    List<String> getMatchTicker(String ticker);
}