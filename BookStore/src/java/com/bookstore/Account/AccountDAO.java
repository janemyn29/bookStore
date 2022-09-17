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
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author tramy
 */
public class AccountDAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public Account login(String user, String pass) throws NoSuchAlgorithmException {
        //dePass
        String password = pass;
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] digest = md.digest();
        String dePass = DatatypeConverter.printHexBinary(digest).toLowerCase();

        String sql = "  ";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, dePass);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(0, user, pass, sql, password, 0, dePass, 0, dePass);
            }
        } catch (Exception e) {
        }

        return null;
    }
}
