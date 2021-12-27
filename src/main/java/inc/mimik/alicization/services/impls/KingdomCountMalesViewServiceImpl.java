package inc.mimik.alicization.services.impls;

import inc.mimik.alicization.entities.KingdomsCountMalesViewEntity;
import inc.mimik.alicization.repositories.KingdomCountMalesViewRepository;
import inc.mimik.alicization.services.KingdomCountMalesViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KingdomCountMalesViewServiceImpl implements KingdomCountMalesViewService {
    private final KingdomCountMalesViewRepository repo;


    public KingdomsCountMalesViewEntity findByKingdom(String kingdom) {
        return repo.findByKingdom(kingdom);
    }

    public List<KingdomsCountMalesViewEntity> findAll() {
        return repo.findAll();
    }

    public KingdomCountMalesViewServiceImpl(@Autowired KingdomCountMalesViewRepository repo) {
        this.repo = repo;
    }
}
