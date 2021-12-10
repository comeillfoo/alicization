package inc.mimik.alicization.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table( name = "weapons", schema = "s284733", catalog = "studs" )
public class WeaponsEntity {
  private int fkKingdomId;
  private int id;
  private String name;
  private int fkResidentId;

  @Basic
  @Column( name = "fk_kingdom_id" )
  public int getFkKingdomId( ) {
    return fkKingdomId;
  }

  public void setFkKingdomId( int fkKingdomId ) {
    this.fkKingdomId = fkKingdomId;
  }

  @Id
  @Column( name = "id" )
  public int getId( ) {
    return id;
  }

  public void setId( int id ) {
    this.id = id;
  }

  @Basic
  @Column( name = "name" )
  public String getName( ) {
    return name;
  }

  public void setName( String name ) {
    this.name = name;
  }

  @Basic
  @Column( name = "fk_resident_id" )
  public int getFkResidentId( ) {
    return fkResidentId;
  }

  public void setFkResidentId( int fkResidentId ) {
    this.fkResidentId = fkResidentId;
  }

  @Override
  public boolean equals( Object o ) {
    if ( this == o ) return true;
    if ( o == null || getClass( ) != o.getClass( ) ) return false;
    WeaponsEntity that = ( WeaponsEntity ) o;
    return fkKingdomId == that.fkKingdomId && id == that.id && fkResidentId == that.fkResidentId && Objects.equals( name, that.name );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( fkKingdomId, id, name, fkResidentId );
  }
}
