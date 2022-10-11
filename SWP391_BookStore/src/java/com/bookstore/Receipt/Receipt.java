/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.Receipt;

import java.sql.Date;
import java.util.List;

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
    private long bookcode;
    private int importQty;
    private int importPrice;
    private  String bookName;
    private int quantity;

    

    public Receipt() {
    }

    public Receipt(int receiptID, int accountID, Date orderDate, int totalImportPrice, int companyID) {
        this.receiptID = receiptID;
        this.accountID = accountID;
        this.orderDate = orderDate;
        this.totalImportPrice = totalImportPrice;
        this.companyID = companyID;
    }

    public Receipt(Date orderDate, int totalImportPrice, String companyName, long bookcode, int importQty, String bookName, int quantity) {
        this.orderDate = orderDate;
        this.totalImportPrice = totalImportPrice;
        this.companyName = companyName;
        this.bookcode = bookcode;
        this.importQty = importQty;
        this.bookName = bookName;
         this.quantity = quantity;
    }

    public Receipt( long bookcode, String bookName,int totalImportPrice,int quantity,int receiptID) {
       
        
        this.bookcode = bookcode;
        this.bookName = bookName;
        this.totalImportPrice = totalImportPrice;
        this.quantity = quantity;
         this.receiptID = receiptID;
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

    public long getBookcode() {
        return bookcode;
    }

    public void setBookcode(long bookcode) {
        this.bookcode = bookcode;
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
        return "Receipt{" + "receiptID=" + receiptID + ", accountID=" + accountID + ", orderDate=" + orderDate + ", totalImportPrice=" + totalImportPrice + ", companyID=" + companyID + ", companyName=" + companyName + ", RdetailID=" + RdetailID + ", bookcode=" + bookcode + ", importQty=" + importQty + ", importPrice=" + importPrice + '}';
    }


    
    
    
    
    
}
