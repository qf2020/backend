package com.citi.backend.service;

import com.citi.backend.dao.ClientMapper;
import com.citi.backend.entity.Client;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class ClientServiceImp implements ClientService{
    @Resource
    private ClientMapper clientMapper;

    @Override
    public int insert(int userID,String userName,String type){

        return clientMapper.insert(new Client(userID,userName,type));
    }
}
