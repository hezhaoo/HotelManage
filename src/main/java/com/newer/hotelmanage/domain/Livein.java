package com.newer.hotelmanage.domain;

import java.util.Date;

public class Livein {
    private Integer livid;

    private Integer hid;

    private Integer gid;

    private String gname;

    private String site;

    private Integer renshu;

    private Date inTime;

    private Date leaveTime;

    private Integer delmark;

    private String phone;

    private Double pledgemoney;

    public Integer getLivid() {
        return livid;
    }

    public void setLivid(Integer livid) {
        this.livid = livid;
    }

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public Integer getRenshu() {
        return renshu;
    }

    public void setRenshu(Integer renshu) {
        this.renshu = renshu;
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

    public Integer getDelmark() {
        return delmark;
    }

    public void setDelmark(Integer delmark) {
        this.delmark = delmark;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Double getPledgemoney() {
        return pledgemoney;
    }

    public void setPledgemoney(Double pledgemoney) {
        this.pledgemoney = pledgemoney;
    }
}