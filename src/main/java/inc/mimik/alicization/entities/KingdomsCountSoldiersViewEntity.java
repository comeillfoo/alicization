package inc.mimik.alicization.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table( name = "kingdoms_count_soldiers", schema = "s284733", catalog = "studs" )
public class KingdomsCountSoldiersViewEntity {
  private Long id;
  private String kingdom;
  private Long soldiers;

  @Id
  @Basic
  @Column( name = "id" )
  public Long getId( ) {
    return id;
  }

  public void setId( Long id ) {
    this.id = id;
  }

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

  @Override
  public boolean equals( Object o ) {
    if ( this == o ) return true;
    if ( o == null || getClass( ) != o.getClass( ) ) return false;
    KingdomsCountSoldiersViewEntity that = ( KingdomsCountSoldiersViewEntity ) o;
    return Objects.equals( id, that.id ) && Objects.equals( kingdom, that.kingdom ) && Objects.equals( soldiers, that.soldiers );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( id, kingdom, soldiers );
  }
}