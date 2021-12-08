package inc.mimik.alicization.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table( name = "registrations", schema = "s284733", catalog = "studs" )
public class RegistrationsEntity {
  private int id;
  private Date issueDate;
  private Date expiryDate;

  @Id
  @Column( name = "id" )
  public int getId( ) {
    return id;
  }

  public void setId( int id ) {
    this.id = id;
  }

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

  @Override
  public boolean equals( Object o ) {
    if ( this == o ) return true;
    if ( o == null || getClass( ) != o.getClass( ) ) return false;
    RegistrationsEntity that = ( RegistrationsEntity ) o;
    return id == that.id && Objects.equals( issueDate, that.issueDate ) && Objects.equals( expiryDate, that.expiryDate );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( id, issueDate, expiryDate );
  }
}
