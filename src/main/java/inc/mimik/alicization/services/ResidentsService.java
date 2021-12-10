package inc.mimik.alicization.services;

import inc.mimik.alicization.entities.ResidentsEntity;

import java.util.List;

public interface ResidentsService {
  List<ResidentsEntity> getAll();
  ResidentsEntity getById( int id );
}
