package inc.mimik.alicization.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table( name = "kingdoms_show_residents", schema = "s284733", catalog = "studs" )
public class KingdomsShowResidentsViewEntity {
  private Long id;
  private String name;
  private String sex;
  private String residentSuit;
  private String role;
  private String kingdom;

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
  @Column( name = "name" )
  public String getName( ) {
    return name;
  }

  public void setName( String name ) {
    this.name = name;
  }

  @Basic
  @Column( name = "sex" )
  public String getSex( ) {
    return sex;
  }

  public void setSex( String sex ) {
    this.sex = sex;
  }

  @Basic
  @Column( name = "resident_suit" )
  public String getResidentSuit( ) {
    return residentSuit;
  }

  public void setResidentSuit( String residentSuit ) {
    this.residentSuit = residentSuit;
  }

  @Basic
  @Column( name = "role" )
  public String getRole( ) {
    return role;
  }

  public void setRole( String role ) {
    this.role = role;
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
    KingdomsShowResidentsViewEntity that = ( KingdomsShowResidentsViewEntity ) o;
    return Objects.equals( id, that.id ) && Objects.equals( name, that.name ) && Objects.equals( sex, that.sex ) && Objects.equals( residentSuit, that.residentSuit ) && Objects.equals( role, that.role ) && Objects.equals( kingdom, that.kingdom );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( id, name, sex, residentSuit, role, kingdom );
  }
}
