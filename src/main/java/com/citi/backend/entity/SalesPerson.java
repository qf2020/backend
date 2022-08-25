package com.citi.backend.entity;

import java.io.Serializable;
import java.util.Date;

public class SalesPerson implements Serializable {
    private Integer salesPersonId;

    private String jobNumber;

    private String salesPersonName;

    private String password;

    private Date registerTime;

    private static final long serialVersionUID = 1L;

    public Integer getSalesPersonId() {
        return salesPersonId;
    }

    public void setSalesPersonId(Integer salesPersonId) {
        this.salesPersonId = salesPersonId;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getSalesPersonName() {
        return salesPersonName;
    }

    public void setSalesPersonName(String salesPersonName) {
        this.salesPersonName = salesPersonName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", salesPersonId=").append(salesPersonId);
        sb.append(", jobNumber=").append(jobNumber);
        sb.append(", salesPersonName=").append(salesPersonName);
        sb.append(", password=").append(password);
        sb.append(", registerTime=").append(registerTime);
        sb.append("]");
        return sb.toString();
    }
}