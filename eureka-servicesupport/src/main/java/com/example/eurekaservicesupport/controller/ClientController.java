package com.example.eurekaservicesupport.controller;



import com.example.eurekaservicesupport.entity.Client;
import com.example.eurekaservicesupport.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

import javax.annotation.Resource;

@RestController
@RequestMapping("/client")

public class ClientController {
    @Resource
    ClientService clientService;

    @PostMapping("/register")
    @CrossOrigin
    public boolean register(@RequestBody Client client){
        try{
            clientService.insert(client);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }


    }

    @PostMapping("/login")
    @CrossOrigin
    public Client login(@RequestBody Client loginRequest){
        try {
            Client clientInfo = clientService.login(loginRequest);
            return clientInfo;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
    }

    @PostMapping("/changePassword")
    @CrossOrigin
    public Boolean changePassword(@RequestBody Map<String, Object> changePasswordRequest){
        try {
            Integer clientId = (Integer)changePasswordRequest.get("clientId");
            String newPassword = (String)changePasswordRequest.get("newPassword");
            System.out.println(clientId);
            System.out.println(newPassword);
            clientService.changePassword(clientId,newPassword);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        
    }

}
