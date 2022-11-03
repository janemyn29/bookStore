/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.Order;

import com.bookstore.Book.Book;
import com.bookstore.Book.BookDAO;
import com.bookstore.OrderDetail.OrderDetail;
import com.bookstore.OrderDetail.OrderDetailDAO;
import com.bookstore.Utils.DBUtils;
import java.security.NoSuchAlgorithmException;
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
public class OrderDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Order> listOrder() {
        List<Order> list = new ArrayList<>();

        String sql = " select o.orderID, o.accountID,o.orderDate,o.userAddress,o.totalPrice,o.orderNote,o.status,a.userName,a.email,a.phoneNumber\n"
                + "from [dbo].[tblOrder] o inner join [dbo].[tblAccount] a on  o.accountID=a.accountID ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                //int orderID, int accountID, Date orderDate, String address, int total, String Note, String status, String accName, String email, String phone
                list.add(new Order(rs.getInt(1), rs.getInt(2), rs.getDate(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Order> listCancelOrderByAccID(int accID) {
        List<Order> list = new ArrayList<>();

        String sql = " select *\n"
                + "from tblOrder \n"
                + "where status like 'canceled' and accountID=? ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, accID);
            rs = ps.executeQuery();
            

            while (rs.next()) {

                list.add(new Order(rs.getInt(1), rs.getInt(2), rs.getDate(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Order getOrderByID(String id) {
        String sql = " select o.orderID, o.accountID,o.orderDate,o.userAddress,o.totalPrice,o.orderNote,o.status,a.userName,a.email,a.phoneNumber\n"
                + "from [dbo].[tblOrder] o inner join [dbo].[tblAccount] a on  o.accountID=a.accountID\n"
                + "where o.orderID=? ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                return new Order(rs.getInt(1), rs.getInt(2), rs.getDate(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public boolean updateOrderStatusNormal(String orderid, String check) throws SQLException {
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = " update [dbo].[tblOrder]\n"
                        + "set [status]=?\n"
                        + "where [orderID] = ? ";
                ps = conn.prepareStatement(sql);
                ps.setString(1, check);
                ps.setString(2, orderid);
                int row = ps.executeUpdate();

                if (row > 0) {
                    return true;
                }
            }
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return false;
    }

    public boolean updateOrderStatusAndMinusQty(String orderid, String check) throws SQLException {
        
        try {
            OrderDetailDAO dAO = new OrderDetailDAO();
            List<OrderDetail> list = dAO.getListDetailByOrder(orderid);
            for (OrderDetail orderDetail : list) {
                String code = String.valueOf(orderDetail.getBookcode());
                BookDAO bDao = new BookDAO();
                Book book = bDao.getBookBybookCode(code);
                int qty=book.getQty()- orderDetail.getQuantity();
                
                OrderDAO orderDAO= new OrderDAO();
                orderDAO.updateQtyBook(code, qty);
            }
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = " update [dbo].[tblOrder]\n"
                        + "set [status]=?\n"
                        + "where [orderID] = ? ";
                ps = conn.prepareStatement(sql);
                ps.setString(1, check);
                ps.setString(2, orderid);
                int row = ps.executeUpdate();

                if (row > 0) {
                    return true;
                }
            }
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return false;
    }
    public boolean updateOrderStatusAndAddQty(String orderid, String check) throws SQLException {
        
        try {
            OrderDetailDAO dAO = new OrderDetailDAO();
            List<OrderDetail> list = dAO.getListDetailByOrder(orderid);
            for (OrderDetail orderDetail : list) {
                String code = String.valueOf(orderDetail.getBookcode());
                BookDAO bDao = new BookDAO();
                Book book = bDao.getBookBybookCode(code);
                int qty=book.getQty()+ orderDetail.getQuantity();
                
                OrderDAO orderDAO= new OrderDAO();
                orderDAO.updateQtyBook(code, qty);
            }
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = " update [dbo].[tblOrder]\n"
                        + "set [status]=?\n"
                        + "where [orderID] = ? ";
                ps = conn.prepareStatement(sql);
                ps.setString(1, check);
                ps.setString(2, orderid);
                int row = ps.executeUpdate();

                if (row > 0) {
                    return true;
                }
            }
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return false;
    }

    public boolean updateQtyBook(String detailID, int qty) throws SQLException {
        try {

            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = " update [dbo].[tblBook]\n"
                        + "set [quantity]= ?\n"
                        + "where [bookCode]=? ";
                ps = conn.prepareStatement(sql);
                ps.setInt(1, qty);
                ps.setString(2, detailID);
                int row = ps.executeUpdate();

                if (row > 0) {
                    return true;
                }
            }
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return false;
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
                        rs.getDate(3), //orderDate
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



    public static void main(String[] args) {
        OrderDAO dAO = new OrderDAO();
        Order list = dAO.getOrderByID("1");
        System.out.println(list);
    }
}
