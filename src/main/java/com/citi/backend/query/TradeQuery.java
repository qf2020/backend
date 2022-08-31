package com.citi.backend.query;

public class TradeQuery {
    private Boolean filter;
    private Integer clientId;
    private String startTime;
    private String endTime;
    private Integer order;
    private String clientSide;
    private String type;
    private Integer startIndex;
    private Integer pageSize;
    
    public TradeQuery(){
        this.filter = false;
    }

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
    public Boolean getFilter() {
        return filter;
    }
    public void setFilter(Boolean filter) {
        this.filter = filter;
    }
}
