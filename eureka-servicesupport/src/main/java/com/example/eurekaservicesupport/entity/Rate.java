package com.example.eurekaservicesupport.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Rate {
    private Integer rateId;

    private String currency;

    private Double rate;

    @JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss",timezone ="GMT-8")
    @DateTimeFormat(pattern = "yyy-MM-dd HH-mm-ss")
    private Date updateTime;

    public Integer getRateId() {
        return rateId;
    }

    public void setRateId(Integer rateId) {
        this.rateId = rateId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}