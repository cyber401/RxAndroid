package com.example.rxandroid;

import java.math.BigDecimal;
import java.util.Date;

public class Entry {
    private String price;
    private String nameOfCommodity;
    private String date;

    public Entry(String price, String nameOfCommodity, String date) {
        this.price = price;
        this.nameOfCommodity = nameOfCommodity;
        this.date = date;
    }


    public String getDate() {
        return date;
    }

    public String getPrice() {
        return price;
    }

    public String getNameOfCommodity() {
        return nameOfCommodity;
    }
}
