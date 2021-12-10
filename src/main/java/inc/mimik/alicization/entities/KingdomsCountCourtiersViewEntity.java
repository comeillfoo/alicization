package inc.mimik.alicization.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table( name = "kingdoms_count_courtiers", schema = "s284733", catalog = "studs" )
public class KingdomsCountCourtiersViewEntity {
  private Long courtiers;
  private Long id;
  private String kingdom;

  @Basic
  @Column( name = "courtiers" )
  public Long getCourtiers( ) {
    return courtiers;
  }

  public void setCourtiers( Long courtiers ) {
    this.courtiers = courtiers;
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

  @Basic
  @Column( name = "kingdom" )
  public String getKingdom( ) {
    return kingdom;
  }

  public void setKingdom( String kingdom ) {
    this.kingdom = kingdom;
  }

  @Override
  public boolean equals( Object o ) {
    if ( this == o ) return true;
    if ( o == null || getClass( ) != o.getClass( ) ) return false;
    KingdomsCountCourtiersViewEntity that = ( KingdomsCountCourtiersViewEntity ) o;
    return Objects.equals( courtiers, that.courtiers ) && Objects.equals( id, that.id ) && Objects.equals( kingdom, that.kingdom );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( courtiers, id, kingdom );
  }
}
