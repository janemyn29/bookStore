/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.Order;

import com.bookstore.Account.Account;
import com.bookstore.Book.Book;
import com.bookstore.Book.BookDAO;
import com.bookstore.OrderDetail.OrderDetail;
import com.bookstore.OrderDetail.OrderDetailDAO;
import com.bookstore.Utils.DBUtils;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.Date;
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
                int qty = book.getQty() - orderDetail.getQuantity();

                OrderDAO orderDAO = new OrderDAO();
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
                int qty = book.getQty() + orderDetail.getQuantity();

                OrderDAO orderDAO = new OrderDAO();
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
        String sql = " select o.orderID, ac.accountID, o.orderDate, o.userAddress, o.totalPrice, o.orderNote, o.status\n"
                + "from ((tblOrder o inner join tblOrderDetail od on o.orderID=od.orderID)\n"
                + "inner join tblAccount ac on ac.accountID=o.accountID) ";

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
        String sql = " insert into tblOrder(orderID, accountID, orderDate, userAddress, totalPrice, orderNote, status)\n"
                + "values(?, ?, ?, ?, ?, ?, ?) ";
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
        String sql = " select od.OdetailID, b.bookCode, od.oDetailQty, b.buyPrice, o.orderID, od.status\n"
                + "from ((tblOrderDetail od inner join tblOrder o on od.orderID=o.orderID)\n"
                + "inner join tblBook b on b.bookCode = od.bookCode) ";

        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                list.add(new Order(rs.getInt(1), //orderID
                        rs.getLong(2), //oDetailID
                        rs.getInt(3), //bookCode
                        rs.getInt(4),//oDetailQty
                        rs.getInt(5),
                        rs.getString(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public void addNewOrderDetail(int oDetailID, long bookCode, int oDetailQty, int buyPrice, int orderID, String status) throws NoSuchAlgorithmException {

        String sql = "insert into tblOrderDetail\n"
                + "values(?, ?, ?, ?, ?, ?)";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, oDetailID);
            ps.setLong(2, bookCode);
            ps.setInt(3, oDetailQty);
            ps.setInt(4, buyPrice);
            ps.setInt(5, orderID);
            ps.setString(6, status);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<Order> getOrderListByStatus(int accountID) {
        List<Order> list = new ArrayList<>();
        String sql = " select orderID, orderDate, userAddress, status\n"
                + "from tblOrder\n"
                + "where (status = 'confirming' or status = 'delivering') and accountID = ? ";

        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, accountID);
            rs = ps.executeQuery();

            while (rs.next()) {

                list.add(new Order(rs.getInt(1), //orderID
                        rs.getDate(2), //orderDate
                        rs.getString(3).trim(), //address
                        rs.getString(4).trim()));//status
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Order> getOrderListByStatus2(int accountID) {
        List<Order> list = new ArrayList<>();
        String sql = " select orderID, orderDate, userAddress, status\n"
                + "from tblOrder\n"
                + "where (status = 'recieved' or status = 'canceled') and accountID = ? ";

        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, accountID);
            rs = ps.executeQuery();

            while (rs.next()) {

                list.add(new Order(rs.getInt(1), //orderID
                        rs.getDate(2), //orderDate
                        rs.getString(3).trim(),//userAddress
                        rs.getString(4).trim()));//status
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Order> getOrderListByStatus3(int accountID) {
        List<Order> list = new ArrayList<>();
        String sql = " select orderID, orderDate, userAddress, status\n"
                + "from tblOrder\n"
                + "where (status = 'expired' or status = 'wait to approve') and accountID = ? ";

        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, accountID);
            rs = ps.executeQuery();

            while (rs.next()) {

                list.add(new Order(rs.getInt(1), //orderID
                        rs.getDate(2), //orderDate
                        rs.getString(3).trim(),//userAddress
                        rs.getString(4).trim()));//status
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Order> getOrderDetailByorderID(int orderID) {
        List<Order> list = new ArrayList<>();
        String sql = " select o.totalPrice, o.orderNote, od.oDetailQty, od.price, b.bookName, b.bookCode, o.orderID, od.OdetailID\n"
                + "from ((tblOrderDetail od inner join tblBook b on od.bookcode = b.bookCode)\n"
                + "inner join tblOrder o on o.orderID = od.orderID)\n"
                + "where o.orderID = ? ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, orderID);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Order(rs.getInt(1),
                        rs.getString(2).trim(),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getString(5).trim(),
                        rs.getLong(6),
                        rs.getInt(7),
                        rs.getInt(8)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public void updateNoteByOrderID(String Note, int orderID) {

        String sql = " update tblOrder\n"
                + "set orderNote = ?\n"
                + "where orderID = ? and status ='confirming' ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, Note);
            ps.setInt(2, orderID);
            rs = ps.executeQuery();

        } catch (Exception e) {
        }
    }

    public void updateOrderStatusByID(int orderID) {

        String sql = " update tblOrder\n"
                + "set status = 'canceled'\n"
                + "where orderID = ? ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, orderID);
            rs = ps.executeQuery();

        } catch (Exception e) {
        }
    }

    public void updateOrderStatusByID2(int orderID) {

        String sql = " update tblOrder\n"
                + "set status = 'wait to approve'\n"
                + "where orderID = ? ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, orderID);
            rs = ps.executeQuery();

        } catch (Exception e) {
        }
    }

    public String checkOrderStatus(int orderID) {

        String sql = " select status\n"
                + "from tblOrder\n"
                + "where orderID = ? ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, orderID);
            rs = ps.executeQuery();
            while (rs.next()) {
                String status = rs.getString(1);

                return status;
            }
        } catch (Exception e) {
        }

        return null;
    }

    public List<Order> getListOrderDetailByOrderID(int orderID) {
        List<Order> list = new ArrayList<>();
        String sql = " select oDetailQty, bookcode\n"
                + "from tblOrderDetail\n"
                + "where orderID = ? ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, orderID);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Order(rs.getInt(1),
                        rs.getLong(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Order> getOrderByOrderIDAndAccountID(int orderID, int accountID) {
        List<Order> list = new ArrayList<>();
        String sql = " select orderID, orderDate, userAddress, status\n"
                + "from tblOrder\n"
                + "where orderID = ? and accountID = ? ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, orderID);
            ps.setInt(2, accountID);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Order(rs.getInt(1),
                        rs.getDate(2),
                        rs.getString(3),
                        rs.getString(4)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public void updateOrderStatusByIDConfirm(String receivedDate, int orderID) {

        String sql = " update tblOrder\n"
                + "set status = 'recieved', receivedDate = ?\n"
                + "where orderID = ? ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, receivedDate);
            ps.setInt(2, orderID);
            rs = ps.executeQuery();

        } catch (Exception e) {
        }
    }

    public void updateOrderStatusByIDUpgrade(String requestDate, String returnReason, int orderID) {

        String sql = " update tblOrder\n"
                + "set status = 'wait to approve', requestDate = ? , returnReason = ?\n"
                + "where orderID = ? ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, requestDate);
            ps.setString(2, returnReason);
            ps.setInt(3, orderID);
            rs = ps.executeQuery();

        } catch (Exception e) {
        }
    }

    public String checkRecievedDateByOrderID(int orderID) {

        String sql = " select receivedDate\n"
                + "from tblOrder\n"
                + "where orderID = ? ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, orderID);
            rs = ps.executeQuery();
            while (rs.next()) {
                String receivedDate = rs.getString(1);

                return receivedDate;
            }
        } catch (Exception e) {
        }

        return null;
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        OrderDAO dAO = new OrderDAO();
        //Order list = dAO.getOrderByID("1");

//        dAO.addNewOrder(14, 4, "2022-11-07", "test quantity 2", 150000, "test quantity 2", "confirming");
        System.out.println(dAO.getOrderListByStatus2(4));
//dAO.addNewOrder(15, 4, "2022-11-07", "test", 45000, "test2", "confirming");

    }
}
