package inc.mimik.alicization.controllers;

import inc.mimik.alicization.entities.RegistrationsEntity;
import inc.mimik.alicization.entities.ResidencesEntity;
import inc.mimik.alicization.entities.ResidentsEntity;
import inc.mimik.alicization.services.RegistrationsService;
import inc.mimik.alicization.services.ResidencesService;
import inc.mimik.alicization.services.ResidentsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping( "/api" )
public class ResidentsController {

  private ResidentsService residentsService;
  private ResidencesService residencesService;
  private RegistrationsService registrationsService;
  private static final Logger LOGGER = LoggerFactory.getLogger( ResidentsController.class );

  @GetMapping( path = "/get-residents" )
  public ResponseEntity<List<ResidentsEntity>> getResidents( ) {
    LOGGER.info( "\ngetResidents: started" );

    LOGGER.info( "getResidents: trying to get all residents" );

    LOGGER.info( "getResidents: trying to return all residents" );
    return new ResponseEntity<>( residentsService.getAll(), HttpStatus.OK );
  }

  @GetMapping( path = "/get-resident-by-id/{id}" )
  public ResponseEntity<ResidentsEntity> getResident( @PathVariable int id ) {
    LOGGER.info( "\ngetResident[ {} ]: started", id );
    LOGGER.info( "\ngetResident[ {} ]: trying to get resident", id );
    return new ResponseEntity<>( residentsService.getById( id ), HttpStatus.OK );
  }

  @GetMapping( path = "/get-residents-registrations/{id}" )
  public ResponseEntity<List<RegistrationsEntity>> getResidentsRegistrations( @PathVariable int id ) {
    LOGGER.info( "\ngetResidentsRegistrations[ {} ]: started", id );
    LOGGER.info( "\ngetResidentsRegistrations[ {} ]: trying to get resident", id );
    List<ResidencesEntity> residentsRecords = residencesService.findAllByFkResidentId( id );
    List<Integer> registrationsIds = residentsRecords
        .stream( )
        .map( ResidencesEntity::getFkRegistrationId )
        .collect( Collectors.toList() );
    return new ResponseEntity<>( registrationsService.findAllByIdIn( registrationsIds ), HttpStatus.OK );
  }

  public ResidentsController( @Autowired ResidentsService residentsService,
                              @Autowired ResidencesService residencesService,
                              @Autowired RegistrationsService registrationsService ) {
    this.residentsService = residentsService;
    this.residencesService = residencesService;
    this.registrationsService = registrationsService;
  }
}