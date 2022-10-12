/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.Cart;

import com.bookstore.Book.Book;
import java.util.HashMap;

/**
 *
 * @author Admin
 */
public class CartBean extends HashMap {

    public CartBean() {
        super();
    }

    public void addBook(Book book) {
        String key = book.getBookName();
        if (this.containsKey(key)) {
            int oldQuantity = ((Book) this.get(key)).getQty();
            ((Book) this.get(key)).setQty(oldQuantity + 1);
        } else {
            this.put(book.getBookName(), book);
        }
    }

    public boolean removeBook(String bookName) {
        if (this.containsKey(bookName)) {
            this.remove(bookName);
        }
        return false;
    }
}
