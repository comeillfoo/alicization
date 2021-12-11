package inc.mimik.alicization.repositories;

import inc.mimik.alicization.entities.ResidencesEntity;
import inc.mimik.alicization.entities.ResidencesEntityPK;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ResidencesRepository extends CrudRepository<ResidencesEntity, ResidencesEntityPK> {
  List<ResidencesEntity> findByFkResidentId( int id );
}
