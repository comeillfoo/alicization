package inc.mimik.alicization.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/api" )
public class ResidentsController {

  private static final Logger LOGGER = LoggerFactory.getLogger( ResidentsController.class );

  @GetMapping( path = "/get-resident/{name}" )
  public ResponseEntity<Object> getResident( @PathVariable String name ) {
    LOGGER.info( "\ngetResident: started" );
    LOGGER.info( "getResident: [ name={} ]", name );

    LOGGER.info( "getResident: creating stub" );
    final Object userStub = new Object() {
      public final int id = 0;
      public final String name = "John JohnSon";
    };
    LOGGER.info( "getResident: stub created" );

    LOGGER.info( "getResident: trying to return stub" );
    return new ResponseEntity<Object>( userStub, HttpStatus.OK );
  }
}