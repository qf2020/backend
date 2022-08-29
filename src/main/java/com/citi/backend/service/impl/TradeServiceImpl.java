package com.citi.backend.service.impl;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.citi.backend.dao.TradeMapper;
import com.citi.backend.entity.Trade;
import com.citi.backend.enums.FrequencyEnum;
import com.citi.backend.service.TradeService;

@Service
public class TradeServiceImpl implements TradeService {

    @Resource
    TradeMapper tradeMapper;

    @Override
    public List<Trade> getTrade(FrequencyEnum fre, int pageSize, int currentPage) {
        Date dateNow = new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateNow);
        calendar.add(Calendar.DATE, +1);
        Date dateTo = calendar.getTime();

        calendar.setTime(dateNow);
        calendar.add(fre.getUnit(), fre.getDuration());
        Date dateFrom = calendar.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(dateFrom));
        System.out.println(sdf.format(dateTo));
        List<Trade> tradesByTime = tradeMapper.selectByDate(sdf.format(dateFrom), sdf.format(dateTo));
        return tradesByTime;
    }
    
}
