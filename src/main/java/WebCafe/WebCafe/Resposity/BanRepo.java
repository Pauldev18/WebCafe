package WebCafe.WebCafe.Resposity;

import WebCafe.WebCafe.Entity.Ban;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BanRepo extends JpaRepository<Ban, Integer> {
    @Query(value = "select * from ban b where b.status = 1", nativeQuery = true)
    List<Ban> findBanActive();


}
