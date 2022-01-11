package inc.mimik.alicization.services;

import inc.mimik.alicization.entities.LeadersEntity;

import javax.transaction.Transactional;
import java.sql.Date;

public interface LeadersService {

  @Transactional
  LeadersEntity addNewLeader( int fkResidentId, int fkKingdomId, Date kingdomReignEndDate, Integer fkCrownId );

  int coronate( int leaderId );
}
