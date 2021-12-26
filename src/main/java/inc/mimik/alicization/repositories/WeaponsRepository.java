package inc.mimik.alicization.repositories;

import inc.mimik.alicization.entities.WeaponsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WeaponsRepository extends JpaRepository<WeaponsEntity, Integer> {
  List<WeaponsEntity> findAllByFkResidentId( int id );

  void deleteById( int id );
}
