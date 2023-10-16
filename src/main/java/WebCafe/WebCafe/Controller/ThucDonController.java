package WebCafe.WebCafe.Controller;

import WebCafe.WebCafe.DTO.NewThucDon;
import WebCafe.WebCafe.DTO.ThucDonDTO;
import WebCafe.WebCafe.Entity.Loai;
import WebCafe.WebCafe.Entity.ThucDon;
import WebCafe.WebCafe.Resposity.LoaiRepo;
import WebCafe.WebCafe.Resposity.ThucDonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class ThucDonController {
    @Autowired
    private ThucDonRepo thucDonRepo;
    @Autowired
    private LoaiRepo loaiRepo;

    public ThucDonController(ThucDonRepo thucDonRepo, LoaiRepo loaiRepo) {
        this.thucDonRepo = thucDonRepo;
        this.loaiRepo = loaiRepo;
    }

    @PostMapping("/updateThucDon/{thucDonId}/{loaiId}")
    public String updateThucDon(@PathVariable int thucDonId, @PathVariable int loaiId, @RequestBody ThucDonDTO thucDonDTO){
        ThucDon updateThucDon = thucDonRepo.findByIdAndLoaiId(thucDonId, loaiId);
        updateThucDon.setDonGia(thucDonDTO.getDonGia());
        thucDonRepo.save(updateThucDon);
        return "update thành công";
    }
    @DeleteMapping("/deleteThucDon/{thucDonId}")
    public String deleteThucDon(@PathVariable int thucDonId)
    {
        ThucDon deleteThucDon = thucDonRepo.findById(thucDonId);
        thucDonRepo.delete(deleteThucDon);
        return "Xóa thành công";
    }
    @PostMapping("/newThucDon")
    public String newThucDon(@RequestBody NewThucDon newThucDon){
        ThucDon thucDon = new ThucDon();
        thucDon.setTenMon(newThucDon.getTenMon());
        thucDon.setImages(newThucDon.getImages());
        thucDon.setDonGia(newThucDon.getDonGia());
        Loai loai = loaiRepo.findById(newThucDon.getLoaiId());
        thucDon.setLoai(loai);
        thucDonRepo.save(thucDon);
        return "thêm sản phẩm thành công";
    }

}
