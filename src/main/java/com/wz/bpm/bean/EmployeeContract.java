package com.wz.bpm.bean;

import java.util.Date;

public class EmployeeContract {
    private Integer id;

    private String contractNum;

    private Double salaryBase;

    private Double salaryPerformance;

    private Integer positionId;

    private Boolean contractType;

    private String reason;

    private Date startDate;

    private Date endDate;

    private Integer employeeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContractNum() {
        return contractNum;
    }

    public void setContractNum(String contractNum) {
        this.contractNum = contractNum == null ? null : contractNum.trim();
    }

    public Double getSalaryBase() {
        return salaryBase;
    }

    public void setSalaryBase(Double salaryBase) {
        this.salaryBase = salaryBase;
    }

    public Double getSalaryPerformance() {
        return salaryPerformance;
    }

    public void setSalaryPerformance(Double salaryPerformance) {
        this.salaryPerformance = salaryPerformance;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Boolean getContractType() {
        return contractType;
    }

    public void setContractType(Boolean contractType) {
        this.contractType = contractType;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
}