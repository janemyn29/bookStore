/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.Book;

import com.bookstore.Utils.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tramy
 */
public class BookDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Book> getAllBook() {
        List<Book> list = new ArrayList<>();
        String sql = " select b.bookCode, b.bookName, b.img, b.importPrice, b.buyPrice, b.description, b.quantity,c.cateID,c.cateName,p.postID,p.postName,pc.companyID,pc.companyName\n"
                + "from (((tblBook b inner join tblCategory c on b.cateID=c.cateID)\n"
                + "inner join tblPostHistory p on p.postID=b.postID)\n"
                + "inner join tblPublishCompany pc on pc.companyID=b.companyID ) ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                list.add(new Book(rs.getLong(1),//code
                        rs.getString(2), //bookname
                        rs.getString(3), //img
                        rs.getInt(4),//impPrice
                        rs.getInt(5), //buyPrice
                        rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getString(9), rs.getInt(10), rs.getString(11), rs.getInt(12), rs.getString(13)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    
    
    
    public static void main(String[] args) {
        BookDAO dAO=new BookDAO();
        List<Book> list=dAO.getAllBook();
        for (Book book : list) {
            System.out.println(book);
        }
    }
}
