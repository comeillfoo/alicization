package inc.mimik.alicization.services.impls;

import inc.mimik.alicization.entities.ResidencesEntity;
import inc.mimik.alicization.repositories.ResidencesRepository;
import inc.mimik.alicization.services.ResidencesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResidencesServiceImpl implements ResidencesService {
  private final ResidencesRepository repo;

  public ResidencesServiceImpl( @Autowired ResidencesRepository repo ) {
    this.repo = repo;
  }

  @Override
  public List<ResidencesEntity> findAllByFkResidentId( int id ) {
    return repo.findByFkResidentId( id );
  }
}
