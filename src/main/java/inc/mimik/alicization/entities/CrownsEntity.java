package inc.mimik.alicization.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table( name = "crowns", schema = "s284733", catalog = "studs" )
public class CrownsEntity {
  private int id;
  private int value;

  @Id
  @Column( name = "id" )
  public int getId( ) {
    return id;
  }

  public void setId( int id ) {
    this.id = id;
  }

  @Basic
  @Column( name = "value" )
  public int getValue( ) {
    return value;
  }

  public void setValue( int value ) {
    this.value = value;
  }

  @Override
  public boolean equals( Object o ) {
    if ( this == o ) return true;
    if ( o == null || getClass( ) != o.getClass( ) ) return false;
    CrownsEntity that = ( CrownsEntity ) o;
    return id == that.id && value == that.value;
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( id, value );
  }
}
