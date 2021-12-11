package inc.mimik.alicization.repositories;

import inc.mimik.alicization.entities.RegistrationsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegistrationsRepository extends JpaRepository<RegistrationsEntity, Integer> {
  List<RegistrationsEntity> findAllByIdIn( List<Integer> ids );
}
