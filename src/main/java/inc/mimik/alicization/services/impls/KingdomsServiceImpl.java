package inc.mimik.alicization.services.impls;

import inc.mimik.alicization.entities.KingdomsEntity;
import inc.mimik.alicization.repositories.KingdomsRepository;
import inc.mimik.alicization.services.KingdomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KingdomsServiceImpl implements KingdomsService {

  private final KingdomsRepository repo;


  @Override
  public KingdomsEntity findKingdomById( int id ) {
    return repo.findById( id );
  }

  @Override
  public List<KingdomsEntity> findAllKingdoms( ) {
    return repo.findAll();
  }

  public KingdomsServiceImpl( @Autowired KingdomsRepository repo ) {
    this.repo = repo;
  }

}
