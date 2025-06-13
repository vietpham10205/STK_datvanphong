/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stkdatvanphongapp;

import javax.swing.*;
import java.awt.*;

public class RoomCard extends JPanel {
    public RoomCard(Room room) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        setPreferredSize(new Dimension(220, 180));
        setBackground(Color.WHITE);

        JLabel nameLabel = new JLabel("Phòng: " + room.getRoomName());
        nameLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(nameLabel);

        JLabel areaLabel = new JLabel("Diện tích: " + room.getArea() + " m²");
        add(areaLabel);

        JLabel priceLabel = new JLabel("Giá/ngày: " + String.format("%,.0f", room.getPricePerDay()) + " VND");
        priceLabel.setForeground(new Color(0, 102, 204));
        add(priceLabel);

        JButton detailButton = new JButton("Chi tiết");
        detailButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this,
                "Tên: " + room.getRoomName() + "\n" +
                "Diện tích: " + room.getArea() + " m²\n" +
                "Giá: " + String.format("%,.0f", room.getPricePerDay()) + " VND/ngày",
                "Chi tiết phòng", JOptionPane.INFORMATION_MESSAGE);
        });
        add(detailButton);
    }
}