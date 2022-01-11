package inc.mimik.alicization.repositories;

import inc.mimik.alicization.entities.RolesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RolesRepository extends JpaRepository<RolesEntity, String> {
  List<RolesEntity> findAll();
}
