package inc.mimik.alicization.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table( name = "kingdoms_count_courtiers", schema = "s284733", catalog = "studs" )
public class KingdomsCountCourtiersViewEntity {
  private Long id;
  private String kingdom;
  private Long courtiers;

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
  @Column( name = "courtiers" )
  public Long getCourtiers( ) {
    return courtiers;
  }

  public void setCourtiers( Long courtiers ) {
    this.courtiers = courtiers;
  }

  @Override
  public boolean equals( Object o ) {
    if ( this == o ) return true;
    if ( o == null || getClass( ) != o.getClass( ) ) return false;
    KingdomsCountCourtiersViewEntity that = ( KingdomsCountCourtiersViewEntity ) o;
    return Objects.equals( id, that.id ) && Objects.equals( kingdom, that.kingdom ) && Objects.equals( courtiers, that.courtiers );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( id, kingdom, courtiers );
  }
}
