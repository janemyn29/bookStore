/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.Discount;

import com.bookstore.Utils.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.apache.tomcat.jni.Time;

/**
 *
 * @author tramy
 */
public class DiscountDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Discount> getDiscountByBookCode(String bookcode) {
        String code = String.valueOf(bookcode);
        List<Discount> list = new ArrayList<>();
        String sql = " select * from tblDiscount\n"
                + "where bookCode=? and (select Getdate()) between startDate and endDate ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, code);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Discount(rs.getInt(1), rs.getLong(2), rs.getDate(3), rs.getDate(4), rs.getInt(5)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public static void main(String[] args) {
        DiscountDAO dAO = new DiscountDAO();
        List<Discount> list = dAO.getDiscountByBookCode("8935244867312");
        System.out.println(list);

    }
}
