package inc.mimik.alicization.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import java.util.List;

//No needed :(

@NoRepositoryBean
public interface KingdomCountViewRepository<T> extends JpaRepository<T, Long> {
    T findByKingdom(String kingdom);
    List<T> findAll();
}
