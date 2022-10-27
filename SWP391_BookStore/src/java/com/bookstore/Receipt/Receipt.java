/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.Receipt;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class Receipt {
    private int receiptID;
    private int accountID;
    private Date orderDate;
    private int totalImportPrice;
    private int companyID;
    private String companyName;
    private int RdetailID;
    private long bookCode;
    private int importQty;
    private int importPrice;
    private  String bookName;
    private int quantity;

    

    public Receipt() {
    }

    public Receipt(int receiptID, Date orderDate, int totalImportPrice, String companyName) {
        this.receiptID = receiptID;
        this.orderDate = orderDate;
        this.totalImportPrice = totalImportPrice;
        this.companyName = companyName;
    }
    
    
    
    public Receipt(int receiptID, int accountID, Date orderDate, int totalImportPrice, int companyID) {
        this.receiptID = receiptID;
        this.accountID = accountID;
        this.orderDate = orderDate;
        this.totalImportPrice = totalImportPrice;
        this.companyID = companyID;
    }

    public Receipt(Date orderDate, int totalImportPrice, String companyName, long bookCode, int importQty, String bookName,int receiptID, int quantity) {
        this.orderDate = orderDate;
        this.totalImportPrice = totalImportPrice;
        this.companyName = companyName;
        this.bookCode = bookCode;
        this.importQty = importQty;
        this.bookName = bookName;
        this.receiptID = receiptID;
        this.quantity = quantity;
    }

    public Receipt(Date orderDate, int totalImportPrice, String companyName, long bookCode, int importQty, int importPrice, String bookName, int quantity) {
        this.orderDate = orderDate;
        this.totalImportPrice = totalImportPrice;
        this.companyName = companyName;
        this.bookCode = bookCode;
        this.importQty = importQty;
        this.importPrice = importPrice;
        this.bookName = bookName;
        this.quantity = quantity;
    }

    
    
    

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

 

  

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getRdetailID() {
        return RdetailID;
    }

    public void setRdetailID(int RdetailID) {
        this.RdetailID = RdetailID;
    }

    public long getBookCode() {
        return bookCode;
    }

    public void setBookCode(long bookcode) {
        this.bookCode = bookcode;
    }

    public int getImportQty() {
        return importQty;
    }

    public void setImportQty(int importQty) {
        this.importQty = importQty;
    }

    public int getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(int importPrice) {
        this.importPrice = importPrice;
    }

 




    public int getReceiptID() {
        return receiptID;
    }

    public void setReceiptID(int receiptID) {
        this.receiptID = receiptID;
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

    public int getTotalImportPrice() {
        return totalImportPrice;
    }

    public void setTotalImportPrice(int totalImportPrice) {
        this.totalImportPrice = totalImportPrice;
    }

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    @Override
    public String toString() {
        return "Receipt{" + "orderDate=" + orderDate+ ", totalImportPrice=" + totalImportPrice + ", companyName=" + companyName + ", bookCode=" + bookCode + ", importQty=" + importQty +" bookName=" + bookName + ", quantity=" + quantity +   ", receiptID=" + receiptID  +  "," + '}';
    }


  

    
    
    
    
    
}
