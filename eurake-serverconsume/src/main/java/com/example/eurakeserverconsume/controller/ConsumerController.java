package com.example.eurakeserverconsume.controller;

import com.example.eurakeserverconsume.service.ConsumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping( "/Hello")
public class ConsumerController {
    @Autowired
    private ConsumeService consumeService;
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/Consumer")
   // @HystrixCommand(fallbackMethod = "errorcode")
    public Object haha() {
        return consumeService.hello();
    }
}

