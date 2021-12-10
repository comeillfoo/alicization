package inc.mimik.alicization.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table( name = "patterns", schema = "s284733", catalog = "studs" )
public class PatternsEntity {
  private String description;
  private int id;

  @Basic
  @Column( name = "description" )
  public String getDescription( ) {
    return description;
  }

  public void setDescription( String description ) {
    this.description = description;
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
    PatternsEntity that = ( PatternsEntity ) o;
    return id == that.id && Objects.equals( description, that.description );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( description, id );
  }
}
