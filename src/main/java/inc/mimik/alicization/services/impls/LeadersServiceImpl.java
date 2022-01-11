package inc.mimik.alicization.services.impls;

import inc.mimik.alicization.entities.LeadersEntity;
import inc.mimik.alicization.repositories.LeadersRepository;
import inc.mimik.alicization.services.LeadersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class LeadersServiceImpl implements LeadersService {

  private LeadersRepository repo;

  public LeadersServiceImpl( @Autowired LeadersRepository repo ) {
    this.repo = repo;
  }

  @Override
  public LeadersEntity addNewLeader( int fkResidentId, int fkKingdomId, Date kingdomReignEndDate, Integer fkCrownId ) {
    LeadersEntity leader = new LeadersEntity();
    leader.setFkCrownId( fkCrownId );
    leader.setFkKingdomId( fkKingdomId );
    leader.setKingdomReignEnddate( kingdomReignEndDate );
    leader.setFkResidentId( fkResidentId );
    return repo.save( leader );
  }

  @Override
  public int coronate( int leaderId ) {
    return repo.coronate( leaderId );
  }
}
