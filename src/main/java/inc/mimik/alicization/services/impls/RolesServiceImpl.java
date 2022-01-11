package inc.mimik.alicization.services.impls;

import inc.mimik.alicization.entities.RolesEntity;
import inc.mimik.alicization.repositories.RolesRepository;
import inc.mimik.alicization.services.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolesServiceImpl implements RolesService {

  private RolesRepository repo;

  public RolesServiceImpl( @Autowired RolesRepository repo ) {
    this.repo = repo;
  }

  @Override
  public List<RolesEntity> getAll( ) {
    return repo.findAll();
  }
}
