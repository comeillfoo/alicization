package inc.mimik.alicization.services.impls;

import inc.mimik.alicization.entities.WeaponsEntity;
import inc.mimik.alicization.repositories.WeaponsRepository;
import inc.mimik.alicization.services.WeaponsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class WeaponsServiceImpl implements WeaponsService {

  private final WeaponsRepository repo;

  @Override
  public List<WeaponsEntity> findAllByFkResidentId( int id ) {
    return repo.findAllByFkResidentId( id );
  }

  @Override
  public void deleteById( int id ) {
    repo.deleteById( id );
  }

  @Override
  @Transactional
  public WeaponsEntity addNewWeapon( int residentId, String name, int suit ) {
    final WeaponsEntity weapon = new WeaponsEntity();
    weapon.setFkResidentId( residentId );
    weapon.setName( name );
    weapon.setFkKingdomId( suit );
    return repo.save( weapon );
  }

  public WeaponsServiceImpl( @Autowired WeaponsRepository repo ) {
    this.repo = repo;
  }
}
