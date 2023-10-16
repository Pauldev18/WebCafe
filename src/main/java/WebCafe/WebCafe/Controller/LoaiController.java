package WebCafe.WebCafe.Controller;

import WebCafe.WebCafe.DTO.LoaiUpdateDTO;
import WebCafe.WebCafe.Entity.Ban;
import WebCafe.WebCafe.Entity.Loai;
import WebCafe.WebCafe.Resposity.LoaiRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @PutMapping("/updateLoai/{idLoai}")
    public String updateLoai(@PathVariable int idLoai, @RequestBody LoaiUpdateDTO loaiUpdateDTO){
        Loai updateLoai = loaiRepo.findById(idLoai);
        updateLoai.setTenLoai(loaiUpdateDTO.getTenLoai());
        loaiRepo.save(updateLoai);
        return "Update thành công";
    }
    @DeleteMapping("/deleteLoai/{idLoai}")
    public String deleteLoai(@PathVariable int idLoai){
        Loai deleteLoai = loaiRepo.findById(idLoai);
        loaiRepo.delete(deleteLoai);
        return "delete thành công";
    }
    @PostMapping("/addLoai")
    public Loai addLoai(@RequestBody LoaiUpdateDTO loaiUpdateDTO){
        Loai newLoai = new Loai();
        newLoai.setTenLoai(loaiUpdateDTO.getTenLoai());
        loaiRepo.save(newLoai);
        return newLoai;
    }
}
