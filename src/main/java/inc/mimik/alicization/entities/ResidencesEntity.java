package inc.mimik.alicization.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table( name = "residences", schema = "s284733", catalog = "studs" )
@IdClass( ResidencesEntityPK.class )
public class ResidencesEntity {
  private int fkResidentId;
  private int fkRegistrationId;

  @Id
  @Column( name = "fk_resident_id" )
  public int getFkResidentId( ) {
    return fkResidentId;
  }

  public void setFkResidentId( int fkResidentId ) {
    this.fkResidentId = fkResidentId;
  }

  @Id
  @Column( name = "fk_registration_id" )
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
    ResidencesEntity that = ( ResidencesEntity ) o;
    return fkResidentId == that.fkResidentId && fkRegistrationId == that.fkRegistrationId;
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( fkResidentId, fkRegistrationId );
  }
}
