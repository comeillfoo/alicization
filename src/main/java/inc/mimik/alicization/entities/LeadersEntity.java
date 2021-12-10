package inc.mimik.alicization.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table( name = "leaders", schema = "s284733", catalog = "studs" )
public class LeadersEntity {
  private int fkKingdomId;
  private Integer fkCrownId;
  private int id;
  private int fkResidentId;
  private Date kingdomReignEnddate;

  @Basic
  @Column( name = "fk_kingdom_id" )
  public int getFkKingdomId( ) {
    return fkKingdomId;
  }

  public void setFkKingdomId( int fkKingdomId ) {
    this.fkKingdomId = fkKingdomId;
  }

  @Basic
  @Column( name = "fk_crown_id" )
  public Integer getFkCrownId( ) {
    return fkCrownId;
  }

  public void setFkCrownId( Integer fkCrownId ) {
    this.fkCrownId = fkCrownId;
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
  @Column( name = "fk_resident_id" )
  public int getFkResidentId( ) {
    return fkResidentId;
  }

  public void setFkResidentId( int fkResidentId ) {
    this.fkResidentId = fkResidentId;
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
    return fkKingdomId == that.fkKingdomId && id == that.id && fkResidentId == that.fkResidentId && Objects.equals( fkCrownId, that.fkCrownId ) && Objects.equals( kingdomReignEnddate, that.kingdomReignEnddate );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( fkKingdomId, fkCrownId, id, fkResidentId, kingdomReignEnddate );
  }
}
