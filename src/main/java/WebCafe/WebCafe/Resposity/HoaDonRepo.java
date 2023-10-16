package WebCafe.WebCafe.Resposity;

import WebCafe.WebCafe.Entity.HoaDon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoaDonRepo extends JpaRepository<HoaDon, Integer> {
}
