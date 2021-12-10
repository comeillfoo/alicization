package inc.mimik.alicization.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table( name = "clothes_catalogue", schema = "s284733", catalog = "studs" )
public class ClothesCatalogueViewEntity {
  private String colour;
  private String type;
  private Integer patternDensity;
  private String patternName;
  private Integer item;
  private Long id;

  @Basic
  @Column( name = "colour" )
  public String getColour( ) {
    return colour;
  }

  public void setColour( String colour ) {
    this.colour = colour;
  }

  @Basic
  @Column( name = "type" )
  public String getType( ) {
    return type;
  }

  public void setType( String type ) {
    this.type = type;
  }

  @Basic
  @Column( name = "pattern_density" )
  public Integer getPatternDensity( ) {
    return patternDensity;
  }

  public void setPatternDensity( Integer patternDensity ) {
    this.patternDensity = patternDensity;
  }

  @Basic
  @Column( name = "pattern_name" )
  public String getPatternName( ) {
    return patternName;
  }

  public void setPatternName( String patternName ) {
    this.patternName = patternName;
  }

  @Basic
  @Column( name = "item" )
  public Integer getItem( ) {
    return item;
  }

  public void setItem( Integer item ) {
    this.item = item;
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
    ClothesCatalogueViewEntity that = ( ClothesCatalogueViewEntity ) o;
    return Objects.equals( colour, that.colour ) && Objects.equals( type, that.type ) && Objects.equals( patternDensity, that.patternDensity ) && Objects.equals( patternName, that.patternName ) && Objects.equals( item, that.item ) && Objects.equals( id, that.id );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( colour, type, patternDensity, patternName, item, id );
  }
}
