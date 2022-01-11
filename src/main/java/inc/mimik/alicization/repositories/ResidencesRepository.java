package inc.mimik.alicization.repositories;

import inc.mimik.alicization.entities.ResidencesEntity;
import inc.mimik.alicization.entities.ResidencesEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResidencesRepository extends JpaRepository<ResidencesEntity, ResidencesEntityPK> {
  List<ResidencesEntity> findByFkResidentId( int id );

  void deleteAllByFkResidentId( int id );

  void deleteAllByFkRegistrationId( int id );
}
