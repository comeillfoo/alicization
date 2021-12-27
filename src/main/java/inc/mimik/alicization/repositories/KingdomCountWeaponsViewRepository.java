package inc.mimik.alicization.repositories;

import inc.mimik.alicization.entities.KingdomsCountWeaponsViewEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KingdomCountWeaponsViewRepository extends KingdomCountViewRepository<KingdomsCountWeaponsViewEntity> {

}
