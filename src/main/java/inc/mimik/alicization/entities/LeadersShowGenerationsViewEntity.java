package inc.mimik.alicization.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table( name = "leaders_show_generations", schema = "s284733", catalog = "studs" )
public class LeadersShowGenerationsViewEntity {
  private String fkSuitName;
  private Date kingdomReignEnddate;
  private String name;
  private String fkSexName;

  @Id
  @Basic
  @Column( name = "fk_suit_name" )
  public String getFkSuitName( ) {
    return fkSuitName;
  }

  public void setFkSuitName( String fkSuitName ) {
    this.fkSuitName = fkSuitName;
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
  @Column( name = "name" )
  public String getName( ) {
    return name;
  }

  public void setName( String name ) {
    this.name = name;
  }

  @Basic
  @Column( name = "fk_sex_name" )
  public String getFkSexName( ) {
    return fkSexName;
  }

  public void setFkSexName( String fkSexName ) {
    this.fkSexName = fkSexName;
  }

  @Override
  public boolean equals( Object o ) {
    if ( this == o ) return true;
    if ( o == null || getClass( ) != o.getClass( ) ) return false;
    LeadersShowGenerationsViewEntity that = ( LeadersShowGenerationsViewEntity ) o;
    return Objects.equals( fkSuitName, that.fkSuitName ) && Objects.equals( kingdomReignEnddate, that.kingdomReignEnddate ) && Objects.equals( name, that.name ) && Objects.equals( fkSexName, that.fkSexName );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( fkSuitName, kingdomReignEnddate, name, fkSexName );
  }
}
