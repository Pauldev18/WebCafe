package WebCafe.WebCafe.Controller;

import WebCafe.WebCafe.DTO.HoaDonDTO;
import WebCafe.WebCafe.Entity.HoaDon;
import WebCafe.WebCafe.Resposity.HoaDonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@CrossOrigin
@RestController
public class HoaDonController {
    @Autowired
    private HoaDonRepo hoaDonRepo;

    public HoaDonController(HoaDonRepo hoaDonRepo) {
        this.hoaDonRepo = hoaDonRepo;
    }
    @PostMapping("/addHoaDon")
    public ResponseEntity<List<HoaDonDTO>> addHoaDon(@RequestBody List<HoaDonDTO> hoaDonDTOList) {
        // Tạo danh sách HoaDon từ danh sách HoaDonDTO và lưu chúng vào cơ sở dữ liệu
        List<HoaDon> hoaDonList = new ArrayList<>();
        for (HoaDonDTO hoaDonDTO : hoaDonDTOList) {
            HoaDon hoaDon = new HoaDon();
            hoaDon.setThucDonId(hoaDonDTO.getThucDonId());
            hoaDon.setBanId(hoaDonDTO.getBanId());
            hoaDon.setSoLuong(hoaDonDTO.getSoLuong());
            hoaDon.setThanhTien(hoaDonDTO.getThanhTien());
            hoaDon.setCreateAt(new Date());
            hoaDon.setUpdateAt(new Date());
            hoaDon.setUserId(hoaDonDTO.getUserId());
            hoaDonList.add(hoaDon);
        }
        hoaDonRepo.saveAll(hoaDonList);

        return ResponseEntity.ok(hoaDonDTOList);
    }

    @GetMapping("/allhoadon")
    public List<HoaDon> getAllHoaDon(){
        return hoaDonRepo.findAll();
    }
    @GetMapping("/hoadonbyuser/{userId}")
    public List<HoaDon> getByUserId(@PathVariable int userId)
    {
        return hoaDonRepo.findAllUserId(userId);
    }

}
