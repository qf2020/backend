package com.citi.backend.entity;

import java.io.Serializable;
import java.util.Date;

public class Trade implements Serializable {
    private String tradeId;

    private String clientId;

    private String stockId;

    private String clientName;

    private String clientSide;

    private Integer size;

    private String salesPersonId;

    private String tradeType;

    private Date tradeDate;

    private static final long serialVersionUID = 1L;

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
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

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientSide() {
        return clientSide;
    }

    public void setClientSide(String clientSide) {
        this.clientSide = clientSide;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getSalesPersonId() {
        return salesPersonId;
    }

    public void setSalesPersonId(String salesPersonId) {
        this.salesPersonId = salesPersonId;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public Date getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tradeId=").append(tradeId);
        sb.append(", clientId=").append(clientId);
        sb.append(", stockId=").append(stockId);
        sb.append(", clientName=").append(clientName);
        sb.append(", clientSide=").append(clientSide);
        sb.append(", size=").append(size);
        sb.append(", salesPersonId=").append(salesPersonId);
        sb.append(", tradeType=").append(tradeType);
        sb.append(", tradeDate=").append(tradeDate);
        sb.append("]");
        return sb.toString();
    }
}