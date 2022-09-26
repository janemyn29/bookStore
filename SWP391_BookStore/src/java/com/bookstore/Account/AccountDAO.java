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
import java.util.ArrayList;
import java.util.List;
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
                int accID = rs.getInt(1);
                String username = rs.getString(2).trim();
                String phone = rs.getString(3).trim();
                String accEmail = rs.getString(4).trim().toLowerCase();
                String userpass = rs.getString(5).trim();
                int roleId = rs.getInt(6);
                String roleName = rs.getString(7).trim();
                int actionID = rs.getInt(8);
                String actName = rs.getString(9).trim();
                return new Account(accID, username, phone, email, password, roleId, roleName, actionID, actName);
            }
        } catch (Exception e) {
        }

        return null;
    }

    public Account existMail(String tempemail) {
        String email=tempemail.toLowerCase().trim();

        String sql = " select * from tblAccount\n"
                + "where email=? ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, email);
            rs = ps.executeQuery();
            while (rs.next()) {
                int accID = rs.getInt(1);
                String username = rs.getString(2).trim();
                String phone = rs.getString(3).trim();
                String accEmail = rs.getString(4).trim().toLowerCase();
                String userpass = rs.getString(5).trim();
                int roleId = rs.getInt(6);
                int actionID = rs.getInt(7);

                return new Account(accID, username, phone, email, userpass, roleId, actionID);
            }
        } catch (Exception e) {
        }

        return null;
    }

    public Account existUsername(String username) {

        String sql = "select * from tblAccount\n"
                + "where userName=?";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while (rs.next()) {
                int accID = rs.getInt(1);
                String tempusername = rs.getString(2).trim();
                String phone = rs.getString(3).trim();
                String accEmail = rs.getString(4).trim().toLowerCase();
                String userpass = rs.getString(5).trim();
                int roleId = rs.getInt(6);
                int actionID = rs.getInt(7);

                return new Account(accID, tempusername, phone, accEmail, userpass, roleId, actionID);
            }
        } catch (Exception e) {
        }

        return null;
    }

    public List<Account> listUser() {
        List<Account> list = new ArrayList<>();
        String sql = " select * from tblAccount ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int accID = rs.getInt(1);
                String username = rs.getString(2).trim();
                String phone = rs.getString(3).trim();
                String accEmail = rs.getString(4).trim();
                String userpass = rs.getString(5).trim();
                int roleId = rs.getInt(6);
                int actionID = rs.getInt(7);
                list.add(new Account(accID, username, phone, accEmail, userpass, roleId, actionID));
            }
        } catch (Exception e) {
        }

        return list;
    }

    public void signup(String username, String phone, String email, String pass) throws NoSuchAlgorithmException {
        AccountDAO dao = new AccountDAO();
        List<Account> list = dao.listUser();
        int lastUID;
        int sizeList = list.size() - 1;
        lastUID = list.get(sizeList).getAccID() + 1;

        //dePass
        String password = pass;
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] digest = md.digest();
        String dePass = DatatypeConverter.printHexBinary(digest).toLowerCase();

        String sql = " insert into tblAccount\n"
                + "values(?,?,?,?,?,4,1) ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, lastUID);
            ps.setString(2, username);
            ps.setString(3, phone);
            ps.setString(4, email.toLowerCase());
            ps.setString(5, dePass);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public boolean resetPassword(String email, String pass) throws NoSuchAlgorithmException {
        String password = pass;
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] digest = md.digest();
        String dePass = DatatypeConverter.printHexBinary(digest).toLowerCase();
        String sql = " UPDATE tblAccount\n"
                + "set userPass=?\n"
                + "where email like ? ";
        boolean check = false;
        try {

            Connection conn = DBUtils.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(2, email);
            ps.setString(1, dePass);

            check = ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            System.out.println("Update Student error!" + ex.getMessage());
        }
        return check;
    }
    public List<Account> getListImporterAccountsByRole(String id) {
        
        List<Account> list = new ArrayList<>();
        String sql = "  select  a.accountID,a.userName,a.phoneNumber,a.email,a.userPass,a.roleID,r.roleName,a.actionID,act.actionName\n"
                + "from  ((tblAccount a inner join tblRole r on  a.roleID=r.roleID)\n"
                + "inner join tblAction act on act.actionID=a.actionID)\n"
                + "where a.roleID=?  ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                int accID = rs.getInt(1);
                String username = rs.getString(2).trim();
                String phone = rs.getString(3).trim();
                String accEmail = rs.getString(4).trim().toLowerCase();
                String userpass = rs.getString(5).trim();
                int roleId = rs.getInt(6);
                String roleName = rs.getString(7).trim();
                int actionID = rs.getInt(8);
                String actName = rs.getString(9).trim();
                list.add(new Account(accID, username, phone, accEmail, roleId, roleName, actionID, actName));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public void addNewAccount(String username, String phone, String email,String rid) throws NoSuchAlgorithmException {
        AccountDAO dao = new AccountDAO();
        List<Account> list = dao.listUser();
        int lastUID;
        int sizeList = list.size() - 1;
        lastUID = list.get(sizeList).getAccID() + 1;

        //dePass
        String pass="000000";
        String password = pass;
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] digest = md.digest();
        String dePass = DatatypeConverter.printHexBinary(digest).toLowerCase();

        String sql = " insert into tblAccount\n"
                + "values(?,?,?,?,?,?,1) ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, lastUID);
            ps.setString(2, username);
            ps.setString(3, phone);
            ps.setString(4, email.toLowerCase());
            ps.setString(5, dePass);
            ps.setString(6, rid);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }
    

    public static void main(String[] args) throws NoSuchAlgorithmException {
        AccountDAO dao = new AccountDAO();
        dao.addNewAccount("home", "0371423776", "home@gmail.com", "2");



    }
}
