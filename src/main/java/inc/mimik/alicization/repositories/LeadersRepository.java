package inc.mimik.alicization.repositories;

import inc.mimik.alicization.entities.LeadersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

public interface LeadersRepository extends JpaRepository<LeadersEntity, Integer> {

  @Procedure( value="coronate" )
  int coronate( @Param( "new_leader_id" ) int leader_id );
}
