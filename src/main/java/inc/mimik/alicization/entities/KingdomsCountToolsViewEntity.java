package inc.mimik.alicization.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table( name = "kingdoms_count_tools", schema = "s284733", catalog = "studs" )
public class KingdomsCountToolsViewEntity {
  private Long id;
  private String kingdom;
  private Long toolsNumber;

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
  @Column( name = "tools_number" )
  public Long getToolsNumber( ) {
    return toolsNumber;
  }

  public void setToolsNumber( Long toolsNumber ) {
    this.toolsNumber = toolsNumber;
  }

  @Override
  public boolean equals( Object o ) {
    if ( this == o ) return true;
    if ( o == null || getClass( ) != o.getClass( ) ) return false;
    KingdomsCountToolsViewEntity that = ( KingdomsCountToolsViewEntity ) o;
    return Objects.equals( id, that.id ) && Objects.equals( kingdom, that.kingdom ) && Objects.equals( toolsNumber, that.toolsNumber );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( id, kingdom, toolsNumber );
  }
}
