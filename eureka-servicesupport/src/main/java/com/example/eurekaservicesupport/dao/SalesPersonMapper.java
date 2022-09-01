package com.example.eurekaservicesupport.dao;


import com.example.eurekaservicesupport.entity.SalesPerson;

import java.util.List;
import java.util.Map;

public interface SalesPersonMapper {
    int deleteByPrimaryKey(Integer salesPersonId);

    int insert(SalesPerson row);

    int insertSelective(SalesPerson row);

    List<Map<String,Object>> selectByPrimaryKey(String salesPersonName);

    int updateByPrimaryKeySelective(SalesPerson row);

    int updateByPrimaryKey(SalesPerson row);
}