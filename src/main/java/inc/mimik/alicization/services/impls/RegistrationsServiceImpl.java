package inc.mimik.alicization.services.impls;

import inc.mimik.alicization.entities.RegistrationsEntity;
import inc.mimik.alicization.repositories.RegistrationsRepository;
import inc.mimik.alicization.services.RegistrationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationsServiceImpl implements RegistrationsService {

  private final RegistrationsRepository repo;

  @Override
  public List<RegistrationsEntity> findAllByIdIn( List<Integer> ids ) {
    return repo.findAllByIdIn( ids );
  }

  public RegistrationsServiceImpl( @Autowired RegistrationsRepository repo ) {
    this.repo = repo;
  }
}
