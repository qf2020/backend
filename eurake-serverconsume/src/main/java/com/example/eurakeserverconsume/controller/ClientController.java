package com.example.eurakeserverconsume.controller;



import com.example.eurakeserverconsume.service.ConsumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/client")

public class ClientController {
    @Autowired
    private ConsumeService consumeService;

    @GetMapping("/insert")
    @CrossOrigin
    public int mailSizeSend(@RequestParam("client_id")Integer id, @RequestParam("client_name")String name, @RequestParam("password")String password){

        int temp = consumeService.mailSizeSend(id,name,password);
        return temp;
    }

}
