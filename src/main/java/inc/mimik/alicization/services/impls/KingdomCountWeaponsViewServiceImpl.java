package inc.mimik.alicization.services.impls;

import inc.mimik.alicization.entities.KingdomsCountWeaponsViewEntity;

import inc.mimik.alicization.repositories.KingdomCountWeaponsViewRepository;
import inc.mimik.alicization.services.KingdomCountWeaponsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KingdomCountWeaponsViewServiceImpl implements KingdomCountWeaponsService {
    private final KingdomCountWeaponsViewRepository repo;

    public KingdomsCountWeaponsViewEntity findByKingdom(String kingdom){
        return repo.findByKingdom(kingdom);
    }

    public List<KingdomsCountWeaponsViewEntity> findAll(){
        return repo.findAll();
    }

    public KingdomCountWeaponsViewServiceImpl(@Autowired KingdomCountWeaponsViewRepository repo) {
        this.repo = repo;
    }
}
