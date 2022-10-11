/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.Account;

import com.bookstore.Utils.DBUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author tramy
 */
public class AccountDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public Account login(String email, String pass) throws NoSuchAlgorithmException {
        //dePass
        String password = pass;
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] digest = md.digest();
        String dePass = DatatypeConverter.printHexBinary(digest).toLowerCase();

        String sql = " select  a.accountID,a.userName,a.phoneNumber,a.email,a.userPass,a.roleID,r.roleName,a.actionID,act.actionName\n"
                + "from  ((tblAccount a inner join tblRole r on  a.roleID=r.roleID)\n"
                + "inner join tblAction act on act.actionID=a.actionID)\n"
                + "where a.email = ? and a.userPass= ? ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, dePass);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getInt(8),
                        rs.getString(9));
            }
        } catch (Exception e) {
        }

        return null;
    }
    public boolean updatePasswordImporter(String pass, int accID) throws SQLException, NoSuchAlgorithmException {
        String password = pass;
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] digest = md.digest();
        String dePass = DatatypeConverter.printHexBinary(digest).toLowerCase();
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "Update tblAccount Set userPass = ? where accountID= ?";
                ps = conn.prepareStatement(sql);
                ps.setString(1, dePass);
                ps.setInt(2, accID);

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
    public boolean updateAccountImporter(String username, String email, String phone, int accID) throws SQLException {
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "Update tblAccount Set userName = ?, email = ?, phoneNumber = ? where accountID= ?";
                ps = conn.prepareStatement(sql);
                ps.setString(1, username);
                ps.setString(2, email);
                ps.setString(3, phone);
                ps.setInt(4, accID);

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

    public Account existUsernameImporter(String username) {

        String sql = " select * from tblAccount\n"
                + "where userName=? ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while (rs.next()) {
                int accID = rs.getInt(1);
                String tempusername = rs.getString(2).trim();
                String tempPhone = rs.getString(3).trim();
                String accEmail = rs.getString(4).trim().toLowerCase();
                String userpass = rs.getString(5).trim();
                int roleId = rs.getInt(6);
                int actionID = rs.getInt(7);

                return new Account(accID, tempusername, tempPhone, accEmail, userpass, roleId, actionID);
            }
        } catch (Exception e) {
        }

        return null;
    }

    public Account existMailImporter(String tempemail) {
        String email = tempemail.toLowerCase().trim();

        String sql = " select * from tblAccount\n"
                + "where email=? ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, email);
            rs = ps.executeQuery();
            while (rs.next()) {
                int accID = rs.getInt(1);
                String tempusername = rs.getString(2).trim();
                String tempPhone = rs.getString(3).trim();
                String accEmail = rs.getString(4).trim().toLowerCase();
                String userpass = rs.getString(5).trim();
                int roleId = rs.getInt(6);
                int actionID = rs.getInt(7);

                return new Account(accID, tempusername, tempPhone, accEmail, userpass, roleId, actionID);
            }
        } catch (Exception e) {
        }

        return null;
    }

    public Account existPhoneNumberImporter(String phone) {

        String sql = " select * from tblAccount\n"
                + "where phoneNumber=? ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, phone);
            rs = ps.executeQuery();
            while (rs.next()) {
                int accID = rs.getInt(1);
                String tempusername = rs.getString(2).trim();
                String tempPhone = rs.getString(3).trim();
                String accEmail = rs.getString(4).trim().toLowerCase();
                String userpass = rs.getString(5).trim();
                int roleId = rs.getInt(6);
                int actionID = rs.getInt(7);

                return new Account(accID, tempusername, tempPhone, accEmail, userpass, roleId, actionID);
            }
        } catch (Exception e) {
        }

        return null;
    }
    public static void main(String[] args) throws NoSuchAlgorithmException {
        AccountDAO dAO= new AccountDAO();
        Account account= dAO.login("chinh@gmail.com", "123456");
        System.out.println(account);
    }

    

  
}
