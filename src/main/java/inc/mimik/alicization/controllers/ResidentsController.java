package inc.mimik.alicization.controllers;

import inc.mimik.alicization.entities.ResidentsEntity;
import inc.mimik.alicization.services.ResidentsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( "/api" )
public class ResidentsController {

  private ResidentsService service;
  private static final Logger LOGGER = LoggerFactory.getLogger( ResidentsController.class );

  @GetMapping( path = "/get-residents" )
  public ResponseEntity<List<ResidentsEntity>> getResidents( ) {
    LOGGER.info( "\ngetResident: started" );

    LOGGER.info( "getResident: trying to get all residents" );

    LOGGER.info( "getResident: trying to return all residents" );
    return new ResponseEntity<List<ResidentsEntity>>( service.getAll(), HttpStatus.OK );
  }

  public ResidentsController( @Autowired ResidentsService service ) {
    this.service = service;
  }
}