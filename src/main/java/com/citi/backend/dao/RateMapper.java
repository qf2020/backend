package com.citi.backend.dao;

import com.citi.backend.entity.Rate;

public interface RateMapper {
    int deleteByPrimaryKey(Integer rateId);

    int insert(Rate row);

    int insertSelective(Rate row);

    Rate selectByPrimaryKey(Integer rateId);

    int updateByPrimaryKeySelective(Rate row);

    int updateByPrimaryKey(Rate row);
}