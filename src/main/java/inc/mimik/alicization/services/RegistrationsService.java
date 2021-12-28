package inc.mimik.alicization.services;

import inc.mimik.alicization.entities.RegistrationsEntity;

import java.util.List;

public interface RegistrationsService {
  List<RegistrationsEntity> findAllByIdIn( List<Integer> ids );

  void deleteById( int id );

  int visit( int residentId, int spanDays, int destKingdom );
}
