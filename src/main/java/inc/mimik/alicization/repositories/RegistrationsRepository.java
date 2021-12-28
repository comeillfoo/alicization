package inc.mimik.alicization.repositories;

import inc.mimik.alicization.entities.RegistrationsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RegistrationsRepository extends JpaRepository<RegistrationsEntity, Integer> {
  List<RegistrationsEntity> findAllByIdIn( List<Integer> ids );

  void deleteById( int id );

  @Procedure( value = "visit_kingdom" )
  int visitKingdom( @Param( "resident" )int residentId,
                     @Param( "spandays" ) int spanDays,
                     @Param( "dest_kingdom" ) int destKingdom );
}
