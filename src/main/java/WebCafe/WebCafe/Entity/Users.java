package WebCafe.WebCafe.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private int userId;
    @Column(name="user_name")
    private String userName;
    @Column(name="pass_word")
    private String passWord;
    @Column(name="ten_nguoi_dung")
    private String tenNguoiDung;
    @Column(name = "sdt")
    private String sdt;

    public Users() {
    }

    public Users(int userId, String userName, String passWord, String tenNguoiDung, String sdt) {
        this.userId = userId;
        this.userName = userName;
        this.passWord = passWord;
        this.tenNguoiDung = tenNguoiDung;
        this.sdt = sdt;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getTenNguoiDung() {
        return tenNguoiDung;
    }

    public void setTenNguoiDung(String tenNguoiDung) {
        this.tenNguoiDung = tenNguoiDung;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
}
