# STK_datvanphong
/*
STILLTHINKING
Tên chung: Quản lí hệ thống đặt phòng dịch vụ cho doanh nghiệp (STKdatvanphong)
Quản lí đặt phòng: Quản lý danh sách phòng,loại phòng, tình trạng phòng (còn trống, đã đặt, đang sử dụng, bảo trì)
Xác minh, phân quyền và quản lí các đối tượng người dùng: Người đặt phòng, Người cho thuê phòng, Admin…
Dịch vụ gửi thông báo (Notification Service): email/SMS xác nhận đặt phòng, nhắc nhở lịch đặt, thông báo khuyến mãi.
Dịch vụ đánh giá và phản hồi khách hàng: Khách hàng có thể đánh giá, bình luận về dịch vụ phòng, thái độ của chủ cho thuê,…
Dịch vụ tìm kiếm và gợi ý phòng:Tìm kiếm theo: Loại phòng, giá, vị trí, tiện nghi; gợi ý phòng phù hợp dựa trên lịch sử đặt phòng.
Mẫu: https://www.regus.com/vi-vn
Các Đối Tượng Sử dụng
Người thuê : Người có nhu cầu đặt phòng.
Người cho thuê : Người chịu trách nhiệm quản lý, phê duyệt hoặc cung cấp phòng.
Admin: Quản lí bài đăng, Kiểm duyệt thông tin bài đăng
Chi tiết:
Chức năng chính:
Cho phép người cho thuê :
đăng nhập tài khoản, ( Phân cấp tài khoản dựa trên mức phí đóng)
đăng kí phòng
kết nối trực tiếp với người thuê, .
Cập nhật thông tin phòng (tên phòng, sức chứa, trạng thái).
Xuất báo cáo thống kê sử dụng phòng.
Cho phép người thuê:
Tìm phòng dựa trên: Loại phòng, Vị trí , giá cả(niêm yết).
Xem thông tin phòng (diện tích, nội thất, vật dụng, hình ảnh,…)
Đặt chuyến tham quan.
Kết nối, thỏa thuận với người cho thuê(trong trường hợp có khả năng giảm giá)
Chatbox để kết nối với nhân viên hỗ trợ
Tạo tài khoản (Optional)
Admin:
Phê duyệt bài đăng
gửi thông báo
xóa/ cập nhật thông tin người dùng
Quy Trình Chi Tiết: ( xem lại quy trình ) ( quy trình tổng quát cho thuê và đánh giá chất lượng ) Tổng quát
Người cho thuê: Đăng kí tài khoản, Đăng kí phòng
Admin: Xem thông tin bài đăng và duyệt
Gửi thông báo xác nhận cho người cho thuê
Người thuê: tìm phòng, để lại thông tin liên lạc, chọn thời gian tham quan
Nhận thông tin từ bên cần thuê, liên lạc và xác nhận thời gian tham quan với bên thuê
Thỏa thuận và xác nhận cho thuê
Hủy hoặc xác nhận cho thuê trên hệ thống
Người thuê đánh giá và rating trên hệ thống
Admin cập nhật đánh giá lên web
*/
