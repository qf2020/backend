package com.example.eurekaservicesupport.query;

public class TradeQuery {
    private Integer clientId;
    private String clientName;
    private String ticker;
    private Integer size;
    private Integer date;
    private Integer price;
    private Integer nationalUsd;
    private String ric;
    private String currency;
    private String tradeType;
    private String startTime;
    private String endTime;
    private Integer order;
    private String clientSide;
    private String type;
    private Integer startIndex;
    private Integer pageSize;
    
    public Integer getClientId() {
        return clientId;
    }
    public void setClientId(int clientId) {
        this.clientId = clientId;
    }
    public String getStartTime() {
        return startTime;
    }
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    public String getEndTime() {
        return endTime;
    }
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    public Integer getOrder() {
        return order;
    }
    public void setOrder(int order) {
        this.order = order;
    }
    public String getClientSide() {
        return clientSide;
    }
    public void setClientSide(String clientSide) {
        this.clientSide = clientSide;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Integer getStartIndex() {
        return startIndex;
    }
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }
    public Integer getPageSize() {
        return pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }
    public String getClientName() {
        return clientName;
    }
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
    public void setOrder(Integer order) {
        this.order = order;
    }
    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
    public String getTicker() {
        return ticker;
    }
    public void setTicker(String ticker) {
        this.ticker = ticker;
    }
    public String getRic() {
        return ric;
    }
    public void setRic(String ric) {
        this.ric = ric;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getTradeType() {
        return tradeType;
    }
    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }
    public Integer getSize() {
        return size;
    }
    public void setSize(Integer size) {
        this.size = size;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public Integer getNationalUsd() {
        return nationalUsd;
    }
    public void setNationalUsd(Integer nationalUsd) {
        this.nationalUsd = nationalUsd;
    }
    public Integer getDate() {
        return date;
    }
    public void setDate(Integer date) {
        this.date = date;
    }
}
