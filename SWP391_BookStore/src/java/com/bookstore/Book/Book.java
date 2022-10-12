/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.Book;

import java.sql.Date;

/**
 *
 * @author tramy
 */
public class Book {

    private long bookCode;
    private String bookName;
    private String image;
    private int importPrice;
    private int buyPrice;
    private String description;
    private int qty;
    private int cateID;
    private String cateName;
    private int postID;
    private String postName;
    private int companyID;
    private String companyName;
    private Date postDate;
    private int discountPercent;
    

    public Book() {
    }

    public Book(String bookName) {
        this.bookName = bookName;
    }

    
    

    public Book(long bookCode, String bookName, String image, int importPrice, int buyPrice, String description, int qty, int cateID, String cateName, int postID, String postName, int companyID, String companyName) {
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.image = image;
        this.importPrice = importPrice;
        this.buyPrice = buyPrice;
        this.description = description;
        this.qty = qty;
        this.cateID = cateID;
        this.cateName = cateName;
        this.postID = postID;
        this.postName = postName;
        this.companyID = companyID;
        this.companyName = companyName;
    }

    public Book(long bookCode, String bookName, String image, int importPrice, int buyPrice, String description, int qty, int cateID, String cateName, int postID, String postName, int companyID, String companyName, Date postDate) {
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.image = image;
        this.importPrice = importPrice;
        this.buyPrice = buyPrice;
        this.description = description;
        this.qty = qty;
        this.cateID = cateID;
        this.cateName = cateName;
        this.postID = postID;
        this.postName = postName;
        this.companyID = companyID;
        this.companyName = companyName;
        this.postDate = postDate;
    }

    public Book(long bookCode, String bookName, String image, int importPrice, int buyPrice, String description, int qty, int cateID, String cateName, int postID, String postName, int companyID, String companyName, Date postDate, int discountPercent) {
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.image = image;
        this.importPrice = importPrice;
        this.buyPrice = buyPrice;
        this.description = description;
        this.qty = qty;
        this.cateID = cateID;
        this.cateName = cateName;
        this.postID = postID;
        this.postName = postName;
        this.companyID = companyID;
        this.companyName = companyName;
        this.postDate = postDate;
        this.discountPercent = discountPercent;
    }


    


    
    
    public long getBookCode() {
        return bookCode;
    }

    public void setBookCode(long bookCode) {
        this.bookCode = bookCode;
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

    public int getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(int importPrice) {
        this.importPrice = importPrice;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getCateID() {
        return cateID;
    }

    public void setCateID(int cateID) {
        this.cateID = cateID;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    @Override
    public String toString() {
        return "Book{" + "bookCode=" + getBookCode() + ", bookName=" + getBookName() + ", image=" + getImage() + ", importPrice=" + getImportPrice() + ", buyPrice=" + getBuyPrice() + ", description=" + getDescription() + ", qty=" + getQty() + ", cateID=" + getCateID() + ", cateName=" + getCateName() + ", postID=" + getPostID() + ", postName=" + getPostName() + ", companyID=" + getCompanyID() + ", companyName=" + getCompanyName() + ", postDate=" + getPostDate() + '}';
    }

    /**
     * @return the checkActive
     */

    /**
     * @param checkActive the checkActive to set
     */

    /**
     * @return the discountPercent
     */
    public int getDiscountPercent() {
        return discountPercent;
    }

    /**
     * @param discountPercent the discountPercent to set
     */

    /**
     * @param discountPercent the discountPercent to set
     */
    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
    }

}
