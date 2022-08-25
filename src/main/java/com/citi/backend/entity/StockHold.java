package com.citi.backend.entity;

import java.io.Serializable;
import java.util.Date;

public class StockHold implements Serializable {
    private String stockHoldId;

    private String clientId;

    private String stockId;

    private Integer holdNumber;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public String getStockHoldId() {
        return stockHoldId;
    }

    public void setStockHoldId(String stockHoldId) {
        this.stockHoldId = stockHoldId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stockHoldId=").append(stockHoldId);
        sb.append(", clientId=").append(clientId);
        sb.append(", stockId=").append(stockId);
        sb.append(", holdNumber=").append(holdNumber);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}