/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.Discount;

import java.sql.Date;

/**
 *
 * @author tramy
 */
public class Discount {
    private int discountID;
    private long bookCode;
    private Date startDate;
    private Date endDate;
    private int percent;

    public Discount() {
    }

    public Discount(int discountID, long bookCode, Date startDate, Date endDate, int percent) {
        this.discountID = discountID;
        this.bookCode = bookCode;
        this.startDate = startDate;
        this.endDate = endDate;
        this.percent = percent;
    }

    public int getDiscountID() {
        return discountID;
    }

    public void setDiscountID(int discountID) {
        this.discountID = discountID;
    }

    public long getBookCode() {
        return bookCode;
    }

    public void setBookCode(long bookCode) {
        this.bookCode = bookCode;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    @Override
    public String toString() {
        return "Discount{" + "discountID=" + discountID + ", bookCode=" + bookCode + ", startDate=" + startDate + ", endDate=" + endDate + ", percent=" + percent + '}';
    }
    
    
}


