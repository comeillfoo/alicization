package inc.mimik.alicization.services;

import inc.mimik.alicization.entities.WeaponsEntity;

import javax.transaction.Transactional;
import java.util.List;

public interface WeaponsService {
  List<WeaponsEntity> findAllByFkResidentId( int id );

  void deleteById( int id );

  @Transactional
  WeaponsEntity addNewWeapon( int residentId, String name, int suit );
}
