package WebCafe.WebCafe.DTO;

public class NewThucDon {
    private String tenMon;
    private String images;
    private Float donGia;
    private int loaiId;

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

    public int getLoaiId() {
        return loaiId;
    }

    public void setLoaiId(int loaiId) {
        this.loaiId = loaiId;
    }
}
