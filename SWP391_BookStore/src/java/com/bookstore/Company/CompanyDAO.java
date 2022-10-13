/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.Company;

import com.bookstore.Receipt.Receipt;
import com.bookstore.Receipt.ReceiptDAO;
import com.bookstore.Utils.DBUtils;
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
public class CompanyDAO {

    Connection conn = null;
    PreparedStatement stm = null;
    ResultSet rs = null;

    public List<Company> getListPublishCompany() {
        try {
            String query = "  Select companyID, companyName from tblPublishCompany";

            conn = new DBUtils().getConnection();
            stm = conn.prepareStatement(query);
            rs = stm.executeQuery();

            List<Company> list = new ArrayList<>();
            while (rs.next()) {

                Company c = new Company(rs.getInt(1), rs.getString(2));
                list.add(c);
            }
            return list;
        } catch (Exception e) {

        }

        return null;
    }

    public void insertCompany(int companyID, String companyName) throws SQLException {

        CompanyDAO dao = new CompanyDAO();

        List<Company> list = dao.getListPublishCompany();
        int lastCID;
        int sizeList = list.size() - 1;
        lastCID = list.get(sizeList).getCompanyID() + 1;
        String query = " Insert into tblPublishCompany values(?,?)";
        try {
            conn = new DBUtils().getConnection();
            stm = conn.prepareStatement(query);
            stm.setInt(1, lastCID);
            stm.setString(2, companyName);
            stm.executeUpdate();

        } catch (Exception e) {

        }
    }

    public Company extistCompanyName(String companyName) {
        try {
            String query = " Select * from tblPublishCompany where companyName =? ";

            conn = new DBUtils().getConnection();
            stm = conn.prepareStatement(query);
            stm.setString(1, companyName);
            rs = stm.executeQuery();
            while (rs.next()) {
                int companyID = rs.getInt(1);
                return new Company(companyID, companyName);
            }

        } catch (Exception e) {

        }
        return null;
    }
    

    public static void main(String[] args) throws SQLException {
        CompanyDAO dao = new CompanyDAO();

//        List<Company> list = dao.getListPublishCompany();
//        for (Company c : list) {
//            System.out.println("CompanyID: " + c.getCompanyID() + "CompanyName: " + c.getCompanyName());
//        }
        //dao.insertCompany(39, "HIHIHI");
        System.out.println(dao.extistCompanyName("National Geographic Learning"));

    }
}
