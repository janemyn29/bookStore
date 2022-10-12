/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.Order;

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

                list.add(new Order(rs.getInt(1), rs.getInt(2), rs.getDate(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public static void main(String[] args) {
        OrderDAO dAO=new OrderDAO();
        List<Order> list=dAO.listCancelOrderByAccID(4);
        System.out.println(list);
    }
}
