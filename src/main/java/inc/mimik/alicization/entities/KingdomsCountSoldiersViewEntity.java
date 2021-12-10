package inc.mimik.alicization.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table( name = "kingdoms_count_soldiers", schema = "s284733", catalog = "studs" )
public class KingdomsCountSoldiersViewEntity {
  private String kingdom;
  private Long soldiers;
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
  @Column( name = "soldiers" )
  public Long getSoldiers( ) {
    return soldiers;
  }

  public void setSoldiers( Long soldiers ) {
    this.soldiers = soldiers;
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
    KingdomsCountSoldiersViewEntity that = ( KingdomsCountSoldiersViewEntity ) o;
    return Objects.equals( kingdom, that.kingdom ) && Objects.equals( soldiers, that.soldiers ) && Objects.equals( id, that.id );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( kingdom, soldiers, id );
  }
}
