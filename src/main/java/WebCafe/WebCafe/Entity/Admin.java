package WebCafe.WebCafe.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="admins")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="admin_id")
    private int adminId;
    @Column(name="tk")
    private String tk;
    @Column(name="mk")
    private String mk;

    public Admin() {
    }

    public Admin(int adminId, String tk, String mk) {
        this.adminId = adminId;
        this.tk = tk;
        this.mk = mk;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getTk() {
        return tk;
    }

    public void setTk(String tk) {
        this.tk = tk;
    }

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }
}
