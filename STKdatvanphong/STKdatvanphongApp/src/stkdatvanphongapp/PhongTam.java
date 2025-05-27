package stkdatvanphongapp;

public class PhongTam {
    private static String tenPhong;
    private static String diaChi;
    private static String moTa;
    private static int sucChua;
    private static double gia;
    private static double dienTich;
    private static int roomTypeId;
    private static int locationId;

    public static String getTenPhong() {
        return tenPhong;
    }
    public static void setTenPhong(String tenPhong) {
        PhongTam.tenPhong = tenPhong;
    }
    public static String getDiaChi() {
        return diaChi;
    }
    public static void setDiaChi(String diaChi) {
        PhongTam.diaChi = diaChi;
    }
    public static String getMoTa() {
        return moTa;
    }
    public static void setMoTa(String moTa) {
        PhongTam.moTa = moTa;
    }
    public static int getSucChua() {
        return sucChua;
    }
    public static void setSucChua(int sucChua) {
        PhongTam.sucChua = sucChua;
    }
    public static double getGia() {
        return gia;
    }
    public static void setGia(double gia) {
        PhongTam.gia = gia;
    }
    public static double getDienTich() {
        return dienTich;
    }
    public static void setDienTich(double dienTich) {
        PhongTam.dienTich = dienTich;
    }
    public static int getRoomTypeId() {
        return roomTypeId;
    }
    public static void setRoomTypeId(int roomTypeId) {
        PhongTam.roomTypeId = roomTypeId;
    }
    public static int getLocationId() {
        return locationId;
    }
    public static void setLocationId(int locationId) {
        PhongTam.locationId = locationId;
    }
    public static void setAll(String tenPhong, String diaChi, String moTa, int sucChua, double gia, double dienTich, int roomTypeId, int locationId) {
        PhongTam.tenPhong = tenPhong;
        PhongTam.diaChi = diaChi;
        PhongTam.moTa = moTa;
        PhongTam.sucChua = sucChua;
        PhongTam.gia = gia;
        PhongTam.dienTich = dienTich;
        PhongTam.roomTypeId = roomTypeId;
        PhongTam.locationId = locationId;
    }
}
