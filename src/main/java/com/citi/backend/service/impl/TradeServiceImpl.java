package com.citi.backend.service.impl;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.citi.backend.dao.StockHoldMapper;
import com.citi.backend.dao.TradeMapper;
import com.citi.backend.entity.StockHold;
import com.citi.backend.entity.Trade;
import com.citi.backend.enums.FrequencyEnum;
import com.citi.backend.service.TradeService;

@Service
public class TradeServiceImpl implements TradeService {

    @Resource
    TradeMapper tradeMapper;

    @Resource
    StockHoldMapper stockHoldMapper;

    @Override
    public List<Trade> getTrade(FrequencyEnum fre, int pageSize, int currentPage) {
        Date dateNow = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateNow);
        calendar.add(Calendar.DATE, +1);
        Date dateTo = calendar.getTime();
        calendar.setTime(dateNow);
        // 根据存入的频率fre设定查询的范围
        calendar.add(fre.getUnit(), fre.getDuration());
        Date dateFrom = calendar.getTime();
        // 转换为MySQL识别的字符串
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        int startIndex = (currentPage - 1) * pageSize;
        List<Trade> tradesByTime = tradeMapper.selectByDateAndPage(sdf.format(dateFrom), sdf.format(dateTo), startIndex, pageSize);
        return tradesByTime;
    }

    @Override
    public void buyStock(Map<String, Object> tradeInfo) {
        Date date = new Date();

        Trade trade = new Trade();
        trade.setClientId((Integer)tradeInfo.get("clientId"));
        trade.setStockId((Integer)tradeInfo.get("stockId"));
        trade.setSize((Integer)tradeInfo.get("size"));
        trade.setSalesPersonId((Integer)tradeInfo.get("salespersonId"));
        trade.setClientSide("Buy");
        trade.setTradeDate(date);

        StockHold stockHold = new StockHold();
        stockHold.setClientId(trade.getClientId());
        stockHold.setStockId(trade.getStockId());
        stockHold.setHoldNumber(trade.getSize());
        stockHold.setUpdateTime(date);

        tradeMapper.insert(trade);
        stockHoldMapper.updateStock(stockHold);
    }
    
}
