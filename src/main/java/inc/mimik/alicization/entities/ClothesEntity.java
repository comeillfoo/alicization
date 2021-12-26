package inc.mimik.alicization.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table( name = "clothes", schema = "s284733", catalog = "studs" )
public class ClothesEntity {
  private int id;
  private Integer fkResidentId;
  private int fkPatternId;
  private String fkColourName;
  private int density;
  private String fkTypeName;

  @Id
  @Column( name = "id" )
  public int getId( ) {
    return id;
  }

  public void setId( int id ) {
    this.id = id;
  }

  @Basic
  @Column( name = "fk_resident_id" )
  public Integer getFkResidentId( ) {
    return fkResidentId;
  }

  public void setFkResidentId( Integer fkResidentId ) {
    this.fkResidentId = fkResidentId;
  }

  @Basic
  @Column( name = "fk_pattern_id" )
  public int getFkPatternId( ) {
    return fkPatternId;
  }

  public void setFkPatternId( int fkPatternId ) {
    this.fkPatternId = fkPatternId;
  }

  @Basic
  @Column( name = "fk_colour_name" )
  public String getFkColourName( ) {
    return fkColourName;
  }

  public void setFkColourName( String fkColourName ) {
    this.fkColourName = fkColourName;
  }

  @Basic
  @Column( name = "density" )
  public int getDensity( ) {
    return density;
  }

  public void setDensity( int density ) {
    this.density = density;
  }

  @Basic
  @Column( name = "fk_type_name" )
  public String getFkTypeName( ) {
    return fkTypeName;
  }

  public void setFkTypeName( String fkTypeName ) {
    this.fkTypeName = fkTypeName;
  }

  @Override
  public boolean equals( Object o ) {
    if ( this == o ) return true;
    if ( o == null || getClass( ) != o.getClass( ) ) return false;
    ClothesEntity that = ( ClothesEntity ) o;
    return id == that.id && fkPatternId == that.fkPatternId && density == that.density && Objects.equals( fkResidentId, that.fkResidentId ) && Objects.equals( fkColourName, that.fkColourName ) && Objects.equals( fkTypeName, that.fkTypeName );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( id, fkResidentId, fkPatternId, fkColourName, density, fkTypeName );
  }
}
