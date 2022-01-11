package inc.mimik.alicization.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@SequenceGenerator( name = "LID_SEQUENCE_GENERATOR",
    sequenceName = "leaders_id_seq",
    initialValue = 1,
    allocationSize = 1
)
@Table( name = "leaders", schema = "s284733", catalog = "studs" )
public class LeadersEntity {
  private int id;
  private int fkKingdomId;
  private Date kingdomReignEnddate;
  private int fkResidentId;
  private Integer fkCrownId;

  @Id
  @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "LID_SEQUENCE_GENERATOR" )
  @Column( name = "id" )
  public int getId( ) {
    return id;
  }

  public void setId( int id ) {
    this.id = id;
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
  @Column( name = "kingdom_reign_enddate" )
  public Date getKingdomReignEnddate( ) {
    return kingdomReignEnddate;
  }

  public void setKingdomReignEnddate( Date kingdomReignEnddate ) {
    this.kingdomReignEnddate = kingdomReignEnddate;
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
  @Column( name = "fk_crown_id" )
  public Integer getFkCrownId( ) {
    return fkCrownId;
  }

  public void setFkCrownId( Integer fkCrownId ) {
    this.fkCrownId = fkCrownId;
  }

  @Override
  public boolean equals( Object o ) {
    if ( this == o ) return true;
    if ( o == null || getClass( ) != o.getClass( ) ) return false;
    LeadersEntity that = ( LeadersEntity ) o;
    return id == that.id && fkKingdomId == that.fkKingdomId && fkResidentId == that.fkResidentId && Objects.equals( kingdomReignEnddate, that.kingdomReignEnddate ) && Objects.equals( fkCrownId, that.fkCrownId );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( id, fkKingdomId, kingdomReignEnddate, fkResidentId, fkCrownId );
  }
}
