package com.citi.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import com.citi.backend.entity.Trade;

public class TradeController {
    
    @GetMapping("/gettrade")
    @CrossOrigin
    public List<Trade> getTrade(){
        return null;
    }
}
