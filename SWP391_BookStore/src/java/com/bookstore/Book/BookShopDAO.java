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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tramy
 */
public class BookShopDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<BookShop> getAllBook(int index, int size) {
        List<BookShop> list = new ArrayList<>();
        String sql = " with x as (select ROW_NUMBER() over (order by postDate desc)as r,b.bookCode, b.bookName, b.img, b.importPrice, b.buyPrice, b.description, b.quantity,ca.cateID,ca.cateName,p.postID,p.postName,b.postDate\n"
                + "from (((tblBook b \n"
                + "inner join tblCategory ca on b.cateID=ca.cateID)\n"
                + "inner join tblPostHistory p on p.postID=b.postID)\n"
                + "inner join tblPublishCompany pc on pc.companyID=b.companyID )\n"
                + "where b.postID=1)\n"
                + "select * from x where r between ?*8-7 and ?*8 ";

        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, index);
            ps.setInt(2, index);
            rs = ps.executeQuery();
            while (rs.next()) {

                list.add(new BookShop(
                        rs.getLong("bookCode"),//bookcode
                        rs.getString("bookName"),//bookname 
                        rs.getString("img"),//image
                        rs.getInt("importPrice"),//importprice
                        rs.getInt("buyPrice"),//buyprice
                        rs.getString("description"),//description
                        rs.getInt("quantity"),//qty
                        rs.getInt("cateID"),//cateID
                        rs.getString("cateName"),//catename
                        rs.getInt("postID"),//postID 
                        rs.getString("postName"),//postName
                        rs.getDate("postDate"),//postdate
                        0,
                        ""//author
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<BookShop> SearchBook(String searchKey, int index, int size) {
        List<BookShop> list = new ArrayList<>();
        String sql = " with x as (select ROW_NUMBER() over (order by postDate desc)as r,b.bookCode, b.bookName, b.img, b.importPrice, b.buyPrice, b.description, b.quantity,ca.cateID,ca.cateName,p.postID,p.postName,b.postDate\n"
                + "from (((tblBook b \n"
                + "inner join tblCategory ca on b.cateID=ca.cateID)\n"
                + "inner join tblPostHistory p on p.postID=b.postID)\n"
                + "inner join tblPublishCompany pc on pc.companyID=b.companyID )\n"
                + "where b.postID=1 and b.bookName like ?)\n"
                + "select * from x where r between ?*8-7 and ?*8 ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + searchKey + "%");
            ps.setInt(2, index);
            ps.setInt(3, index);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new BookShop(
                        rs.getLong("bookCode"),//bookcode
                        rs.getString("bookName"),//bookname 
                        rs.getString("img"),//image
                        rs.getInt("importPrice"),//importprice
                        rs.getInt("buyPrice"),//buyprice
                        rs.getString("description"),//description
                        rs.getInt("quantity"),//qty
                        rs.getInt("cateID"),//cateID
                        rs.getString("cateName"),//catename
                        rs.getInt("postID"),//postID 
                        rs.getString("postName"),//postName
                        rs.getDate("postDate"),//postdate
                        0,
                        ""//author
                ));

            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<BookShop> getRecentBook() {
        List<BookShop> list = new ArrayList<>();
        String sql = " select top 10  b.bookCode, b.bookName, b.img, b.importPrice, b.buyPrice, b.description, b.quantity,ca.cateID,ca.cateName,p.postName,p.postID,b.postDate\n"
                + "from (((tblBook b \n"
                + " inner join tblCategory ca on b.cateID=ca.cateID)\n"
                + "inner join tblPostHistory p on p.postID=b.postID)\n"
                + "inner join tblPublishCompany pc on pc.companyID=b.companyID )\n"
                + "where b.postID='1'\n"
                + "order by b.postDate";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new BookShop(
                        rs.getLong("bookCode"),//bookcode
                        rs.getString("bookName"),//bookname 
                        rs.getString("img"),//image
                        rs.getInt("importPrice"),//importprice
                        rs.getInt("buyPrice"),//buyprice
                        rs.getString("description"),//description
                        rs.getInt("quantity"),//qty
                        rs.getInt("cateID"),//cateID
                        rs.getString("cateName"),//catename
                        rs.getInt("postID"),//postID 
                        rs.getString("postName"),//postName
                        rs.getDate("postDate"),//postdate
                        0,
                        ""//author
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<BookShop> getDiscountBook() {
        List<BookShop> list = new ArrayList<>();
        String sql = "select b.bookCode, b.bookName, b.img, b.importPrice, b.buyPrice, b.description, b.quantity,p.postID,ca.cateID,ca.cateName,p.postName,pc.companyID,pc.companyName,b.postDate,d.discountPercent\n"
                + "from ((((tblBook b left join tblDiscount d on b.bookCode=d.bookCode)\n"
                + "inner join tblCategory ca on b.cateID=ca.cateID)\n"
                + "inner join tblPostHistory p on p.postID=b.postID)\n"
                + "inner join tblPublishCompany pc on pc.companyID=b.companyID )\n"
                + "where (select GETDATE()) between d.startDate and d.endDate and b.postID='1'";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new BookShop(
                        rs.getLong("bookCode"),//bookcode
                        rs.getString("bookName"),//bookname 
                        rs.getString("img"),//image
                        rs.getInt("importPrice"),//importprice
                        rs.getInt("buyPrice"),//buyprice
                        rs.getString("description"),//description
                        rs.getInt("quantity"),//qty
                        rs.getInt("cateID"),//cateID
                        rs.getString("cateName"),//catename
                        rs.getInt("postID"),//postID 
                        rs.getString("postName"),//postName
                        rs.getDate("postDate"),//postdate
                        rs.getInt("discountPercent"),
                        ""//author
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public BookShop getBookBybookCode(String bookCode) {
        String sql = " select b.bookCode, b.bookName, b.img, b.importPrice, b.buyPrice, b.description, b.quantity,ca.cateID,ca.cateName,p.postName,p.postID,b.postDate,d.discountPercent\n"
                + "from ((((tblBook b left join tblDiscount d on b.bookCode=d.bookCode)\n"
                + "inner join tblCategory ca on b.cateID=ca.cateID)\n"
                + "inner join tblPostHistory p on p.postID=b.postID)\n"
                + "inner join tblPublishCompany pc on pc.companyID=b.companyID )\n"
                + " where b.bookCode= ? ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, bookCode);
            rs = ps.executeQuery();

            while (rs.next()) {
                return new BookShop(
                        rs.getLong("bookCode"),//bookcode
                        rs.getString("bookName"),//bookname 
                        rs.getString("img"),//image
                        rs.getInt("importPrice"),//importprice
                        rs.getInt("buyPrice"),//buyprice
                        rs.getString("description"),//description
                        rs.getInt("quantity"),//qty
                        rs.getInt("cateID"),//cateID
                        rs.getString("cateName"),//catename
                        rs.getInt("postID"),//postID 
                        rs.getString("postName"),//postName
                        rs.getDate("postDate"),//postdate
                        rs.getInt("discountPercent"),
                        ""//author
                );
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<BookShop> getBookByCategoryTop(String CName) {
        List<BookShop> list = new ArrayList<>();
        String sql = "	 select top 4 b.bookCode, b.bookName, b.img, b.importPrice, b.buyPrice, b.description, b.quantity,ca.cateID,ca.cateName,p.postName,p.postID,b.postDate\n"
                + "from (((tblBook b\n"
                + "inner join tblCategory ca on b.cateID=ca.cateID)\n"
                + "inner join tblPostHistory p on p.postID=b.postID)\n"
                + "inner join tblPublishCompany pc on pc.companyID=b.companyID )\n"
                + "where ca.cateName=?  and p.postID=1 "
                + "order by b.postDate";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, CName);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new BookShop(
                        rs.getLong("bookCode"),//bookcode
                        rs.getString("bookName"),//bookname 
                        rs.getString("img"),//image
                        rs.getInt("importPrice"),//importprice
                        rs.getInt("buyPrice"),//buyprice
                        rs.getString("description"),//description
                        rs.getInt("quantity"),//qty
                        rs.getInt("cateID"),//cateID
                        rs.getString("cateName"),//catename
                        rs.getInt("postID"),//postID 
                        rs.getString("postName"),//postName
                        rs.getDate("postDate"),//postdate
                        0,
                        ""//author
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<BookShop> getBookByCategory(String CName) {
        List<BookShop> list = new ArrayList<>();
        String sql = "	 select b.bookCode, b.bookName, b.img, b.importPrice, b.buyPrice, b.description, b.quantity,ca.cateID,ca.cateName,p.postName,p.postID,b.postDate\n"
                + "from (((tblBook b\n"
                + "inner join tblCategory ca on b.cateID=ca.cateID)\n"
                + "inner join tblPostHistory p on p.postID=b.postID)\n"
                + "inner join tblPublishCompany pc on pc.companyID=b.companyID )\n"
                + "where ca.cateName=?  and p.postID=1 ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, CName);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new BookShop(
                        rs.getLong("bookCode"),//bookcode
                        rs.getString("bookName"),//bookname 
                        rs.getString("img"),//image
                        rs.getInt("importPrice"),//importprice
                        rs.getInt("buyPrice"),//buyprice
                        rs.getString("description"),//description
                        rs.getInt("quantity"),//qty
                        rs.getInt("cateID"),//cateID
                        rs.getString("cateName"),//catename
                        rs.getInt("postID"),//postID 
                        rs.getString("postName"),//postName
                        rs.getDate("postDate"),//postdate
                        0,
                        ""//author
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<BookShop> getAllBook() {
        List<BookShop> list = new ArrayList<>();
        String sql = " select * from tblBook\n"
                + "where postID=1; ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new BookShop(rs.getLong("bookCode"), rs.getString("bookName")));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public BookShop getBookBybookCodeV2(String bookCode) {
        String sql = " select b.bookCode, b.bookName, b.img, b.importPrice, b.buyPrice, b.description, b.quantity,ca.cateID,ca.cateName,p.postName,p.postID,b.postDate,d.discountPercent,pc.companyName\n"
                + "from ((((tblBook b left join tblDiscount d on b.bookCode=d.bookCode)\n"
                + "inner join tblCategory ca on b.cateID=ca.cateID)\n"
                + "inner join tblPostHistory p on p.postID=b.postID)\n"
                + "inner join tblPublishCompany pc on pc.companyID=b.companyID )\n"
                + " where b.bookCode= ? ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, bookCode);
            rs = ps.executeQuery();

            while (rs.next()) {
                return new BookShop(
                        rs.getLong("bookCode"),//bookcode
                        rs.getString("bookName"),//bookname 
                        rs.getString("img"),//image
                        rs.getInt("importPrice"),//importprice
                        rs.getInt("buyPrice"),//buyprice
                        rs.getString("description"),//description
                        rs.getInt("quantity"),//qty
                        rs.getInt("cateID"),//cateID
                        rs.getString("cateName"),//catename
                        rs.getInt("postID"),//postID 
                        rs.getString("postName"),//postName
                        rs.getDate("postDate"),//postdate
                        rs.getInt("discountPercent"),
                        "", rs.getString("companyName")//author
                );
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public boolean uploadBookInfor(String img, int price, String des, String cate, String code) {

        String sql = " update tblBook\n"
                + "set img=?, buyPrice= ?, description=?,cateID=?,postID='1'\n"
                + "where bookCode=? ";
        boolean check = false;
        try {

            Connection conn = DBUtils.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, img);
            ps.setInt(2, price);
            ps.setString(3, des);
            ps.setString(4, cate);
            ps.setString(5, code);

            check = ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            System.out.println("Update Student error!" + ex.getMessage());
        }
        return check;
    }
 public boolean uploadBookInforVs2(String img, int price, String des, String cate, String code) {
        String sql = "";
        if (img.equals("")) {
            sql = " update tblBook\n"
                    + "set  buyPrice= ?, description=?,cateID=?,postID='1'\n"
                    + "where bookCode=? ";
        } else {
            sql = " update tblBook\n"
                    + "set img=? buyPrice= ?, description=?,cateID=?,postID='1'\n"
                    + "where bookCode=? ";
        }
        boolean check = false;
        try {

            Connection conn = DBUtils.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            if (img.equals("")) {
                
                ps.setInt(1, price);
                ps.setString(2, des);
                ps.setString(3, cate);
                ps.setString(4, code);
            } else {
                ps.setString(1, img);
                ps.setInt(2, price);
                ps.setString(3, des);
                ps.setString(4, cate);
                ps.setString(5, code);
            }

            check = ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            System.out.println("Update Student error!" + ex.getMessage());
        }
        return check;
    }
    public static void main(String[] args) {
        BookShopDAO dao = new BookShopDAO();
        List<BookShop> book = dao.getAllBook();
        System.out.println(book);
    }
}
