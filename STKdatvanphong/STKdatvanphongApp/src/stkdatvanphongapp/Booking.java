/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stkdatvanphongapp;

import java.sql.Date;

public class Booking {
    private int bookingId;
    private int roomId;
    private int userId;
    private String status; // "pending", "confirmed", ...
    private Date checkIn;
    private Date checkOut;

    public Booking(int bookingId, int roomId, int userId, String status, Date checkIn, Date checkOut) {
        this.bookingId = bookingId;
        this.roomId = roomId;
        this.userId = userId;
        this.status = status;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public int getBookingId() { return bookingId; }
    public int getRoomId() { return roomId; }
    public int getUserId() { return userId; }
    public String getStatus() { return status; }
    public Date getCheckIn() { return checkIn; }
    public Date getCheckOut() { return checkOut; }
}