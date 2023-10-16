package WebCafe.WebCafe.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "loai")
public class Loai {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="loai_id")
    private int loai;
    @Column(name ="ten_loai")
    private String tenLoai;
    @JsonManagedReference
    @OneToMany(mappedBy = "loai",
            cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
            fetch = FetchType.LAZY)
    private List<ThucDon> thucDonList;

    public Loai() {
    }

    public Loai(int loai, String tenLoai, List<ThucDon> thucDonList) {
        this.loai = loai;
        this.tenLoai = tenLoai;
        this.thucDonList = thucDonList;
    }

    public int getLoai() {
        return loai;
    }

    public void setLoai(int loai) {
        this.loai = loai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public List<ThucDon> getThucDonList() {
        return thucDonList;
    }

    public void setThucDonList(List<ThucDon> thucDonList) {
        this.thucDonList = thucDonList;
    }
}
