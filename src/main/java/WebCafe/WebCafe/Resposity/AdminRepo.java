package WebCafe.WebCafe.Resposity;

import WebCafe.WebCafe.Entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer> {
    @Query(value = "select * from admins ad WHERE ad.tk = ?1 and ad.mk = ?2", nativeQuery = true)
    Admin findTkMk(String tk, String mk);
}
