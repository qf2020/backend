package com.example.eurekaservicesupport.query;

public class TradeQuery {
    private Integer clientId;
    private String clientName;
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
}
