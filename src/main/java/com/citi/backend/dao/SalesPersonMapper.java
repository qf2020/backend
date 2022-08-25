package com.citi.backend.dao;

import com.citi.backend.entity.SalesPerson;

public interface SalesPersonMapper {
    int deleteByPrimaryKey(Integer salesPersonId);

    int insert(SalesPerson row);

    int insertSelective(SalesPerson row);

    SalesPerson selectByPrimaryKey(Integer salesPersonId);

    int updateByPrimaryKeySelective(SalesPerson row);

    int updateByPrimaryKey(SalesPerson row);
}