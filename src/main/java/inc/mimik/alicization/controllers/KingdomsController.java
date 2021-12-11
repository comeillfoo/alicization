package inc.mimik.alicization.controllers;

import inc.mimik.alicization.entities.KingdomsEntity;
import inc.mimik.alicization.services.KingdomsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping( "/api" )
public class KingdomsController {

  private KingdomsService kingdomsService;
  private static final Logger LOGGER = LoggerFactory.getLogger( KingdomsController.class );

  @GetMapping( path = "/get-kingdom-by-id/{id}" )
  public ResponseEntity<KingdomsEntity> getKingdomById( @PathVariable int id ) {
    LOGGER.info( "\ngetKingdomById[ {} ]: started", id );

    LOGGER.info( "getKingdomById[ {} ]: trying to get kingdom", id );
    return new ResponseEntity<>( kingdomsService.findKingdomById( id ), HttpStatus.OK );
  }

  @GetMapping( path = "/get-kingdoms" )
  public ResponseEntity<List<KingdomsEntity>> getKingdoms() {
    LOGGER.info( "\ngetKingdoms: started" );

    LOGGER.info( "getKingdoms: trying to get kingdom" );
    return new ResponseEntity<>( kingdomsService.findAllKingdoms(), HttpStatus.OK );
  }

  public KingdomsController( @Autowired KingdomsService kingdomsService ) {
    this.kingdomsService = kingdomsService;
  }
}
