package WebCafe.WebCafe.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name="thuc_don")
public class ThucDon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="thucdon_id")
    private int thucDonId;
    @Column(name="ten_mon")
    private String tenMon;
    @Column(name = "images")
    private String images;
    @Column(name = "don_gia")
    private Float donGia;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name="loai_id")
    private Loai loai;

    public ThucDon() {
    }

    public ThucDon(int thucDonId, String tenMon, String images, Float donGia, Loai loai) {
        this.thucDonId = thucDonId;
        this.tenMon = tenMon;
        this.images = images;
        this.donGia = donGia;
        this.loai = loai;
    }

    public int getThucDonId() {
        return thucDonId;
    }

    public void setThucDonId(int thucDonId) {
        this.thucDonId = thucDonId;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Float getDonGia() {
        return donGia;
    }

    public void setDonGia(Float donGia) {
        this.donGia = donGia;
    }

    public Loai getLoai() {
        return loai;
    }

    public void setLoai(Loai loai) {
        this.loai = loai;
    }
}
