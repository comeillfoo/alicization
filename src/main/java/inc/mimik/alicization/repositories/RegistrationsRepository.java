package inc.mimik.alicization.repositories;

import inc.mimik.alicization.entities.RegistrationsEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RegistrationsRepository extends CrudRepository<RegistrationsEntity, Integer> {
  List<RegistrationsEntity> findAllByIdIn( List<Integer> ids );
}
