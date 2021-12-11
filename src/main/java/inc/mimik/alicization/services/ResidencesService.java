package inc.mimik.alicization.services;

import inc.mimik.alicization.entities.ResidencesEntity;

import java.util.List;

public interface ResidencesService {
  List<ResidencesEntity> findAllByFkResidentId( int id );
}
