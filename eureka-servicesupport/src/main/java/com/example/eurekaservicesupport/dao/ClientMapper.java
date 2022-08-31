package com.example.eurekaservicesupport.dao;


import com.example.eurekaservicesupport.entity.Client;

public interface ClientMapper {
    int deleteByPrimaryKey(Integer clientId);

    int insert(Client row);

    int insertSelective(Client row);

    Client selectByPrimaryKey(Integer clientId);

    int updateByPrimaryKeySelective(Client row);

    int updateByPrimaryKey(Client row);
}