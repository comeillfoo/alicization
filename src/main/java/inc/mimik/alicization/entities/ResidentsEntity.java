package inc.mimik.alicization.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@SequenceGenerator( name = "RID_SEQUENCE_GENERATOR",
    sequenceName = "residents_id_seq",
    initialValue = 1,
    allocationSize = 1
)
@Table( name = "residents", schema = "s284733", catalog = "studs" )
public class ResidentsEntity {
  private String name;
  private int id;
  private String fkSuitName;
  private String fkRoleName;
  private String fkSexName;

  @Basic
  @Column( name = "name" )
  public String getName( ) {
    return name;
  }

  public void setName( String name ) {
    this.name = name;
  }

  @Id
  @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "RID_SEQUENCE_GENERATOR" )
  @Column( name = "id" )
  public int getId( ) {
    return id;
  }

  public void setId( int id ) {
    this.id = id;
  }

  @Basic
  @Column( name = "fk_suit_name" )
  public String getFkSuitName( ) {
    return fkSuitName;
  }

  public void setFkSuitName( String fkSuitName ) {
    this.fkSuitName = fkSuitName;
  }

  @Basic
  @Column( name = "fk_role_name" )
  public String getFkRoleName( ) {
    return fkRoleName;
  }

  public void setFkRoleName( String fkRoleName ) {
    this.fkRoleName = fkRoleName;
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
    ResidentsEntity that = ( ResidentsEntity ) o;
    return id == that.id && Objects.equals( name, that.name ) && Objects.equals( fkSuitName, that.fkSuitName ) && Objects.equals( fkRoleName, that.fkRoleName ) && Objects.equals( fkSexName, that.fkSexName );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( name, id, fkSuitName, fkRoleName, fkSexName );
  }
}
