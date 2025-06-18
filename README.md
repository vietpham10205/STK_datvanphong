# STK_datvanphong

## 🚧 STILL THINKING

### 📌 Tên chung
**Quản lí hệ thống đặt phòng dịch vụ cho doanh nghiệp (STKdatvanphong)**

---

## 🛠️ Chức năng chính

### 1. Quản lí đặt phòng
- Quản lý danh sách phòng: loại phòng, tình trạng phòng (còn trống, đã đặt, đang sử dụng, bảo trì).

### 2. Xác minh, phân quyền và quản lý người dùng
- Các đối tượng: 
  - Người đặt phòng
  - Người cho thuê phòng
  - Admin

### 3. Dịch vụ thông báo (Notification Service)
- Gửi email/SMS xác nhận đặt phòng.
- Nhắc nhở lịch đặt.
- Thông báo khuyến mãi.

### 4. Đánh giá & phản hồi khách hàng
- Khách hàng có thể đánh giá, bình luận về:
  - Dịch vụ phòng
  - Thái độ chủ cho thuê

### 5. Tìm kiếm & gợi ý phòng
- Theo loại phòng, giá, vị trí, tiện nghi.
- Gợi ý dựa trên lịch sử đặt phòng.

---

## 👥 Đối tượng sử dụng

### 🔹 Người thuê
- Có nhu cầu đặt phòng.
- Chức năng:
  - Tìm phòng (theo loại, vị trí, giá niêm yết)
  - Xem chi tiết (diện tích, nội thất, tiện ích, ảnh…)
  - Đặt chuyến tham quan
  - Kết nối và thỏa thuận với người cho thuê
  - Chat với nhân viên hỗ trợ
  - Tạo tài khoản (tùy chọn)
  - Đánh giá & chấm điểm phòng

### 🔹 Người cho thuê
- Quản lý, phê duyệt và cung cấp phòng.
- Chức năng:
  - Đăng nhập
  - Đăng ký phòng
  - Cập nhật thông tin phòng
  - Kết nối với người thuê
  - Xem thống kê sử dụng phòng



## 🔄 Quy trình chi tiết

1. **Người cho thuê**: Đăng ký tài khoản → Đăng phòng
2. **Admin**: Kiểm duyệt bài đăng → Gửi thông báo xác nhận
3. **Người thuê**:
   - Tìm và chọn phòng
   - Gửi thông tin liên hệ, chọn thời gian tham quan
4. **Người cho thuê**: Liên hệ xác nhận thời gian
5. **Thỏa thuận cho thuê**: Hai bên xác nhận hoặc hủy
6. **Người thuê**: Đánh giá và rating trên hệ thống
7. **Admin**: Cập nhật đánh giá lên web

---

> ✅ Mục tiêu: Cung cấp một nền tảng đặt phòng chuyên nghiệp, tiện lợi, minh bạch và hỗ trợ đánh giá chất lượng dịch vụ.
