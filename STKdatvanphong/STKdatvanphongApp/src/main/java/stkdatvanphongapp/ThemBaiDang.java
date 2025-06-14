/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package stkdatvanphongapp;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
/**
 *
 * @author capta
 */
public class ThemBaiDang extends javax.swing.JPanel {
    private List<Integer> packageIDs;
    /**
     * Creates new form ThemBaiDang
     */
    public ThemBaiDang() {
        
        initComponents();
                // Load gói áp dụng vào combobox
        GoiCombo.removeAllItems();
        // packageIds.clear();
        List<Integer> packageIds = new ArrayList<>();
        String sql = "SELECT package_id from user_packages where user_id=? and end_date>sysdate and is_active='Y'";

        try {
            java.sql.Connection con = OracleConnection.getConnection();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            System.out.println("CurrentUser.id: " + CurrentUser.id);
            pst.setInt(1, CurrentUser.id); // Giả sử CurrentUser.id là ID của người dùng hiện tại
            java.sql.ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int packageid=rs.getInt("PACKAGE_ID");
                String pac_name="Select package_name from packages where package_id=?";
                pst = con.prepareStatement(pac_name);
                pst.setInt(1,packageid);
                ResultSet rs2=pst.executeQuery();
                while(rs2.next())
                {
                    String packageName=rs2.getString("PACKAGE_NAME");
                   GoiCombo.addItem(packageName);
                }
                rs2.close();
                packageIds.add(packageid);
            }
            rs.close();
            pst.close();
            con.close();
            this.packageIDs = packageIds; // Lưu lại danh sách packageIds để sử dụng sau này
            
        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Lỗi khi tải gói áp dụng: " + e.getMessage(), "Lỗi", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DangKiButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        GoiCombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        TitleText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ContentText = new javax.swing.JTextArea();

        DangKiButton.setBackground(new java.awt.Color(51, 51, 51));
        DangKiButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DangKiButton.setForeground(new java.awt.Color(255, 255, 255));
        DangKiButton.setText("Đăng Kí");
        DangKiButton.setBorder(null);
        DangKiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DangKiButtonActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Gói Áp Dụng");

        GoiCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        GoiCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoiComboActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tiêu đề bài đăng");

        TitleText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleTextActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nội dung bài đăng");

        ContentText.setColumns(20);
        ContentText.setRows(5);
        jScrollPane1.setViewportView(ContentText);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(364, 364, 364)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(GoiCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(TitleText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GoiCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TitleTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleTextActionPerformed
        // TODO add your handling code here:
        String title = TitleText.getText();
        if (checkAndFocus(title, "Vui lòng nhập Tiêu đề cho bài đăng.")) {
            GoiCombo.requestFocus();
            GoiCombo.showPopup();
        }
    }//GEN-LAST:event_TitleTextActionPerformed

    private void DangKiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DangKiButtonActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_DangKiButtonActionPerformed

    private void GoiComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoiComboActionPerformed
        // TODO add your handling code here:
        GoiCombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                GoiCombo.showPopup();
            }
        });
        GoiCombo.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    ContentText.requestFocusInWindow(); // chuyển focus khi Enter
                }
            }
        });
    }//GEN-LAST:event_GoiComboActionPerformed
public boolean checkAndFocus(String value, String message) {
    if (value == null || value.trim().isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, message, "Cảnh báo", javax.swing.JOptionPane.WARNING_MESSAGE);
        return false;
    } else {
        return true;
    }
}
    
    public void focusthembd()
    {
        this.TitleText.requestFocusInWindow();
    }
    public void Xulythongtinbaidang() {
        java.sql.Connection con = null;
        java.sql.PreparedStatement pst = null;
        java.sql.ResultSet rs = null;
        try {
            con = OracleConnection.getConnection();
            con.setAutoCommit(false); // Bắt đầu transaction

            // 1. Insert location mới
            String insertLocation = "INSERT INTO LOCATIONS (location_name, address) VALUES (?, ?)";
            pst = con.prepareStatement(insertLocation);
            pst.setString(1, PhongTam.getLocationName()); // hoặc tên địa điểm, tuỳ logic
            pst.setString(2, PhongTam.getDiaChi());
            pst.executeUpdate();
            pst.close();

            // 2. Lấy location_id vừa tạo
            String getLocationId = "SELECT location_id FROM LOCATIONS WHERE location_name = ? AND address = ? ORDER BY location_id DESC FETCH FIRST 1 ROWS ONLY";
            pst = con.prepareStatement(getLocationId);
            pst.setString(1, PhongTam.getLocationName());
            pst.setString(2, PhongTam.getDiaChi());
            rs = pst.executeQuery();
            int locationId = -1;
            if (rs.next()) {
                locationId = rs.getInt("location_id");
            } else {
                throw new Exception("Không lấy được location_id!");
            }
            rs.close();
            pst.close();

            // 3. Insert room mới với location_id vừa lấy
            String insertRoom = "INSERT INTO ROOMS (room_name, description, price_per_day, area, capacity, room_type_id, location_id) VALUES (?, ?, ?, ?, ?, ?, ?)";
            pst = con.prepareStatement(insertRoom, new String[]{"room_id"});
            pst.setString(1, PhongTam.getTenPhong());
            pst.setString(2, PhongTam.getMoTa());
            pst.setDouble(3, PhongTam.getGia());
            pst.setDouble(4, PhongTam.getDienTich());
            pst.setInt(5, PhongTam.getSucChua());
            pst.setInt(6, PhongTam.getRoomTypeId());
            pst.setInt(7, locationId);
            pst.executeUpdate();
            // 4. Lấy room_id vừa tạo
            String getRoomId = "SELECT room_id FROM ROOMS WHERE room_name = ? AND location_id = ? ORDER BY room_id DESC FETCH FIRST 1 ROWS ONLY";
            pst.close();
            pst = con.prepareStatement(getRoomId);
            pst.setString(1, PhongTam.getTenPhong());
            pst.setInt(2, locationId);
            rs = pst.executeQuery();
            int roomId = -1;
            if (rs.next()) {
                roomId = rs.getInt("room_id");
            } else {
                throw new Exception("Không lấy được room_id!");
            }
            rs.close();
            pst.close();

            // 5. Insert post mới
            String insertPost = "INSERT INTO POSTS (user_id, room_id, package_id, title, content) VALUES (?, ?, ?, ?, ?)";
            pst = con.prepareStatement(insertPost);
            pst.setInt(1, CurrentUser.id); // Đảm bảo CurrentUser.id đã được set
            pst.setInt(2, roomId);
            pst.setInt(3, packageIDs.get(GoiCombo.getSelectedIndex())); // package_id, tuỳ logic mapping combobox
            pst.setString(4, TitleText.getText()); // title
            pst.setString(5, ContentText.getText()); // content
            pst.executeUpdate();
            pst.close();

            con.commit();
            javax.swing.JOptionPane.showMessageDialog(null, "Bài đăng đã được thêm thành công!", "Thành công", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            // Reset form sau khi đăng thành công
        } catch (Exception e) {
            try { if (con != null) con.rollback(); } catch (Exception ex) {}
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(null, "Lỗi khi đăng bài: " + e.getMessage(), "Lỗi", javax.swing.JOptionPane.ERROR_MESSAGE);
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception ex) {}
            try { if (pst != null) pst.close(); } catch (Exception ex) {}
            try { if (con != null) con.close(); } catch (Exception ex) {}
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ContentText;
    private javax.swing.JButton DangKiButton;
    private javax.swing.JComboBox<String> GoiCombo;
    private javax.swing.JTextField TitleText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
