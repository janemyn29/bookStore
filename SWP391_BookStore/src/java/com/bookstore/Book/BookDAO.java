/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.Book;

import com.bookstore.Utils.DBUtils;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
        String sql = " select b.bookCode, b.bookName, b.img, b.importPrice, b.buyPrice, b.description, b.quantity,c.cateID,c.cateName,p.postID,p.postName,pc.companyID,pc.companyName,b.postDate\n"
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
                        rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getString(9), rs.getInt(10), rs.getString(11), rs.getInt(12), rs.getString(13), rs.getDate(14)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Book getBookBybookCode(String bookCode) {
        String sql = "select b.bookCode, b.bookName, b.img, b.importPrice, b.buyPrice, b.description, b.quantity,c.cateID,c.cateName,p.postID,p.postName,pc.companyID,pc.companyName,b.postDate\n"
                + "from (((tblBook b inner join tblCategory c on b.cateID=c.cateID)\n"
                + "inner join tblPostHistory p on p.postID=b.postID)\n"
                + "inner join tblPublishCompany pc on pc.companyID=b.companyID )\n"
                + " where b.bookCode= ? ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, bookCode);
            rs = ps.executeQuery();

            while (rs.next()) {
                return new Book(rs.getLong(1),//bookcode
                        rs.getString(2), //bookname
                        rs.getString(3), //img
                        rs.getInt(4),//impPrice
                        rs.getInt(5), //buyPrice
                        rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getString(9), rs.getInt(10), rs.getString(11), rs.getInt(12), rs.getString(13), rs.getDate(14));
            }
        } catch (Exception e) {
        }
        return null;
    }
//       public String getRealTime() {
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = new Date(System.currentTimeMillis());
//        String dateToString = formatter.format(date);
//        return dateToString;
//    }
//        public String getRealTime(){
//            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
//            LocalDateTime now = LocalDateTime.now(); 
//            String strDate = dtf.format(now);  
//            return strDate;  
//        }
//           public boolean checkActive(String dateToString) {
//        Book dto = new Book();
//        List<Book> list = new ArrayList<>();
//       list = getAllBook();
//        for (Book getDate : list) {
//            if (dateToString.compareTo(getDate.getPostDate()) > 0 && getDate.get().compareTo(dateToString) < 0) {
//                getDate.isCheckActive() = false;
//                boolean check = updateCheckActive(getDate.checkActive, getDate.getCourseID());
//                if (check) {
//                    continue;
//                }
//            } else {
//                getDate.checkActive = true;
//                boolean check = updateCheckActive(getDate.checkActive, getDate.getCourseID());
//                if (check) {
//                    continue;
//                }
//            }
//        }
//        return false;
//    }
//       hàm check còn trong mục giảm giá

    //recent arrival so sánh sản phẩm.getDate với sản phẩm có ngày gần nhất
    // sử dụng sql select top(10)
    public List<Book> getRecentBook() {
        List<Book> list = new ArrayList<>();
        String sql = " select top 10 b.bookCode, b.bookName, b.img, b.importPrice, b.buyPrice, b.description, b.quantity,c.cateID,c.cateName,p.postID,p.postName,pc.companyID,pc.companyName,b.postDate\n"
                + "from (((tblBook b inner join tblCategory c on b.cateID=c.cateID)\n"
                + "inner join tblPostHistory p on p.postID=b.postID)\n"
                + "inner join tblPublishCompany pc on pc.companyID=b.companyID )\n"
                + "order by b.postDate";
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
                        rs.getString(6), 
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getString(9),
                        rs.getInt(10),
                        rs.getString(11),
                        rs.getInt(12), 
                        rs.getString(13),
                        rs.getDate(14)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Book> getDiscountBook()  {
        List<Book> list = new ArrayList<>();
        String sql = "select b.bookCode, b.bookName, b.img, b.importPrice, b.buyPrice, b.description, b.quantity,c.cateID,c.cateName,p.postID,p.postName,pc.companyID,pc.companyName,b.postDate,d.discountPercent\n" +
            " from ((((tblBook b inner join tblCategory c on b.cateID=c.cateID)\n" +
            " inner join tblPostHistory p on p.postID=b.postID)\n" +
            " inner join tblDiscount d on b.bookCode=d.bookCode)\n" +
            " inner join tblPublishCompany pc on pc.companyID=b.companyID)\n" +
            "where (select GETDATE()) between d.startDate and d.endDate";
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
                        rs.getString(6), 
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getString(9),
                        rs.getInt(10),
                        rs.getString(11),
                        rs.getInt(12), 
                        rs.getString(13),
                        rs.getDate(14),
                        rs.getInt(15)));
            }
        } catch (Exception e) {
        }
        return list;
    }
        public List<Book> SearchBook()  {
        List<Book> list = new ArrayList<>();
        String sql = "select b.bookCode, b.bookName, b.img, b.importPrice, b.buyPrice, b.description, b.quantity,c.cateID,c.cateName,p.postID,p.postName,pc.companyID,pc.companyName,b.postDate,d.discountPercent\n" +
                "from ((((tblBook b inner join tblCategory c on b.cateID=c.cateID)\n" +
                " inner join tblPostHistory p on p.postID=b.postID)\n" +
                "inner join tblDiscount d on b.bookCode=d.bookCode)\n" +
                "inner join tblPublishCompany pc on pc.companyID=b.companyID)\n" +
                "where b.bookName like ? or b.bookCode like ? ";
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
                        rs.getString(6), 
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getString(9),
                        rs.getInt(10),
                        rs.getString(11),
                        rs.getInt(12), 
                        rs.getString(13),
                        rs.getDate(14),
                        rs.getInt(15)));
            }
        } catch (Exception e) {
        }
        return list;
    }

}


