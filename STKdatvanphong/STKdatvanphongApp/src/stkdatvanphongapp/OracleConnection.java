package stkdatvanphongapp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
/**
 *
 * @author admin
 */
public class OracleConnection {
    
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:oracle:thin:@//localhost:1521/WEEK5PDB"; 
        String username = "week5"; 
        String password = "userpass"; 
        return DriverManager.getConnection(url, username, password);
    }
}
