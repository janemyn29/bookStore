/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.Author;

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
 * @author tramy
 */
public class AuthorDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Author> getListAuthorByBookcode(String code) {
        List<Author> list = new ArrayList<>();

        String sql = " select c.composeID, c.bookCode, a.authorID,a.authorName\n"
                + "from [dbo].[tblAuthor] a inner join [dbo].[tblCompose] c on a.authorID = c.authorID\n"
                + "where c.bookCode=? ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            
            ps.setString(1, code);
            rs = ps.executeQuery();

            while (rs.next()) {

                list.add(new Author(rs.getInt(1), rs.getLong(2), rs.getInt(3), rs.getString(4)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public List<Author> getListAuthor() {
        List<Author> list = new ArrayList<>();

        String sql = " select c.composeID, c.bookCode, a.authorID,a.authorName\n"
                + "from [dbo].[tblAuthor] a inner join [dbo].[tblCompose] c on a.authorID = c.authorID\n";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                list.add(new Author(rs.getInt(1), rs.getLong(2), rs.getInt(3), rs.getString(4)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public static void main(String[] args) {

            AuthorDAO authordAO = new AuthorDAO();
            
            List<Author> list= authordAO.getListAuthor();

        System.out.println(list);
    }
}
