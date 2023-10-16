package WebCafe.WebCafe.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ban")
public class Ban {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ban_id")
    private int banId;
    @Column(name = "ten_ban")
    private String tenBan;
    @Column(name = "ghi_chu")
    private String ghiChu;
    @Column(name = "status")
    private boolean status;

    public Ban() {
    }

    public Ban(int banId, String tenBan, String ghiChu, boolean status) {
        this.banId = banId;
        this.tenBan = tenBan;
        this.ghiChu = ghiChu;
        this.status = status;
    }

    public int getBanId() {
        return banId;
    }

    public void setBanId(int banId) {
        this.banId = banId;
    }

    public String getTenBan() {
        return tenBan;
    }

    public void setTenBan(String tenBan) {
        this.tenBan = tenBan;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
