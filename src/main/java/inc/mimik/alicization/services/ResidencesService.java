package inc.mimik.alicization.services;

import inc.mimik.alicization.entities.ResidencesEntity;

import javax.transaction.Transactional;
import java.util.List;

public interface ResidencesService {
  List<ResidencesEntity> findAllByFkResidentId( int id );

  @Transactional
  void deleteAllByFkRegistrationId( int id );
}
