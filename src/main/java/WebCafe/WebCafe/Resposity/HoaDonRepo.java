package WebCafe.WebCafe.Resposity;

import WebCafe.WebCafe.Entity.HoaDon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HoaDonRepo extends JpaRepository<HoaDon, Integer> {
    @Query(value = "select * FROM hoa_don h", nativeQuery = true)
    List<HoaDon> findAll();
    @Query(value = "select * FROM hoa_don h WHERE h.user_id = ?1", nativeQuery = true)
    List<HoaDon> findAllUserId(int id);

}
