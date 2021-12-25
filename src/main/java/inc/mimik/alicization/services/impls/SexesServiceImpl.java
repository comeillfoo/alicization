package inc.mimik.alicization.services.impls;

import inc.mimik.alicization.entities.SexesEntity;
import inc.mimik.alicization.repositories.SexesRepository;
import inc.mimik.alicization.services.SexesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SexesServiceImpl implements SexesService {

  private SexesRepository repo;

  public SexesServiceImpl( @Autowired SexesRepository repo ) {
    this.repo = repo;
  }

  @Override
  public List<SexesEntity> getAll( ) {
    return repo.findAll();
  }
}
