package WebCafe.WebCafe.Resposity;

import WebCafe.WebCafe.Entity.ThucDon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ThucDonRepo extends JpaRepository<ThucDon, Integer> {
    @Query(value = "select * FROM thuc_don t WHERE t.thucdon_id = ?1 AND t.loai_id = ?2", nativeQuery = true)
    ThucDon findByIdAndLoaiId(int thucDonId, int loaiId);
    ThucDon findById(int id);
}
