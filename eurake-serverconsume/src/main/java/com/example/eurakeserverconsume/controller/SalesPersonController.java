package com.example.eurakeserverconsume.controller;

import com.example.eurakeserverconsume.res.ERROR;
import com.example.eurakeserverconsume.res.SUCCESS;
import com.example.eurakeserverconsume.service.ConsumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/salesPerson")
public class SalesPersonController {
    @Autowired
    private ConsumeService consumeService;

    @GetMapping("/getMatchSalesperson")
    @CrossOrigin
    public Object getMatchSalesperson(@RequestParam("key") String key){
        return new SUCCESS(consumeService.getMatchSalesperson(key));
    }

}
