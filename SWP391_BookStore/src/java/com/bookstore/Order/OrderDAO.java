/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.Order;

import com.bookstore.Book.Book;
import com.bookstore.Book.BookDAO;
import com.bookstore.Utils.DBUtils;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tramy
 */
public class OrderDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Order> listCancelOrderByAccID(int accID) {
        List<Order> list = new ArrayList<>();

        String sql = " select *\n"
                + "from tblOrder \n"
                + "where status like 'Canceled' and accountID=? ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, accID);
            rs = ps.executeQuery();

            while (rs.next()) {

                list.add(new Order(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Order> getOrderManage() {
        List<Order> list = new ArrayList<>();
        String sql = "select o.orderID, ac.accountID,o.orderDate, o.userAddress, o.totalPrice,o.orderNote,o.status\n"
                + "from ((tblOrder o inner join tblOrderDetail od on o.orderID=od.orderID)\n"
                + "inner join tblAccount ac on ac.accountID=o.accountID)";

        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                list.add(new Order(rs.getInt(1), //orderID
                        rs.getInt(2), //accountID
                        rs.getString(3), //orderDate
                        rs.getString(4).trim(),//userAddress
                        rs.getInt(5),//totalPrice
                        rs.getString(6).trim(), //orderNote
                        rs.getString(7).trim()));//status
            }
        } catch (Exception e) {
        }
        return list;
    }

    public void addNewOrder(int orderID, int accountID, String orderDate, String address, int total, String Note, String status) throws NoSuchAlgorithmException {
        String sql = "insert into tblOrder\n"
                + "values(?, ?, ?, ?, ?, ?, ?)";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, orderID);
            ps.setInt(2, accountID);
            ps.setString(3, orderDate);
            ps.setString(4, address);
            ps.setInt(5, total);
            ps.setString(6, Note);
            ps.setString(7, status);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<Order> getOrderDetailManage() {
        List<Order> list = new ArrayList<>();
        String sql = "select od.OdetailID, b.bookCode, od.oDetailQty, b.buyPrice, o.orderID\n"
                + "from ((tblOrderDetail od inner join tblOrder o on od.orderID=o.orderID)\n"
                + "inner join tblBook b on b.bookCode = od.bookCode)";

        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                list.add(new Order(rs.getInt(1), //orderID
                        rs.getLong(2), //oDetailID
                        rs.getInt(3), //bookCode
                        rs.getInt(4),//oDetailQty
                        rs.getInt(5)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public void addNewOrderDetail(int oDetailID, long bookCode, int oDetailQty, int buyPrice, int orderID) throws NoSuchAlgorithmException {

        String sql = "insert into tblOrderDetail\n"
                + "values(?, ?, ?, ?, ?)";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, oDetailID);
            ps.setLong(2, bookCode);
            ps.setInt(3, oDetailQty);
            ps.setInt(4, buyPrice);
            ps.setInt(5, orderID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<Order> getHistoryOrder() {
        List<Order> list = new ArrayList<>();
        String sql = " select b.bookCode, b.bookName, b.img, b.buyPrice, od.oDetailQty, od.buyPrice, o.orderDate, o.userAddress, o.totalPrice, o.orderNote, o.status\n"
                + "from (((tblOrder o inner join tblOrderDetail od on o.orderID = od.orderID)\n"
                + "inner join tblBook b on b.bookCode = od.bookCode)\n"
                + "inner join tblAccount ac on ac.accountID = o.accountID)";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Order(rs.getString(1),
                        rs.getString(2), 
                        rs.getInt(3), 
                        rs.getString(4),
                        rs.getString(5), 
                        rs.getInt(6),
                        rs.getLong(7),
                        rs.getInt(8),
                        rs.getInt(9),
                        rs.getString(10),
                        rs.getString(11)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    

    public static void main(String[] args) throws NoSuchAlgorithmException {
        OrderDAO odao = new OrderDAO();
//        List<Order> list=dAO.listCancelOrderByAccID(4);
//        System.out.println(list);
        System.out.println(odao.getOrderManage());
       // odao.getHistoryOrder();
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        //        LocalDateTime now = LocalDateTime.now();
        //        System.out.println(dtf.format(now));
    }
}
