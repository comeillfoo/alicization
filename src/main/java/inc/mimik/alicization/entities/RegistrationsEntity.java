package inc.mimik.alicization.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table( name = "registrations", schema = "s284733", catalog = "studs" )
public class RegistrationsEntity {
  private Date issueDate;
  private Date expiryDate;
  private int fkKingdomId;
  private int id;

  @Basic
  @Column( name = "issue_date" )
  public Date getIssueDate( ) {
    return issueDate;
  }

  public void setIssueDate( Date issueDate ) {
    this.issueDate = issueDate;
  }

  @Basic
  @Column( name = "expiry_date" )
  public Date getExpiryDate( ) {
    return expiryDate;
  }

  public void setExpiryDate( Date expiryDate ) {
    this.expiryDate = expiryDate;
  }

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

  @Override
  public boolean equals( Object o ) {
    if ( this == o ) return true;
    if ( o == null || getClass( ) != o.getClass( ) ) return false;
    RegistrationsEntity that = ( RegistrationsEntity ) o;
    return fkKingdomId == that.fkKingdomId && id == that.id && Objects.equals( issueDate, that.issueDate ) && Objects.equals( expiryDate, that.expiryDate );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( issueDate, expiryDate, fkKingdomId, id );
  }
}
