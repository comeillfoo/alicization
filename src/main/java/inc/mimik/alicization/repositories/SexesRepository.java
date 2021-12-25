package inc.mimik.alicization.repositories;

import inc.mimik.alicization.entities.SexesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SexesRepository extends JpaRepository<SexesEntity, String> {
  List<SexesEntity> findAll();
}
