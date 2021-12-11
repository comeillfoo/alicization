package inc.mimik.alicization.repositories;

import inc.mimik.alicization.entities.KingdomsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KingdomsRepository extends JpaRepository<KingdomsEntity, Integer> {
  KingdomsEntity findById( int id );
  List<KingdomsEntity> findAll();
}
