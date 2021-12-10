package inc.mimik.alicization.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table( name = "tools", schema = "s284733", catalog = "studs" )
public class ToolsEntity {
  private int id;
  private int fkResidentId;
  private int fkKingdomId;
  private String name;

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
  public int getFkResidentId( ) {
    return fkResidentId;
  }

  public void setFkResidentId( int fkResidentId ) {
    this.fkResidentId = fkResidentId;
  }

  @Basic
  @Column( name = "fk_kingdom_id" )
  public int getFkKingdomId( ) {
    return fkKingdomId;
  }

  public void setFkKingdomId( int fkKingdomId ) {
    this.fkKingdomId = fkKingdomId;
  }

  @Basic
  @Column( name = "name" )
  public String getName( ) {
    return name;
  }

  public void setName( String name ) {
    this.name = name;
  }

  @Override
  public boolean equals( Object o ) {
    if ( this == o ) return true;
    if ( o == null || getClass( ) != o.getClass( ) ) return false;
    ToolsEntity that = ( ToolsEntity ) o;
    return id == that.id && fkResidentId == that.fkResidentId && fkKingdomId == that.fkKingdomId && Objects.equals( name, that.name );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( id, fkResidentId, fkKingdomId, name );
  }
}
