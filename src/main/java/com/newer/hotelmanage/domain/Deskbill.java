package com.newer.hotelmanage.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Deskbill {
    private Integer id;

    private Integer deskid;

    private BigDecimal totalmoney;

    private Integer peoplenum;

    private BigDecimal discount;

    private Date createdate;

    private String debtor;

    private Integer paytype;

    private BigDecimal beforemoney;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeskid() {
        return deskid;
    }

    public void setDeskid(Integer deskid) {
        this.deskid = deskid;
    }

    public BigDecimal getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(BigDecimal totalmoney) {
        this.totalmoney = totalmoney;
    }

    public Integer getPeoplenum() {
        return peoplenum;
    }

    public void setPeoplenum(Integer peoplenum) {
        this.peoplenum = peoplenum;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getDebtor() {
        return debtor;
    }

    public void setDebtor(String debtor) {
        this.debtor = debtor == null ? null : debtor.trim();
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public BigDecimal getBeforemoney() {
        return beforemoney;
    }

    public void setBeforemoney(BigDecimal beforemoney) {
        this.beforemoney = beforemoney;
    }
}