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
import java.util.ArrayList;
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

    
    public boolean updateAccountDetails(Account acc){
        boolean f = false;
        try{
            conn = new DBUtils().getConnection();
            String sql="update tblAccount set userName =? , userPass=? " 
                    + "where email =?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, acc.getUsername());
            ps.setString(2, acc.getEmail());
            ps.setString(3, acc.getPassword());
            ps.executeUpdate();
            f =true;
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }
    
    

    public static void main(String[] args) throws NoSuchAlgorithmException {
        AccountDAO dAO = new AccountDAO();
        Account account = dAO.login("loan@gmail.com", "123456");
        System.out.println(account);
    }
}
