package com.newer.hotelmanage.domain;

public class Menudetails {
    private Integer id;

    private Integer dishid;

    private String dishname;

    private Integer dishnum;

    private Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDishid() {
        return dishid;
    }

    public void setDishid(Integer dishid) {
        this.dishid = dishid;
    }

    public String getDishname() {
        return dishname;
    }

    public void setDishname(String dishname) {
        this.dishname = dishname == null ? null : dishname.trim();
    }

    public Integer getDishnum() {
        return dishnum;
    }

    public void setDishnum(Integer dishnum) {
        this.dishnum = dishnum;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}