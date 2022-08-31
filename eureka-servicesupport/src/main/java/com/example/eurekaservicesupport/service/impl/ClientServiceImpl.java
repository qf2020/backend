package com.example.eurekaservicesupport.service.impl;



import com.example.eurekaservicesupport.dao.ClientMapper;
import com.example.eurekaservicesupport.entity.Client;
import com.example.eurekaservicesupport.service.ClientService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class ClientServiceImpl implements ClientService {
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
