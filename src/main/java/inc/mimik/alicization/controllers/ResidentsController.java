package inc.mimik.alicization.controllers;

import inc.mimik.alicization.entities.*;
import inc.mimik.alicization.models.RenamingResidentModel;
import inc.mimik.alicization.services.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//import javax.xml.ws.Response;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping( "/api" )
public class ResidentsController {

  private ResidentsService residentsService;
  private ResidencesService residencesService;
  private RegistrationsService registrationsService;
  private WeaponsService weaponsService;
  private ToolsService toolsService;
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
    LOGGER.info( "\ngetResidentsRegistrations[ {} ]: trying to get residences", id );
    List<ResidencesEntity> residentsRecords = residencesService.findAllByFkResidentId( id );
    List<Integer> registrationsIds = residentsRecords
        .stream( )
        .map( ResidencesEntity::getFkRegistrationId )
        .collect( Collectors.toList() );
    return new ResponseEntity<>( registrationsService.findAllByIdIn( registrationsIds ), HttpStatus.OK );
  }

  @GetMapping( path = "/get-tools-by-resident-id/{id}" )
  public ResponseEntity<List<ToolsEntity>> getToolsByResidentId( @PathVariable int id ) {
    LOGGER.info( "\ngetToolsByResidentId[ {} ]: started", id );
    LOGGER.info( "\ngetToolsByResidentId[ {} ]: trying to get tools", id );
    return new ResponseEntity<>( toolsService.findAllByFkResidentId( id ), HttpStatus.OK );
  }

  @GetMapping( path = "/get-weapons-by-resident-id/{id}" )
  public ResponseEntity<List<WeaponsEntity>> getWeaponsByResidentId( @PathVariable int id ) {
    LOGGER.info( "\ngetWeaponsByResidentId[ {} ]: started", id );
    LOGGER.info( "\ngetWeaponsByResidentId[ {} ]: trying to get weapons", id );
    return new ResponseEntity<>( weaponsService.findAllByFkResidentId( id ), HttpStatus.OK );
  }

  @PostMapping( path = "/update-resident-name-by-id", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
  public ResponseEntity<ResidentsEntity> updateResidentNameById( @RequestBody RenamingResidentModel renamedRequest ) {
    LOGGER.info( "\nupdateResidentNameById[ {} ]: started", renamedRequest.getId() );
    LOGGER.info( "\nupdateResidentNameById[ {} ]: trying to rename", renamedRequest.getId() );
    final int updated = residentsService.updateResidentNameById( renamedRequest.getId(), renamedRequest.getName() );
    HttpStatus status = updated > 0? HttpStatus.OK : HttpStatus.BAD_REQUEST;
    LOGGER.info( "\nupdateResidentNameById[ {} ]: renamed {}", renamedRequest.getId(), updated );
    return new ResponseEntity<>( residentsService.getById( renamedRequest.getId() ), status );
  }

  @DeleteMapping( path = "/delete-resident-by-id/{id}" )
  public ResponseEntity<?> deleteResidentById( @PathVariable int id ) {
    LOGGER.info( "\ndeleteResidentById[ {} ]: deleting started", id );
    residentsService.deleteById( id );
    LOGGER.info( "\ndeleteResidentById[ {} ]: successfully deleted resident", id );
    return new ResponseEntity<>( null, HttpStatus.OK );
  }

  @DeleteMapping( path = "/delete-resident-tool-by-id/{id}" )
  public ResponseEntity<?> deleteResidentToolById( @PathVariable int id ) {
    LOGGER.info( "\ndeleteResidentToolById[ {} ]: deleting started", id );
    toolsService.deleteById( id );
    LOGGER.info( "\ndeleteResidentToolById[ {} ]: successfully deleted resident's tool", id );
    return new ResponseEntity<>( null, HttpStatus.OK );
  }

  @DeleteMapping( path = "/delete-resident-weapon-by-id/{id}" )
  public ResponseEntity<?> deleteResidentWeaponById( @PathVariable int id ) {
    LOGGER.info( "\ndeleteResidentWeaponById[ {} ]: deleting started", id );
    weaponsService.deleteById( id );
    LOGGER.info( "\ndeleteResidentWeaponById[ {} ]: successfully deleted resident's weapon", id );
    return new ResponseEntity<>( null, HttpStatus.OK );
  }

  public ResidentsController( @Autowired ResidentsService residentsService,
                              @Autowired ResidencesService residencesService,
                              @Autowired RegistrationsService registrationsService,
                              @Autowired WeaponsService weaponsService,
                              @Autowired ToolsService toolsService ) {
    this.residentsService = residentsService;
    this.residencesService = residencesService;
    this.registrationsService = registrationsService;
    this.weaponsService = weaponsService;
    this.toolsService = toolsService;
  }
}