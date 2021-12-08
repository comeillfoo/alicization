package inc.mimik.alicization.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table( name = "suits", schema = "s284733", catalog = "studs" )
public class SuitsEntity {
  private String name;

  @Id
  @Column( name = "name" )
  public String getName( ) {
    return name;
  }

  public void setName( String name ) {
    this.name = name;
  }

  @Override
  public boolean equals( Object o ) {
    if ( this == o ) return true;
    if ( o == null || getClass( ) != o.getClass( ) ) return false;
    SuitsEntity that = ( SuitsEntity ) o;
    return Objects.equals( name, that.name );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( name );
  }
}
