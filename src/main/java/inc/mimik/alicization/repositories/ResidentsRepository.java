package inc.mimik.alicization.repositories;


import inc.mimik.alicization.entities.ResidentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResidentsRepository extends JpaRepository<ResidentsEntity, Integer> {
  List<ResidentsEntity> findAll();
  ResidentsEntity findById( int id );
}
