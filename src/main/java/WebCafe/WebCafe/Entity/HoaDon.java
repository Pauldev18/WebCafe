package WebCafe.WebCafe.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="hoa_don")
public class HoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="hoadon_id")
    private int hoaDonId;
    @Column(name = "thucdon_id")
    private int thucDonId;
    @Column(name="ban_id")
    private int banId;
    @Column(name="so_luong")
    private int soLuong;
    @Column(name="thanh_tien")
    private Float thanhTien;
    @Column(name="user_id")
    private int userId;
    @Column(name="create_at")
    private Date createAt;
    @Column(name="update_at")
    private Date updateAt;

    public HoaDon() {
    }

    public HoaDon(int hoaDonId, int thucDonId, int banId, int soLuong, Float thanhTien, int userId, Date createAt, Date updateAt) {
        this.hoaDonId = hoaDonId;
        this.thucDonId = thucDonId;
        this.banId = banId;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
        this.userId = userId;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public int getHoaDonId() {
        return hoaDonId;
    }

    public void setHoaDonId(int hoaDonId) {
        this.hoaDonId = hoaDonId;
    }

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

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}
