package com.example.eurekaservicesupport.service.impl;


import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.example.eurekaservicesupport.dao.StockHoldMapper;
import com.example.eurekaservicesupport.dao.TradeMapper;
import com.example.eurekaservicesupport.entity.StockHold;
import com.example.eurekaservicesupport.entity.StockHoldKey;
import com.example.eurekaservicesupport.entity.Trade;
import com.example.eurekaservicesupport.enums.FrequencyEnum;
import com.example.eurekaservicesupport.query.TradeQuery;
import com.example.eurekaservicesupport.service.TradeService;
import org.springframework.stereotype.Service;



@Service
public class TradeServiceImpl implements TradeService {

    @Resource
    TradeMapper tradeMapper;

    @Resource
    StockHoldMapper stockHoldMapper;

    @Override
    public Map<String, Object> getTrade(Map<String, Object> queryInfo) {

        TradeQuery tradeQuery = new TradeQuery();
        // 过滤频率
        if (queryInfo.containsKey("fre")){
            FrequencyEnum fre = FrequencyEnum.valueOf("_"+(String)queryInfo.get("fre"));
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
            tradeQuery.setStartTime(sdf.format(dateFrom));
            tradeQuery.setEndTime(sdf.format(dateTo));
            if("".equals((String)queryInfo.get("fre"))){
                tradeQuery.setStartTime(null);
                tradeQuery.setEndTime(null);
            }
        }
        if(queryInfo.containsKey("pageSize") & queryInfo.containsKey("currentPage")){
            Integer pageSize = Integer.parseInt((String)queryInfo.get("pageSize"));
            Integer currentPage = Integer.parseInt((String)queryInfo.get("currentPage"));
            Integer startIndex = (currentPage - 1) * pageSize;
            tradeQuery.setPageSize(pageSize);
            tradeQuery.setStartIndex(startIndex);
        }

        // 客户名称
        if(queryInfo.containsKey("clientName")){
            String clientName = (String)queryInfo.get("clientName");
            if ("".equals(clientName)){
                clientName = null;
            }
            tradeQuery.setClientName(clientName);
        }

        // 股票名称
        if(queryInfo.containsKey("ticker")){
            String ticker = (String)queryInfo.get("ticker");
            if ("".equals(ticker)){
                ticker = null;
            }
            tradeQuery.setTicker(ticker);
        }

        // 币种
        if(queryInfo.containsKey("currency")){
            String currency = (String)queryInfo.get("currency");
            if ("".equals(currency)){
                currency = null;
            }
            tradeQuery.setCurrency(currency);
        }

        // 股票代号
        if(queryInfo.containsKey("ric")){
            String ric = (String)queryInfo.get("ric");
            if ("".equals(ric)){
                ric = null;
            }
            tradeQuery.setRic(ric);
        }

        // 交易类型：买/卖
        if(queryInfo.containsKey("clientSide")){
            String clientSide = (String)queryInfo.get("clientSide");
            if ("".equals(clientSide)){
                clientSide = null;
            }
            tradeQuery.setClientSide(clientSide);
        }

        // 交易类型：HT/PT
        if(queryInfo.containsKey("tradeType")){
            String tradeType = (String)queryInfo.get("tradeType");
            if ("".equals(tradeType)){
                tradeType = null;
            }
            tradeQuery.setTradeType(tradeType);
        }

        // 按价格排序
        if(queryInfo.containsKey("price")){
            String price = (String)queryInfo.get("price");
            if ("".equals(price)){
                tradeQuery.setPageSize(null);
            } else{
                tradeQuery.setPrice(Integer.parseInt(price));
            }
        }

        // 按数量排序
        if(queryInfo.containsKey("size")){
            String size = (String)queryInfo.get("size");
            if ("".equals(size)){
                tradeQuery.setSize(null);
            } else{
                tradeQuery.setPrice(Integer.parseInt(size));
            }  
        }

        // 按美金排序
        if(queryInfo.containsKey("nationalUsd")){
            String nationalUsd = (String)queryInfo.get("nationalUsd");
            if ("".equals(nationalUsd)){
                tradeQuery.setNationalUsd(null);
            } else{
                tradeQuery.setPrice(Integer.parseInt(nationalUsd));
            }  
        }

        // 按日期排序
        if(queryInfo.containsKey("date")){
            String date = (String)queryInfo.get("date");
            if ("".equals(date)){
                tradeQuery.setDate(null);
            } else{
                tradeQuery.setPrice(Integer.parseInt(date));
            }  
        }

        List<Map<String, Object>> tradesByTime = tradeMapper.selectALL(tradeQuery);
        Integer index = 0;
        Float totalBuy = (float) 0.0;
        Float totalSell = (float) 0.0;
        Float netQuantity = (float) 0.0;
        Float nationalTotalBuy = (float) 0.0;
        Float nationalTotalSell = (float) 0.0;
        Float nationalNetQuantity = (float) 0.0;
        for(Map<String, Object> map: tradesByTime){
            index++;
            if("Buy".equals((String)map.get("client_side"))){
                totalBuy += (Integer)map.get("size")
                * ((BigDecimal)map.get("price")).floatValue();
                nationalTotalBuy += (Integer)map.get("size")
                * ((BigDecimal)map.get("national_usd")).floatValue();
            };
            if("Sell".equals((String)map.get("client_side"))){
                totalSell += (Integer)map.get("size")
                * ((BigDecimal)map.get("price")).floatValue();
                nationalTotalSell += (Integer)map.get("size")
                * ((BigDecimal)map.get("national_usd")).floatValue();
            };
            map.put("key", index);
        }
        netQuantity = totalBuy - totalSell;
        nationalNetQuantity = nationalTotalBuy - nationalTotalSell;
        HashMap<String, Object> result = new HashMap<>();
        result.put("dataList", tradesByTime);
        Integer total = tradeMapper.countAll(tradeQuery);
        if(total == null){
            total = 0;
        }
        result.put("total", total);

        result.put("totalBuy",totalBuy);
        result.put("totalSell",totalSell);
        result.put("netQuantity", netQuantity);

        result.put("totalBuyNational",nationalTotalBuy);
        result.put("totalSellNational",nationalTotalSell);
        result.put("netNational", nationalNetQuantity);
        return result;
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
        stockHoldMapper.buyStock(stockHold);
    }

