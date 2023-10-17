package WebCafe.WebCafe.Resposity;

import WebCafe.WebCafe.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {
    Users findById(int id);
    @Query(value = "select * from users u WHERE u.user_name = ?1 AND u.pass_word = ?2", nativeQuery = true)
    Users findByUserNameAndPassWord(String userName, String password);
}
