package inc.mimik.alicization.services.impls;

import inc.mimik.alicization.entities.ResidentsEntity;
import inc.mimik.alicization.entities.WeaponsEntity;
import inc.mimik.alicization.repositories.ResidentsRepository;
import inc.mimik.alicization.services.ResidentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ResidentsServiceImpl implements ResidentsService {

  private final ResidentsRepository residentsRepo;

  @Override
  public List<ResidentsEntity> getAll( ) {
    return residentsRepo.findAll();
  }

  @Override
  public ResidentsEntity getById( int id ) {
    return residentsRepo.findById( id );
  }

  @Override
  @Transactional
  public void deleteById( int id ) {
    residentsRepo.deleteById( id );
  }

  @Override
  @Transactional
  public int updateResidentNameById( int id, String name ) {
    return residentsRepo.updateResidentNameById( id, name );
  }

  @Override
  @Transactional
  public ResidentsEntity addNewResident( String name, String fkSexName, String fkSuitName, String fkRoleName ) {
    final ResidentsEntity resident = new ResidentsEntity();
    resident.setName( name );
    resident.setFkSexName( fkSexName );
    resident.setFkSuitName( fkSuitName );
    resident.setFkRoleName( fkRoleName );
    return residentsRepo.save( resident );
  }

  public ResidentsServiceImpl( @Autowired ResidentsRepository residentsRepo ) {
    this.residentsRepo = residentsRepo;
  }
}
