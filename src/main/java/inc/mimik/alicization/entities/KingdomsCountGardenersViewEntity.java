package inc.mimik.alicization.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table( name = "kingdoms_count_gardeners", schema = "s284733", catalog = "studs" )
public class KingdomsCountGardenersViewEntity {
  private Long gardeners;
  private Long id;
  private String kingdom;

  @Basic
  @Column( name = "gardeners" )
  public Long getGardeners( ) {
    return gardeners;
  }

  public void setGardeners( Long gardeners ) {
    this.gardeners = gardeners;
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
    KingdomsCountGardenersViewEntity that = ( KingdomsCountGardenersViewEntity ) o;
    return Objects.equals( gardeners, that.gardeners ) && Objects.equals( id, that.id ) && Objects.equals( kingdom, that.kingdom );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( gardeners, id, kingdom );
  }
}
