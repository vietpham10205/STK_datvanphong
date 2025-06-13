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

/**
 *
 * @author admin
 */
public class BookingDAO {
    public List<Booking> getBookingsByRoomId(int roomId) {
    List<Booking> bookings = new ArrayList<>();
    String sql = "SELECT * FROM BOOKINGS WHERE room_id = ?";
    try (Connection conn = OracleConnection.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setInt(1, roomId);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            bookings.add(new Booking(
                rs.getInt("booking_id"),
                rs.getInt("room_id"),
                rs.getInt("user_id"),
                rs.getString("booking_status"),
                rs.getDate("check_in_date"),    // Sửa ở đây
                rs.getDate("check_out_date")    // Sửa ở đây
            ));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return bookings;
}
public Booking getLatestBookingByRoomId(int roomId) {
    String sql = "SELECT * FROM BOOKINGS WHERE ROOM_ID = ? AND (BOOKING_STATUS = 'Chờ xác nhận' OR (BOOKING_STATUS = 'Đã xác nhận' AND CHECK_OUT_DATE >= SYSDATE)) ORDER BY BOOKING_STATUS DESC, BOOKING_ID DESC FETCH FIRST 1 ROWS ONLY";
    try (Connection conn = OracleConnection.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setInt(1, roomId);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            int bookingId = rs.getInt("BOOKING_ID");
            int userId = rs.getInt("USER_ID");
            String status = rs.getString("BOOKING_STATUS");
            java.sql.Date checkIn = rs.getDate("CHECK_IN_DATE");    // Sửa ở đây
            java.sql.Date checkOut = rs.getDate("CHECK_OUT_DATE");  // Sửa ở đây
            return new Booking(bookingId, roomId, userId, status, checkIn, checkOut);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
public Booking getActiveOrPendingBookingByRoomId(int roomId) {
    String sql = "SELECT * FROM BOOKINGS WHERE ROOM_ID = ? AND (BOOKING_STATUS = 'Chờ xác nhận' OR (BOOKING_STATUS = 'Đã xác nhận' AND CHECK_OUT_DATE >= SYSDATE)) ORDER BY BOOKING_STATUS DESC, BOOKING_ID DESC FETCH FIRST 1 ROWS ONLY";
    try (Connection conn = OracleConnection.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setInt(1, roomId);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            int bookingId = rs.getInt("BOOKING_ID");
            int userId = rs.getInt("USER_ID");
            String status = rs.getString("BOOKING_STATUS");
            java.sql.Date checkIn = rs.getDate("CHECK_IN_DATE");    // Sửa ở đây
            java.sql.Date checkOut = rs.getDate("CHECK_OUT_DATE");  // Sửa ở đây
            return new Booking(bookingId, roomId, userId, status, checkIn, checkOut);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
}
