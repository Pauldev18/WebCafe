package WebCafe.WebCafe.DTO;

public class HoaDonDTO {
    private int thucDonId;
    private int banId;
    private int soLuong;
    private Float thanhTien;
    private int userId;

    public int getThucDonId() {
        return thucDonId;
    }

    public void setThucDonId(int thucDonId) {
        this.thucDonId = thucDonId;
    }

    public int getBanId() {
        return banId;
    }

    public void setBanId(int banId) {
        this.banId = banId;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(Float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
