package com.newer.hotelmanage.domain;

import java.util.Date;

public class Engage {
    private Integer enid;

    private String gid;

    private Integer hid;

    private Date engageTime;

    private Date inTime;

    private Date leaveTime;

    private Integer engageRemark;

    public Integer getEnid() {
        return enid;
    }

    public void setEnid(Integer enid) {
        this.enid = enid;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public Date getEngageTime() {
        return engageTime;
    }

    public void setEngageTime(Date engageTime) {
        this.engageTime = engageTime;
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    public Integer getEngageRemark() {
        return engageRemark;
    }

    public void setEngageRemark(Integer engageRemark) {
        this.engageRemark = engageRemark;
    }
}