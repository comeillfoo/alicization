package inc.mimik.alicization.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table( name = "leaders", schema = "s284733", catalog = "studs" )
public class LeadersEntity {
  private int id;
  private Date kingdomReignEnddate;

  @Id
  @Column( name = "id" )
  public int getId( ) {
    return id;
  }

  public void setId( int id ) {
    this.id = id;
  }

  @Basic
  @Column( name = "kingdom_reign_enddate" )
  public Date getKingdomReignEnddate( ) {
    return kingdomReignEnddate;
  }

  public void setKingdomReignEnddate( Date kingdomReignEnddate ) {
    this.kingdomReignEnddate = kingdomReignEnddate;
  }

  @Override
  public boolean equals( Object o ) {
    if ( this == o ) return true;
    if ( o == null || getClass( ) != o.getClass( ) ) return false;
    LeadersEntity that = ( LeadersEntity ) o;
    return id == that.id && Objects.equals( kingdomReignEnddate, that.kingdomReignEnddate );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( id, kingdomReignEnddate );
  }
}
