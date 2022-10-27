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
    private String orderDate;
    private String address;
    private int total;
    private String Note;
    private String status;
    private int oDetailID;
    private long bookCode;
    private int oDetailQty;
    private int buyPrice;
    private String bookName;
    private String image;

    public Order() {
    }

    public Order(int orderID, int accountID, String orderDate, String address, int total, String Note, String status) {
        this.orderID = orderID;
        this.accountID = accountID;
        this.orderDate = orderDate;
        this.address = address;
        this.total = total;
        this.Note = Note;
        this.status = status;
    }

    public Order(int oDetailID, long bookCode, int oDetailQty, int buyPrice, int orderID) {
        this.oDetailID = oDetailID;
        this.bookCode = bookCode;
        this.oDetailQty = oDetailQty;
        this.buyPrice = buyPrice;
        this.orderID = orderID;
    }

        public Order(String orderDate, String address, int total, String Note, String status, int oDetailID, long bookCode, int oDetailQty, int buyPrice, String bookName, String image) {
        this.orderDate = orderDate;
        this.address = address;
        this.total = total;
        this.Note = Note;
        this.status = status;
        this.oDetailID = oDetailID;
        this.bookCode = bookCode;
        this.oDetailQty = oDetailQty;
        this.buyPrice = buyPrice;
        this.bookName = bookName;
        this.image = image;
    }

    public Order(String orderDate, String address, String Note, String status) {
        this.orderDate = orderDate;
        this.address = address;
        this.Note = Note;
        this.status = status;
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

    public int getoDetailQty() {
        return oDetailQty;
    }

    public void setoDetailQty(int oDetailQty) {
        this.oDetailQty = oDetailQty;
    }

    public int getPrice() {
        return buyPrice;
    }

    public void setbuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
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

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
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

    public int getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Order{" + "orderID=" + orderID + ", accountID=" + accountID + ", orderDate=" + orderDate + ", address=" + address + ", total=" + total + ", Note=" + Note + ", status=" + status + ", oDetailID=" + oDetailID + ", bookCode=" + bookCode + ", oDetailQty=" + oDetailQty + ", buyPrice=" + buyPrice + '}';
    }

}
