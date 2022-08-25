package com.citi.backend.controller;


import com.citi.backend.service.ClientService;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/client")

public class clientController {
    @Resource
    ClientService clientService;

    @GetMapping("/insert")
    @CrossOrigin
    public int mailSizeSend(@RequestParam("client_id")String id, @RequestParam("client_name")String name, @RequestParam("password")String password){

        int temp = clientService.insert(id,name,password);
        return temp;
    }

}
