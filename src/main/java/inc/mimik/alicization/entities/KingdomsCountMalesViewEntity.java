package inc.mimik.alicization.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table( name = "kingdoms_count_males", schema = "s284733", catalog = "studs" )
public class KingdomsCountMalesViewEntity {
  private String kingdom;
  private Long males;
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
  @Column( name = "males" )
  public Long getMales( ) {
    return males;
  }

  public void setMales( Long males ) {
    this.males = males;
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
    KingdomsCountMalesViewEntity that = ( KingdomsCountMalesViewEntity ) o;
    return Objects.equals( kingdom, that.kingdom ) && Objects.equals( males, that.males ) && Objects.equals( id, that.id );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( kingdom, males, id );
  }
}
