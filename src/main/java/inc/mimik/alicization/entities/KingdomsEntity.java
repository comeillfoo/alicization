package inc.mimik.alicization.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table( name = "kingdoms", schema = "s284733", catalog = "studs" )
public class KingdomsEntity {
  private int id;
  private int numberOfResidents;

  @Id
  @Column( name = "id" )
  public int getId( ) {
    return id;
  }

  public void setId( int id ) {
    this.id = id;
  }

  @Basic
  @Column( name = "number_of_residents" )
  public int getNumberOfResidents( ) {
    return numberOfResidents;
  }

  public void setNumberOfResidents( int numberOfResidents ) {
    this.numberOfResidents = numberOfResidents;
  }

  @Override
  public boolean equals( Object o ) {
    if ( this == o ) return true;
    if ( o == null || getClass( ) != o.getClass( ) ) return false;
    KingdomsEntity that = ( KingdomsEntity ) o;
    return id == that.id && numberOfResidents == that.numberOfResidents;
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( id, numberOfResidents );
  }
}
