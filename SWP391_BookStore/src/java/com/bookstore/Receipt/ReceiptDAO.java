/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.Receipt;

import com.bookstore.Utils.DBUtils;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ReceiptDAO {

    Connection conn = null;
    PreparedStatement stm = null;
    ResultSet rs = null;

    public List<Receipt> getListReceipt() {
        try {
            String query = " Select receiptID, accountID, orderDate, totalImportPrice, companyID from tblReceipt";

            conn = new DBUtils().getConnection();
            stm = conn.prepareStatement(query);
            rs = stm.executeQuery();

            List<Receipt> list = new ArrayList<>();
            while (rs.next()) {

                Receipt r = new Receipt(rs.getInt(1), rs.getInt(2), rs.getDate(3), rs.getInt(4), rs.getInt(5));
                list.add(r);
            }
            return list;
        } catch (Exception e) {

        }

        return null;
    }

   public List<Receipt> getReceiptByReceiptID(String receiptID) {
        List<Receipt> list = new ArrayList<>();
        try {
            String query = "select  r.orderDate, b.importPrice,pc.companyName,b.bookCode,rd.importQty, b.bookName, r.receiptID,b.quantity\n"
                    + "from tblBook b  inner join tblPublishCompany pc on pc.companyID=b.companyID\n"
                    + " inner join tblReceiptDetail rd on rd.bookcode = b.bookCode\n"
                    + "inner join tblReceipt r on rd.receiptID = r.receiptID\n"
                    + "where r.receiptID = ? ";

            conn = new DBUtils().getConnection();
            stm = conn.prepareStatement(query);
            stm.setString(1, receiptID);
            rs = stm.executeQuery();
            while (rs.next()) {
                list.add(new Receipt(rs.getDate(1),
                                        rs.getInt(2),
                                        rs.getString(3),
                                        rs.getLong(4),
                                        rs.getInt(5),
                                        rs.getString(6),
                                        rs.getInt(7),
                                        rs.getInt(8)));
            }

        } catch (Exception e) {

        }
        return list;

    }
    public void insertReceipt(int receiptID, int accountID, Date orderDate, int totalImportPrice, int companyID) throws SQLException {
        try {
            String query = " Insert into tblReceipt values (?, ?, ?, ?, ?)";
            conn = new DBUtils().getConnection();
            stm = conn.prepareStatement(query);
            rs = stm.executeQuery();

            stm = conn.prepareStatement(query);
            stm.setInt(1, receiptID);
            stm.setInt(2, companyID);
            stm.setDate(3, orderDate);
            stm.setInt(4, totalImportPrice);
            stm.setInt(5, companyID);
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                stm.close();
            }

        }

    }


    //dem so luong trong db
    public int getToTalReceipt() throws ClassNotFoundException, SQLException {

        try {
            String query = "select count(*) from tblReceipt";
            conn = new DBUtils().getConnection();
            stm = conn.prepareStatement(query);
            rs = stm.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {

        }

        return 0;
    }
    

    public static void main(String[] args) {
        ReceiptDAO receiptDAO = new ReceiptDAO();
        System.out.println(receiptDAO.getReceiptByReceiptID("3"));
            }
            
        
        
    
     
}
