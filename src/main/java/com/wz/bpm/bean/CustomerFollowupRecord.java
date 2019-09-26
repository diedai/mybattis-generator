package com.wz.bpm.bean;

import java.util.Date;

public class CustomerFollowupRecord {
    private Integer id;

    private String name;

    private String content;

    private Date date;

    private String contentNexttime;

    private Date dateNexttime;

    private Integer customerId;

    private Integer employeeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContentNexttime() {
        return contentNexttime;
    }

    public void setContentNexttime(String contentNexttime) {
        this.contentNexttime = contentNexttime == null ? null : contentNexttime.trim();
    }

    public Date getDateNexttime() {
        return dateNexttime;
    }

    public void setDateNexttime(Date dateNexttime) {
        this.dateNexttime = dateNexttime;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
}