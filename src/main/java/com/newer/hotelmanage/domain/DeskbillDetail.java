package com.newer.hotelmanage.domain;

import java.math.BigDecimal;

public class DeskbillDetail {
    private Integer id;

    private Integer deskbillid;

    private BigDecimal cost;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeskbillid() {
        return deskbillid;
    }

    public void setDeskbillid(Integer deskbillid) {
        this.deskbillid = deskbillid;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}