    @Override
    public void sellStock(Map<String, Object> tradeInfo) {
        Date date = new Date();

        //判断库存是否足够
        StockHoldKey stockHoldKey = new StockHoldKey();
        stockHoldKey.setClientId((Integer)tradeInfo.get("clientId"));
        stockHoldKey.setStockId((Integer)tradeInfo.get("stockId"));
        StockHold currentStockHold = stockHoldMapper.selectByPrimaryKey(stockHoldKey);
        System.out.println("==================================");
        System.out.println(currentStockHold.getHoldNumber() - (Integer)tradeInfo.get("size") >= 0);
        System.out.println("==================================");
        if(currentStockHold.getHoldNumber() - (Integer)tradeInfo.get("size") < 0){
            throw new RuntimeException("Not Enough Stock Hold.");
        }

        Trade trade = new Trade();
        trade.setClientId((Integer)tradeInfo.get("clientId"));
        trade.setStockId((Integer)tradeInfo.get("stockId"));
        trade.setSize((Integer)tradeInfo.get("size"));
        trade.setSalesPersonId((Integer)tradeInfo.get("salespersonId"));
        trade.setClientSide("Sell");
        trade.setTradeDate(date);


        StockHold stockHold = new StockHold();
        stockHold.setClientId(trade.getClientId());
        stockHold.setStockId(trade.getStockId());
        stockHold.setHoldNumber(trade.getSize());
        stockHold.setUpdateTime(date);

        tradeMapper.insert(trade);
        stockHoldMapper.sellStock(stockHold);
        
    }
    
}
