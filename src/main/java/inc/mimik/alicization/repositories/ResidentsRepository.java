package inc.mimik.alicization.repositories;


import inc.mimik.alicization.entities.ResidentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResidentsRepository extends JpaRepository<ResidentsEntity, Integer> {
  List<ResidentsEntity> findAll();
  ResidentsEntity findById( int id );

  @Modifying
  @Query( "update ResidentsEntity r set r.name = ?2 where r.id = ?1" )
  int updateResidentNameById( int id, String name );
}
