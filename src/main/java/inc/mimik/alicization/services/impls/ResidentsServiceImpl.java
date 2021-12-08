package inc.mimik.alicization.services.impls;

import inc.mimik.alicization.entities.ResidentsEntity;
import inc.mimik.alicization.repositories.ResidentsRepository;
import inc.mimik.alicization.services.ResidentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResidentsServiceImpl implements ResidentsService {

  private ResidentsRepository repo;

  @Override
  public List<ResidentsEntity> getAll( ) {
    return repo.findAll();
  }

  public ResidentsServiceImpl( @Autowired ResidentsRepository repo ) {
    this.repo = repo;
  }
}
