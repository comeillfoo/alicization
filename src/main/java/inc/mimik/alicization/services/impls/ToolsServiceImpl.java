package inc.mimik.alicization.services.impls;

import inc.mimik.alicization.entities.ToolsEntity;
import inc.mimik.alicization.repositories.ToolsRepository;
import inc.mimik.alicization.services.ToolsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToolsServiceImpl implements ToolsService {

  private ToolsRepository repo;

  @Override
  public List<ToolsEntity> findAllByFkResidentId( int id ) {
    return repo.findAllByFkResidentId( id );
  }

  @Override
  public void deleteById( int id ) {
    repo.deleteById( id );
  }

  public ToolsServiceImpl( @Autowired ToolsRepository repo ) {
    this.repo = repo;
  }
}
