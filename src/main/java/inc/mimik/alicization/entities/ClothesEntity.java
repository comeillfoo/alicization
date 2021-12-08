package inc.mimik.alicization.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table( name = "clothes", schema = "s284733", catalog = "studs" )
public class ClothesEntity {
  private int id;
  private int density;

  @Id
  @Column( name = "id" )
  public int getId( ) {
    return id;
  }

  public void setId( int id ) {
    this.id = id;
  }

  @Basic
  @Column( name = "density" )
  public int getDensity( ) {
    return density;
  }

  public void setDensity( int density ) {
    this.density = density;
  }

  @Override
  public boolean equals( Object o ) {
    if ( this == o ) return true;
    if ( o == null || getClass( ) != o.getClass( ) ) return false;
    ClothesEntity that = ( ClothesEntity ) o;
    return id == that.id && density == that.density;
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( id, density );
  }
}
