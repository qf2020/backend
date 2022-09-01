package com.example.eurekaservicesupport.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class StockHold extends StockHoldKey {
    private Integer stockHoldId;

    private Integer holdNumber;
    @JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss",timezone ="GMT-8")
    @DateTimeFormat(pattern = "yyy-MM-dd HH-mm-ss")
    private Date updateTime;

    public Integer getStockHoldId() {
        return stockHoldId;
    }

    public void setStockHoldId(Integer stockHoldId) {
        this.stockHoldId = stockHoldId;
    }

    public Integer getHoldNumber() {
        return holdNumber;
    }

    public void setHoldNumber(Integer holdNumber) {
        this.holdNumber = holdNumber;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}