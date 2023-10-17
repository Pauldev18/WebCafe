package WebCafe.WebCafe.Controller;

import WebCafe.WebCafe.DTO.HoaDonDTO;
import WebCafe.WebCafe.DTO.Login;
import WebCafe.WebCafe.Entity.Admin;
import WebCafe.WebCafe.Resposity.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
public class AdminControlller {
    @Autowired
    private AdminRepo adminRepo;

    public AdminControlller(AdminRepo adminRepo) {
        this.adminRepo = adminRepo;
    }
    @PostMapping("/loginadmin")
    public Admin getAdmin(@RequestBody Login login){
        return adminRepo.findTkMk(login.getUserName(), login.getPassWord());
    }

}
