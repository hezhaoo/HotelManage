package com.newer.hotelmanage.domain;

public class Houseimg {
    private Integer iid;

    private Integer rid;

    private String imgsrc1;

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getImgsrc1() {
        return imgsrc1;
    }

    public void setImgsrc1(String imgsrc1) {
        this.imgsrc1 = imgsrc1 == null ? null : imgsrc1.trim();
    }
}