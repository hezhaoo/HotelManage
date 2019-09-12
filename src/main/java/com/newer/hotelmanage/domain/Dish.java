package com.newer.hotelmanage.domain;

import java.math.BigDecimal;

public class Dish {
    private Integer dishid;

    private String dishname;

    private String engdishname;

    private BigDecimal price;

    private Integer type;

    private Integer stock;

    private String filename;

    private Integer drinkbillid;

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

    public String getEngdishname() {
        return engdishname;
    }

    public void setEngdishname(String engdishname) {
        this.engdishname = engdishname == null ? null : engdishname.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public Integer getDrinkbillid() {
        return drinkbillid;
    }

    public void setDrinkbillid(Integer drinkbillid) {
        this.drinkbillid = drinkbillid;
    }
}