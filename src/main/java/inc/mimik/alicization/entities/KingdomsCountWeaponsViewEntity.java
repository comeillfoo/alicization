package inc.mimik.alicization.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table( name = "kingdoms_count_weapons", schema = "s284733", catalog = "studs" )
public class KingdomsCountWeaponsViewEntity {
  private String kingdom;
  private Long weaponsNumber;
  private Long id;

  @Basic
  @Column( name = "kingdom" )
  public String getKingdom( ) {
    return kingdom;
  }

  public void setKingdom( String kingdom ) {
    this.kingdom = kingdom;
  }

  @Basic
  @Column( name = "weapons_number" )
  public Long getWeaponsNumber( ) {
    return weaponsNumber;
  }

  public void setWeaponsNumber( Long weaponsNumber ) {
    this.weaponsNumber = weaponsNumber;
  }
  @Id
  @Basic
  @Column( name = "id" )
  public Long getId( ) {
    return id;
  }

  public void setId( Long id ) {
    this.id = id;
  }

  @Override
  public boolean equals( Object o ) {
    if ( this == o ) return true;
    if ( o == null || getClass( ) != o.getClass( ) ) return false;
    KingdomsCountWeaponsViewEntity that = ( KingdomsCountWeaponsViewEntity ) o;
    return Objects.equals( kingdom, that.kingdom ) && Objects.equals( weaponsNumber, that.weaponsNumber ) && Objects.equals( id, that.id );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( kingdom, weaponsNumber, id );
  }
}
