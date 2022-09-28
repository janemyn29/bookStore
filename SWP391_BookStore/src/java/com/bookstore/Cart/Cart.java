/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.Cart;

import com.bookstore.Book.Book;
import java.sql.Date;

/**
 *
 * @author Admin
 */
public class Cart {

    private Book book;
    private int qty;

    public Cart(Book book, int qty) {
        this.book = book;
        this.qty = qty;
    }

    public long getBookCode() {
        return book.getBookCode();
    }

    public String getbookName() {
        return book.getBookName();
    }

    public String getimage() {
        return book.getImage();
    }

    public int getImportPrice() {
        return book.getImportPrice();
    }

    public int getBuyPrice() {
        return book.getBuyPrice();
    }

    public String getDescription() {
        return book.getDescription();
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getCateID() {
        return book.getCateID();
    }

    public String getCateName() {
        return book.getCateName();
    }

    public int getPostID() {
        return book.getPostID();
    }

    public String getPostName() {
        return book.getPostName();
    }

    public int getCompanyID() {
        return book.getCompanyID();
    }

    public String getCompanyName() {
        return book.getCompanyName();
    }

    public Date getPostDate() {
        return book.getPostDate();
    }
}
