package inc.mimik.alicization.controllers;

import inc.mimik.alicization.entities.ResidentsEntity;
import inc.mimik.alicization.services.ResidentsService;
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
public class ResidentsController {

  private ResidentsService service;
  private static final Logger LOGGER = LoggerFactory.getLogger( ResidentsController.class );

  @GetMapping( path = "/get-residents" )
  public ResponseEntity<List<ResidentsEntity>> getResidents( ) {
    LOGGER.info( "\ngetResidents: started" );

    LOGGER.info( "getResidents: trying to get all residents" );

    LOGGER.info( "getResidents: trying to return all residents" );
    return new ResponseEntity<>( service.getAll(), HttpStatus.OK );
  }

  @GetMapping( path = "/get-resident-by-id/{id}" )
  public ResponseEntity<ResidentsEntity> getResident( @PathVariable int id ) {
    LOGGER.info( "\ngetResident[ {} ]: started", id );
    LOGGER.info( "\ngetResident[ {} ]: trying to get resident", id );
    return new ResponseEntity<>( service.getById( id ), HttpStatus.OK );
  }

  public ResidentsController( @Autowired ResidentsService service ) {
    this.service = service;
  }
}