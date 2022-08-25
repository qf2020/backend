package com.citi.backend.dao;

import com.citi.backend.entity.Client;

public interface ClientMapper {
    int deleteByPrimaryKey(String clientId);

    int insert(Client row);

    int insertSelective(Client row);

    Client selectByPrimaryKey(String clientId);

    int updateByPrimaryKeySelective(Client row);

    int updateByPrimaryKey(Client row);
}