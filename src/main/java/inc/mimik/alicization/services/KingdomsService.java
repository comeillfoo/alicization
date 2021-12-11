package inc.mimik.alicization.services;

import inc.mimik.alicization.entities.KingdomsEntity;

import java.util.List;

public interface KingdomsService {
  KingdomsEntity findKingdomById( int id );

  List<KingdomsEntity> findAllKingdoms();
}
