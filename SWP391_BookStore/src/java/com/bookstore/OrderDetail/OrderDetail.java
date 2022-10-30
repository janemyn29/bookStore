/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.OrderDetail;

/**
 *
 * @author tramy
 */
public class OrderDetail {
    public int detailID;
    public int orderID;
    public long bookcode;
    public String bName ;
    public String img;
    public int quantity;
    public int price;

    public OrderDetail() {
    }

    public OrderDetail(int detailID, int orderID, long bookcode, String bName, String img, int quantity, int price) {
        this.detailID = detailID;
        this.orderID = orderID;
        this.bookcode = bookcode;
        this.bName = bName;
        this.img = img;
        this.quantity = quantity;
        this.price = price;
    }

    public int getDetailID() {
        return detailID;
    }

    public void setDetailID(int detailID) {
        this.detailID = detailID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public long getBookcode() {
        return bookcode;
    }

    public void setBookcode(long bookcode) {
        this.bookcode = bookcode;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderDetail{" + "detailID=" + detailID + ", orderID=" + orderID + ", bookcode=" + bookcode + ", bName=" + bName + ", img=" + img + ", quantity=" + quantity + ", price=" + price + '}';
    }
    
    
}
