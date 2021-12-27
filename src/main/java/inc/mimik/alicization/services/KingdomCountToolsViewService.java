package inc.mimik.alicization.services;

import inc.mimik.alicization.entities.KingdomsCountToolsViewEntity;

import java.util.List;

public interface KingdomCountToolsViewService {

    KingdomsCountToolsViewEntity findByKingdom(String kingdom);
    List<KingdomsCountToolsViewEntity> findAll();
}
