/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.Receipt;

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
public class ReceiptDetailDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<ReceiptDetail> getListRDetailByRID(String id) {
        List<ReceiptDetail> list = new ArrayList<>();
        String sql = " select d.RdetailID , d.bookcode , b.bookName , d.importQty , d.importPrice\n"
                + "from tblReceiptDetail d inner join tblBook b on d.bookcode=b.bookCode\n"
                + "where d.receiptID= ? ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {

                list.add(new ReceiptDetail(rs.getInt(1),
                        rs.getLong(2), rs.getString(3), rs.getInt(4), rs.getInt(4)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public static void main(String[] args) {
        ReceiptDetailDAO dao = new ReceiptDetailDAO();
        List<ReceiptDetail> list =dao.getListRDetailByRID("1");
        System.out.println(list);
    }
}
