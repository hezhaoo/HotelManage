package com.newer.hotelmanage.domain;

import java.util.Date;

public class Reservetable {
    private Integer rtId;

    private Date rtDate;

    private String rtName;

    private String rtTime;

    private Integer rtPernum;

    private String rtPhone;

    private String rtEmail;

    private Integer rtStatus;

    public Integer getRtId() {
        return rtId;
    }

    public void setRtId(Integer rtId) {
        this.rtId = rtId;
    }

    public Date getRtDate() {
        return rtDate;
    }

    public void setRtDate(Date rtDate) {
        this.rtDate = rtDate;
    }

    public String getRtName() {
        return rtName;
    }

    public void setRtName(String rtName) {
        this.rtName = rtName == null ? null : rtName.trim();
    }

    public String getRtTime() {
        return rtTime;
    }

    public void setRtTime(String rtTime) {
        this.rtTime = rtTime == null ? null : rtTime.trim();
    }

    public Integer getRtPernum() {
        return rtPernum;
    }

    public void setRtPernum(Integer rtPernum) {
        this.rtPernum = rtPernum;
    }

    public String getRtPhone() {
        return rtPhone;
    }

    public void setRtPhone(String rtPhone) {
        this.rtPhone = rtPhone == null ? null : rtPhone.trim();
    }

    public String getRtEmail() {
        return rtEmail;
    }

    public void setRtEmail(String rtEmail) {
        this.rtEmail = rtEmail == null ? null : rtEmail.trim();
    }

    public Integer getRtStatus() {
        return rtStatus;
    }

    public void setRtStatus(Integer rtStatus) {
        this.rtStatus = rtStatus;
    }
}