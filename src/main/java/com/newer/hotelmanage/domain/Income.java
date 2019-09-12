package com.newer.hotelmanage.domain;

import java.util.Date;

public class Income {
    private Integer inid;

    private String intype;

    private Double inmoney;

    private String inremark;

    private Date indate;

    public Integer getInid() {
        return inid;
    }

    public void setInid(Integer inid) {
        this.inid = inid;
    }

    public String getIntype() {
        return intype;
    }

    public void setIntype(String intype) {
        this.intype = intype == null ? null : intype.trim();
    }

    public Double getInmoney() {
        return inmoney;
    }

    public void setInmoney(Double inmoney) {
        this.inmoney = inmoney;
    }

    public String getInremark() {
        return inremark;
    }

    public void setInremark(String inremark) {
        this.inremark = inremark == null ? null : inremark.trim();
    }

    public Date getIndate() {
        return indate;
    }

    public void setIndate(Date indate) {
        this.indate = indate;
    }
}