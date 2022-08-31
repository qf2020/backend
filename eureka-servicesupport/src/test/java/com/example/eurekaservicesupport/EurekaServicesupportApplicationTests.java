package com.example.eurekaservicesupport;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.eurekaservicesupport.dao.StockHoldMapper;
import com.example.eurekaservicesupport.entity.StockHold;
import com.example.eurekaservicesupport.entity.StockHoldKey;

@SpringBootTest
class EurekaServicesupportApplicationTests {

    @Resource
    StockHoldMapper stockHoldMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void MyTest(){
        //判断库存是否足够
        StockHoldKey stockHoldKey = new StockHoldKey();
        stockHoldKey.setClientId(1);
        stockHoldKey.setStockId(1);
        StockHold currentStockHold = stockHoldMapper.selectByPrimaryKey(stockHoldKey);
        System.out.println("======================================");
        System.out.println("======================================");
        System.out.println(currentStockHold.getHoldNumber());
        System.out.println("======================================");
        System.out.println("======================================");
    }

}
