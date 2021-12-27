package inc.mimik.alicization.services;

import inc.mimik.alicization.entities.KingdomsCountFemalesViewEntity;


import java.util.List;


public interface KingdomCountFemalesViewService {

    KingdomsCountFemalesViewEntity findByKingdom(String kingdom);
    List<KingdomsCountFemalesViewEntity> findAll();
}
