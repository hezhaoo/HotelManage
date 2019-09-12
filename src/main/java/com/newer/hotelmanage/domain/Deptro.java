package com.newer.hotelmanage.domain;

public class Deptro {
    private Integer deptno;

    private String danem;

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDanem() {
        return danem;
    }

    public void setDanem(String danem) {
        this.danem = danem == null ? null : danem.trim();
    }
}