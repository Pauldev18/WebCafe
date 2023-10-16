package WebCafe.WebCafe.Resposity;

import WebCafe.WebCafe.Entity.Loai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoaiRepo extends JpaRepository<Loai, Integer> {
    List<Loai> findAll();
    Loai findById(int id);
}
