package inc.mimik.alicization.services;

import inc.mimik.alicization.entities.KingdomsCountWeaponsViewEntity;

import java.util.List;

public interface KingdomCountWeaponsService {

    KingdomsCountWeaponsViewEntity findByKingdom(String kingdom);
    List<KingdomsCountWeaponsViewEntity> findAll();
}
