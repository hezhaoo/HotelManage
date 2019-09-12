package com.newer.hotelmanage.domain;

public class Galleryimg {
    private Integer yid;

    private String imgsrc1;

    public Integer getYid() {
        return yid;
    }

    public void setYid(Integer yid) {
        this.yid = yid;
    }

    public String getImgsrc1() {
        return imgsrc1;
    }

    public void setImgsrc1(String imgsrc1) {
        this.imgsrc1 = imgsrc1 == null ? null : imgsrc1.trim();
    }
}