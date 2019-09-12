package com.newer.hotelmanage.domain;

public class House {
    private Integer hid;

    private Integer rid;

    private Double pices;

    private String hdescribe;

    private String state;

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Double getPices() {
        return pices;
    }

    public void setPices(Double pices) {
        this.pices = pices;
    }

    public String getHdescribe() {
        return hdescribe;
    }

    public void setHdescribe(String hdescribe) {
        this.hdescribe = hdescribe == null ? null : hdescribe.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}