package inc.mimik.alicization.services.impls;

import inc.mimik.alicization.entities.KingdomsCountToolsViewEntity;
import inc.mimik.alicization.repositories.KingdomCountToolsViewRepository;
import inc.mimik.alicization.services.KingdomCountToolsViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KingdomCountToolsViewServiceImpl implements KingdomCountToolsViewService {
    private final KingdomCountToolsViewRepository repo;

    public KingdomsCountToolsViewEntity findByKingdom(String kingdom){
        return repo.findByKingdom(kingdom);
    }

    public List<KingdomsCountToolsViewEntity> findAll(){
        return repo.findAll();
    }

    public KingdomCountToolsViewServiceImpl(@Autowired KingdomCountToolsViewRepository repo) {
        this.repo = repo;
    }
}
