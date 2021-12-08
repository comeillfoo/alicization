package inc.mimik.alicization.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ResidencesEntityPK implements Serializable {
  private int fkResidentId;
  private int fkRegistrationId;

  @Column( name = "fk_resident_id" )
  @Id
  public int getFkResidentId( ) {
    return fkResidentId;
  }

  public void setFkResidentId( int fkResidentId ) {
    this.fkResidentId = fkResidentId;
  }

  @Column( name = "fk_registration_id" )
  @Id
  public int getFkRegistrationId( ) {
    return fkRegistrationId;
  }

  public void setFkRegistrationId( int fkRegistrationId ) {
    this.fkRegistrationId = fkRegistrationId;
  }

  @Override
  public boolean equals( Object o ) {
    if ( this == o ) return true;
    if ( o == null || getClass( ) != o.getClass( ) ) return false;
    ResidencesEntityPK that = ( ResidencesEntityPK ) o;
    return fkResidentId == that.fkResidentId && fkRegistrationId == that.fkRegistrationId;
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( fkResidentId, fkRegistrationId );
  }
}
