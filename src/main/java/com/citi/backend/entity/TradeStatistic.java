package com.citi.backend.entity;

import java.io.Serializable;
import java.util.Date;

public class TradeStatistic implements Serializable {
    private String tradeStatisticId;

    private String description;

    private Integer totalBuy;

    private Integer totalSell;

    private Date statisticDate;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public String getTradeStatisticId() {
        return tradeStatisticId;
    }

    public void setTradeStatisticId(String tradeStatisticId) {
        this.tradeStatisticId = tradeStatisticId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getTotalBuy() {
        return totalBuy;
    }

    public void setTotalBuy(Integer totalBuy) {
        this.totalBuy = totalBuy;
    }

    public Integer getTotalSell() {
        return totalSell;
    }

    public void setTotalSell(Integer totalSell) {
        this.totalSell = totalSell;
    }

    public Date getStatisticDate() {
        return statisticDate;
    }

    public void setStatisticDate(Date statisticDate) {
        this.statisticDate = statisticDate;
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
        sb.append(", tradeStatisticId=").append(tradeStatisticId);
        sb.append(", description=").append(description);
        sb.append(", totalBuy=").append(totalBuy);
        sb.append(", totalSell=").append(totalSell);
        sb.append(", statisticDate=").append(statisticDate);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}