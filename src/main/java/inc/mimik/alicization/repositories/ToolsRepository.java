package inc.mimik.alicization.repositories;

import inc.mimik.alicization.entities.ToolsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ToolsRepository extends JpaRepository<ToolsEntity, Integer> {
  List<ToolsEntity> findAllByFkResidentId( int id );

  void deleteById( int id );
}
