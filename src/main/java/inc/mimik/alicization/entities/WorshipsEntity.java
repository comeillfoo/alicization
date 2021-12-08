package inc.mimik.alicization.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table( name = "worships", schema = "s284733", catalog = "studs" )
@IdClass( WorshipsEntityPK.class )
public class WorshipsEntity {
  private int fkLeaderId;
  private int fkCourtierId;

  @Id
  @Column( name = "fk_leader_id" )
  public int getFkLeaderId( ) {
    return fkLeaderId;
  }

  public void setFkLeaderId( int fkLeaderId ) {
    this.fkLeaderId = fkLeaderId;
  }

  @Id
  @Column( name = "fk_courtier_id" )
  public int getFkCourtierId( ) {
    return fkCourtierId;
  }

  public void setFkCourtierId( int fkCourtierId ) {
    this.fkCourtierId = fkCourtierId;
  }

  @Override
  public boolean equals( Object o ) {
    if ( this == o ) return true;
    if ( o == null || getClass( ) != o.getClass( ) ) return false;
    WorshipsEntity that = ( WorshipsEntity ) o;
    return fkLeaderId == that.fkLeaderId && fkCourtierId == that.fkCourtierId;
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( fkLeaderId, fkCourtierId );
  }
}
