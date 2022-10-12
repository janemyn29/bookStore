/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.Order;

import java.sql.Date;

/**
 *
 * @author tramy
 */
public class Order {
    private int orderID;
    private int accountID;
    private Date orderDate;
    private String address;
    private int total;
    private String Note;
    private String status;

    public Order() {
    }

    public Order(int orderID, int accountID, Date orderDate, String address, int total, String Note, String status) {
        this.orderID = orderID;
        this.accountID = accountID;
        this.orderDate = orderDate;
        this.address = address;
        this.total = total;
        this.Note = Note;
        this.status = status;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String Note) {
        this.Note = Note;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" + "orderID=" + orderID + ", accountID=" + accountID + ", orderDate=" + orderDate + ", address=" + address + ", total=" + total + ", Note=" + Note + ", status=" + status + '}';
    }

    
    
  
}
