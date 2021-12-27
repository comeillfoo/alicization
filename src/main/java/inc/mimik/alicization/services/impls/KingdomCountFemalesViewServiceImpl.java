package inc.mimik.alicization.services.impls;

import inc.mimik.alicization.entities.KingdomsCountFemalesViewEntity;
import inc.mimik.alicization.repositories.KingdomCountFemalesViewRepository;
import inc.mimik.alicization.services.KingdomCountFemalesViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KingdomCountFemalesViewServiceImpl implements KingdomCountFemalesViewService {

    private final KingdomCountFemalesViewRepository repo;

    public KingdomsCountFemalesViewEntity findByKingdom(String kingdom){
        return repo.findByKingdom(kingdom);
    }

    public List<KingdomsCountFemalesViewEntity> findAll(){
        return repo.findAll();
    }

    public KingdomCountFemalesViewServiceImpl(@Autowired KingdomCountFemalesViewRepository repo) {
        this.repo = repo;
    }
}
