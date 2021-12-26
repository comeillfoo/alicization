package inc.mimik.alicization.services;

import inc.mimik.alicization.entities.WeaponsEntity;

import java.util.List;

public interface WeaponsService {
  List<WeaponsEntity> findAllByFkResidentId( int id );

  void deleteById( int id );
}
