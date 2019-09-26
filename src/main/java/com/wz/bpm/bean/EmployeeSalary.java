package com.wz.bpm.bean;

import java.util.Date;

public class EmployeeSalary {
    private Integer id;

    private Double salaryBase;

    private Double salaryPerformance;

    private String reason;

    private Date salaryDate;

    private Integer employeeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Date getSalaryDate() {
        return salaryDate;
    }

    public void setSalaryDate(Date salaryDate) {
        this.salaryDate = salaryDate;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
}