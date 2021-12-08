package inc.mimik.alicization.repositories;


import inc.mimik.alicization.entities.ResidentsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResidentsRepository extends CrudRepository<ResidentsEntity, Integer> {
  public List<ResidentsEntity> findAll();
}
