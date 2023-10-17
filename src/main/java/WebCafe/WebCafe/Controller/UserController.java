package WebCafe.WebCafe.Controller;

import WebCafe.WebCafe.DTO.UserDTO;
import WebCafe.WebCafe.DTO.Login;
import WebCafe.WebCafe.Entity.Users;
import WebCafe.WebCafe.Resposity.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class UserController {
    @Autowired
    private UserRepo userRepo;

    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
    @GetMapping("/allusers")
    public List<Users> getAllUser(){
        return userRepo.findAll();
    }
    @PutMapping("/edituser/{userId}")
    public String updateUser(@PathVariable int userId, @RequestBody UserDTO userDTO)
    {
        Users users = userRepo.findById(userId);
        users.setTenNguoiDung(userDTO.getTenNguoiDung());
        users.setUserName(userDTO.getUserName());
        users.setPassWord(userDTO.getPassWord());
        users.setSdt(userDTO.getSdt());

        userRepo.save(users);
        return "Sua thanh cong";
    }
    @DeleteMapping("/deleteUser/{userId}")
    public String deleteUser(@PathVariable int userId)
    {
        Users users = userRepo.findById(userId);

        userRepo.delete(users);
        return "Xoa user thanh cong";
    }
    @PostMapping("/login")
    public Users findUser(@RequestBody Login login){
        return userRepo.findByUserNameAndPassWord(login.getUserName(), login.getPassWord());
    }


}
