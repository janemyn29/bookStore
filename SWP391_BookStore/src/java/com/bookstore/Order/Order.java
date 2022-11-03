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
    private String accName;
    private String email;
    private String phone;
    private int oDetailQty;
    private int buyPrice;
    private int oDetailID;
    private long bookCode;
    

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

    public Order(int orderID, int accountID, Date orderDate, String address, int total, String Note, String status, String accName, String email, String phone) {
        this.orderID = orderID;
        this.accountID = accountID;
        this.orderDate = orderDate;
        this.address = address;
        this.total = total;
        this.Note = Note;
        this.status = status;
        this.accName = accName;
        this.email = email;
        this.phone = phone;
    }
    
    public Order(int oDetailID, long bookCode, int oDetailQty, int buyPrice, int orderID) {
        this.oDetailID = oDetailID;
        this.bookCode = bookCode;
        this.oDetailQty = oDetailQty;
        this.buyPrice = buyPrice;
        this.orderID = orderID;
    }

    public int getoDetailQty() {
        return oDetailQty;
    }

    public void setoDetailQty(int oDetailQty) {
        this.oDetailQty = oDetailQty;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public int getoDetailID() {
        return oDetailID;
    }

    public void setoDetailID(int oDetailID) {
        this.oDetailID = oDetailID;
    }

    public long getBookCode() {
        return bookCode;
    }

    public void setBookCode(long bookCode) {
        this.bookCode = bookCode;
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

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Order{" + "orderID=" + orderID + ", accountID=" + accountID + ", orderDate=" + orderDate + ", address=" + address + ", total=" + total + ", Note=" + Note + ", status=" + status + ", accName=" + accName + ", email=" + email + ", phone=" + phone + '}';
    }

    
    
    
    
  
}
