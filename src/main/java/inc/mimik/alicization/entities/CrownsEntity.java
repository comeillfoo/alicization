package inc.mimik.alicization.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table( name = "crowns", schema = "s284733", catalog = "studs" )
public class CrownsEntity {
  private int fkClothesId;
  private int value;
  private int id;

  @Basic
  @Column( name = "fk_clothes_id" )
  public int getFkClothesId( ) {
    return fkClothesId;
  }

  public void setFkClothesId( int fkClothesId ) {
    this.fkClothesId = fkClothesId;
  }

  @Basic
  @Column( name = "value" )
  public int getValue( ) {
    return value;
  }

  public void setValue( int value ) {
    this.value = value;
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
    CrownsEntity that = ( CrownsEntity ) o;
    return fkClothesId == that.fkClothesId && value == that.value && id == that.id;
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( fkClothesId, value, id );
  }
}
