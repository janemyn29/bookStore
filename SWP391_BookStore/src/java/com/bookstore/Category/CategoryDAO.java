/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.Category;

import com.bookstore.Book.Book;
import com.bookstore.Book.BookDAO;
import com.bookstore.Utils.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class CategoryDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Category> getCategoryBook() {
        List<Category> list = new ArrayList<>();
        String sql = "select cateId,cateName\n" +
                    "from tblCategory";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Category(rs.getInt(1),rs.getString(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public List<Book> getBookByCategory(String CName) {
        List<Book> list = new ArrayList<>();
        String sql = "select b.bookCode, b.bookName, b.img, b.importPrice, b.buyPrice, b.description, b.quantity,c.cateID,c.cateName,p.postID,p.postName,pc.companyID,pc.companyName,b.postDate\n" +
                "from (((tblBook b inner join tblCategory c on b.cateID=c.cateID)\n" +
                "inner join tblPostHistory p on p.postID=b.postID)\n" +
                "inner join tblPublishCompany pc on pc.companyID=b.companyID )\n" +
                "where c.cateName= ? ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, CName);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Book(rs.getLong(1),//bookcode
                        rs.getString(2), //bookname
                        rs.getString(3), //img
                        rs.getInt(4),//impPrice
                        rs.getInt(5), //buyPrice
                        rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getString(9), rs.getInt(10), rs.getString(11), rs.getInt(12), rs.getString(13),rs.getDate(14)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public static void main(String[] args) {
        CategoryDAO dao = new CategoryDAO();
        }
    }

