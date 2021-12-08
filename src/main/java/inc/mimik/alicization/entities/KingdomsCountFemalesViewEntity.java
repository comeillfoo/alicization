package inc.mimik.alicization.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table( name = "kingdoms_count_females", schema = "s284733", catalog = "studs" )
public class KingdomsCountFemalesViewEntity {
  private Long id;
  private String kingdom;
  private Long females;

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
  @Column( name = "females" )
  public Long getFemales( ) {
    return females;
  }

  public void setFemales( Long females ) {
    this.females = females;
  }

  @Override
  public boolean equals( Object o ) {
    if ( this == o ) return true;
    if ( o == null || getClass( ) != o.getClass( ) ) return false;
    KingdomsCountFemalesViewEntity that = ( KingdomsCountFemalesViewEntity ) o;
    return Objects.equals( id, that.id ) && Objects.equals( kingdom, that.kingdom ) && Objects.equals( females, that.females );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( id, kingdom, females );
  }
}
