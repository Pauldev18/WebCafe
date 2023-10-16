package WebCafe.WebCafe.Controller;

import WebCafe.WebCafe.DTO.UpdateStatusRequest;
import WebCafe.WebCafe.Entity.Ban;
import WebCafe.WebCafe.Resposity.BanRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class BanController {
    @Autowired
    private BanRepo banRepo;

    public BanController(BanRepo banRepo) {
        this.banRepo = banRepo;
    }
    @GetMapping("/allban")
    public ResponseEntity<List<Ban>> getAllBanActive(){
        return ResponseEntity.ok(banRepo.findBanActive());
    }
    @PutMapping("/updateBan/{banId}")
    public Ban updateStatus(@PathVariable int banId, @RequestBody UpdateStatusRequest updateRequest) {
        // Kiểm tra xem bản ghi có tồn tại không
        if (banRepo.existsById(banId)) {
            Ban ban = banRepo.getOne(banId);
            ban.setStatus(updateRequest.isNewStatus());
            return banRepo.save(ban); // Lưu bản ghi đã cập nhật và trả về
        } else {
            throw new EntityNotFoundException("Bản ghi không tồn tại.");
        }
    }

}
