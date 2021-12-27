package inc.mimik.alicization.services;

import inc.mimik.alicization.entities.KingdomsCountMalesViewEntity;

import java.util.List;

public interface KingdomCountMalesViewService {
    KingdomsCountMalesViewEntity findByKingdom(String kingdom);
    List<KingdomsCountMalesViewEntity> findAll();
}
