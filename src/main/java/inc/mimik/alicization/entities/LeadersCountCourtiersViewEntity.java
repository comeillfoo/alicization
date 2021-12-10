package inc.mimik.alicization.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table( name = "leaders_count_courtiers", schema = "s284733", catalog = "studs" )
public class LeadersCountCourtiersViewEntity {
  private Long id;
  private String name;
  private Long courtier;
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
  @Column( name = "courtier" )
  public Long getCourtier( ) {
    return courtier;
  }

  public void setCourtier( Long courtier ) {
    this.courtier = courtier;
  }

  @Override
  public boolean equals( Object o ) {
    if ( this == o ) return true;
    if ( o == null || getClass( ) != o.getClass( ) ) return false;
    LeadersCountCourtiersViewEntity that = ( LeadersCountCourtiersViewEntity ) o;
    return Objects.equals( id, that.id ) && Objects.equals( name, that.name ) && Objects.equals( courtier, that.courtier );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( id, name, courtier );
  }
}
