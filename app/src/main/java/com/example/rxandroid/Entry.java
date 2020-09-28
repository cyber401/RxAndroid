package com.example.rxandroid;

import java.math.BigDecimal;
import java.util.Date;

public class Entry {
    private BigDecimal price;
    private String nameOfCommodity;
    private Date date;

    public Entry(BigDecimal price, String nameOfCommodity, Date date) {
        this.price = price;
        this.nameOfCommodity = nameOfCommodity;
        this.date = date;
    }


    public Date getDate() {
        return date;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getNameOfCommodity() {
        return nameOfCommodity;
    }
}
