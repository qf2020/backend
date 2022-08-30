package com.citi.backend.service.impl;

import com.citi.backend.dao.ClientMapper;
import com.citi.backend.entity.Client;
import com.citi.backend.service.ClientService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class ClientServiceImpl implements ClientService{
    @Resource
    private ClientMapper clientMapper;

    @Override
    public int insert(Integer userID,String userName,String password){
        Client client = new Client();
        client.setClientId(userID);
        client.setClientName(userName);
        client.setPassword(password);
        return clientMapper.insert(client);
    }
}
