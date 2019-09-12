package com.newer.hotelmanage.domain;

import java.util.Date;

public class Chekout {
    private Integer chid;

    private Date chkTime;

    private Integer days;

    private Double money;

    private String gid;

    private String remark;

    public Integer getChid() {
        return chid;
    }

    public void setChid(Integer chid) {
        this.chid = chid;
    }

    public Date getChkTime() {
        return chkTime;
    }

    public void setChkTime(Date chkTime) {
        this.chkTime = chkTime;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}