/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stkdatvanphongapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author capta
 */
public class Controller {
    public int CheckLogin(String email, String pass)
    {
        
    try (Connection conn = OracleConnection.getConnection()) {
        String sql = "SELECT USER_ID, EMAIL, USERNAME, ROLE FROM USERS WHERE EMAIL = ? AND PASSWORD = ?";

        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, email);
        ps.setString(2, pass);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {  
                //////////// lưu thông tin user hiện tại
    CurrentUser.id = rs.getInt("USER_ID");
    CurrentUser.email = rs.getString("EMAIL");
    CurrentUser.username = rs.getString("USERNAME");
    CurrentUser.role = rs.getString("ROLE");
    // xử lý chuyển màn hình như trước.
    String role = rs.getString("ROLE");
            if ("Người thuê".equalsIgnoreCase(role)) {
                return 1;
            } else if ("Banned".equalsIgnoreCase(role)) {
                return 2;
            } else {
                return 3;
            }
        } else {
            return 0;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
        System.out.println("Lỗi kết nối hoặc truy vấn CSDL: " + ex.getMessage());
        return -1;
    }
    }
}
