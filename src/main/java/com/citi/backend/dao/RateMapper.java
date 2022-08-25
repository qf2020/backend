package com.citi.backend.dao;

import com.citi.backend.entity.Rate;

public interface RateMapper {
    int deleteByPrimaryKey(String rateId);

    int insert(Rate row);

    int insertSelective(Rate row);

    Rate selectByPrimaryKey(String rateId);

    int updateByPrimaryKeySelective(Rate row);

    int updateByPrimaryKey(Rate row);
}