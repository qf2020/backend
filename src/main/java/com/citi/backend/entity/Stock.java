package com.citi.backend.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Stock implements Serializable {
    private String stockId;

    private String ric;

    private String ticker;

    private String issuerSectorId;

    private String currency;

    private BigDecimal price;

    private BigDecimal nationalUsd;

    private Integer totalCount;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public String getRic() {
        return ric;
    }

    public void setRic(String ric) {
        this.ric = ric;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getIssuerSectorId() {
        return issuerSectorId;
    }

    public void setIssuerSectorId(String issuerSectorId) {
        this.issuerSectorId = issuerSectorId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getNationalUsd() {
        return nationalUsd;
    }

    public void setNationalUsd(BigDecimal nationalUsd) {
        this.nationalUsd = nationalUsd;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
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
        sb.append(", stockId=").append(stockId);
        sb.append(", ric=").append(ric);
        sb.append(", ticker=").append(ticker);
        sb.append(", issuerSectorId=").append(issuerSectorId);
        sb.append(", currency=").append(currency);
        sb.append(", price=").append(price);
        sb.append(", nationalUsd=").append(nationalUsd);
        sb.append(", totalCount=").append(totalCount);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}