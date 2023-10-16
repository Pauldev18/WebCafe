package WebCafe.WebCafe.Controller;

import WebCafe.WebCafe.Entity.Loai;
import WebCafe.WebCafe.Resposity.LoaiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin
@RestController
public class LoaiController {
    @Autowired
    private LoaiRepo loaiRepo;

    public LoaiController(LoaiRepo loaiRepo) {
        this.loaiRepo = loaiRepo;
    }
    @GetMapping("/allloai")
    public ResponseEntity<List<Loai>> findAllLoai(){
        return ResponseEntity.ok(loaiRepo.findAll());
    }
    @GetMapping("/loaibyid")
    public ResponseEntity<Loai> findByIdLoai(@RequestParam("loaiId") int id)
    {
        return new ResponseEntity<>(loaiRepo.findById(id), HttpStatus.OK);
    }
}
