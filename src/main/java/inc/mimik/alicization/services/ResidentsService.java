package inc.mimik.alicization.services;

import inc.mimik.alicization.entities.ResidentsEntity;

import javax.transaction.Transactional;
import java.util.List;

public interface ResidentsService {
  List<ResidentsEntity> getAll();
  ResidentsEntity getById( int id );
  void deleteById( int id );

  @Transactional
  int updateResidentNameById( int id, String name );
}
