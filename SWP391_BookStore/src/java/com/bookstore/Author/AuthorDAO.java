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

    public static void main(String[] args) {

        BookDAO dao = new BookDAO();
            List<Book> list = dao.getBookManage();
            AuthorDAO authordAO = new AuthorDAO();
            
            for (Book b : list) {
                
                String code= String.valueOf(b.getBookCode());
                List<Author> listA=authordAO.getListAuthorByBookcode(code);
                String plusString="";
                if (listA.size()==0) {
                    
                }else if(listA.size()==1){
                    b.setAuthorName(listA.get(0).getName());
                    
                }else if (listA.size()>1) {
                    plusString="";
                    for (Author a : listA) {
                        plusString=plusString+","+a.getName();
                    }
                    b.setAuthorName(plusString);
                }
}

        System.out.println(list);
    }
}
