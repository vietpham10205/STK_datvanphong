/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stkdatvanphongapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RoomDAO {

    public List<Room> getAllRooms() {
        List<Room> rooms = new ArrayList<>();
        
        String sql = "SELECT ROOM_NAME, AREA, PRICE_PER_DAY FROM ROOMS";

        try (Connection conn = OracleConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                String roomName = rs.getString("ROOM_NAME");
                double area = rs.getDouble("AREA");
                double pricePerDay = rs.getDouble("PRICE_PER_DAY");
                rooms.add(new Room(roomName, area, pricePerDay));
            }
        } catch (SQLException e) {
            System.err.println("Lỗi khi lấy danh sách phòng từ cơ sở dữ liệu: " + e.getMessage());
            e.printStackTrace();
        }
        return rooms;
    }

  
}

//////////List<Room> rooms = new RoomDAO().getAllRooms();
//////LẤY DANH SÁCH PHÒNG GỌI