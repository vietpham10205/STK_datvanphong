/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stkdatvanphongapp;

/**
 *
 * @author admin
 */

public class Room {
    private String roomName;
    private double area;
    private double pricePerDay;
    private int roomId;

    public Room(int roomId, String roomName, double area, double pricePerDay) {
    this.roomId = roomId;
    this.roomName = roomName;
    this.area = area;
    this.pricePerDay = pricePerDay;
}

    // Getters
    public String getRoomName() {
        return roomName;
    }

    public double getArea() {
        return area;
    }
    
  
public int getRoomId() {
    return roomId;
}


    public double getPricePerDay() {
        return pricePerDay;
    }

    
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    @Override
    public String toString() {
        return "Room{" +
               "roomName='" + roomName + '\'' +
               ", area=" + area +
               ", pricePerDay=" + pricePerDay +
               '}';
    }
}