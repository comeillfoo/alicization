package inc.mimik.alicization.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class WorshipsEntityPK implements Serializable {
  private int fkLeaderId;
  private int fkCourtierId;

  @Column( name = "fk_leader_id" )
  @Id
  public int getFkLeaderId( ) {
    return fkLeaderId;
  }

  public void setFkLeaderId( int fkLeaderId ) {
    this.fkLeaderId = fkLeaderId;
  }

  @Column( name = "fk_courtier_id" )
  @Id
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
    WorshipsEntityPK that = ( WorshipsEntityPK ) o;
    return fkLeaderId == that.fkLeaderId && fkCourtierId == that.fkCourtierId;
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( fkLeaderId, fkCourtierId );
  }
}
