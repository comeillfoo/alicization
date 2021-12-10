package inc.mimik.alicization.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table( name = "kingdoms", schema = "s284733", catalog = "studs" )
public class KingdomsEntity {
  private String fkSuitName;
  private int numberOfResidents;
  private int id;

  @Basic
  @Column( name = "fk_suit_name" )
  public String getFkSuitName( ) {
    return fkSuitName;
  }

  public void setFkSuitName( String fkSuitName ) {
    this.fkSuitName = fkSuitName;
  }

  @Basic
  @Column( name = "number_of_residents" )
  public int getNumberOfResidents( ) {
    return numberOfResidents;
  }

  public void setNumberOfResidents( int numberOfResidents ) {
    this.numberOfResidents = numberOfResidents;
  }

  @Id
  @Column( name = "id" )
  public int getId( ) {
    return id;
  }

  public void setId( int id ) {
    this.id = id;
  }

  @Override
  public boolean equals( Object o ) {
    if ( this == o ) return true;
    if ( o == null || getClass( ) != o.getClass( ) ) return false;
    KingdomsEntity that = ( KingdomsEntity ) o;
    return numberOfResidents == that.numberOfResidents && id == that.id && Objects.equals( fkSuitName, that.fkSuitName );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( fkSuitName, numberOfResidents, id );
  }
}
