package com.example.eurekaservicesupport.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Client {
    private Integer clientId;

    private String clientName;

    private String password;
    @JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss",timezone ="GMT-8")
    @DateTimeFormat(pattern = "yyy-MM-dd HH-mm-ss")
    private Date registerTime;

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName == null ? null : clientName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }
}