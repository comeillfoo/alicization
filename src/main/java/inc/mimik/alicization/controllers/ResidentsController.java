package inc.mimik.alicization.controllers;

import inc.mimik.alicization.entities.*;
import inc.mimik.alicization.models.*;
import inc.mimik.alicization.services.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//import javax.xml.ws.Response;
import java.sql.Date;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
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
  private LeadersService leadersService;
  private KingdomsService kingdomsService;
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
    final HttpStatus status = updated > 0? HttpStatus.OK : HttpStatus.BAD_REQUEST;
    LOGGER.info( "\nupdateResidentNameById[ {} ]: renamed {}", renamedRequest.getId(), updated );
    return new ResponseEntity<>( residentsService.getById( renamedRequest.getId() ), status );
  }

  @PostMapping( path = "/visit-to-kingdom", consumes = MediaType.APPLICATION_JSON_VALUE )
  public ResponseEntity<?> visitToKingdom( @RequestBody ToVisitRegistrationModel visitKingdom ) {
    LOGGER.info( "\nvisitToKingdom[ {} ]: started", visitKingdom.getDestKingdom() );
    LOGGER.info( "\nvisitToKingdom[ {} ]: trying to visit", visitKingdom.getDestKingdom() );
    final int result = registrationsService.visit( visitKingdom.getResidentId(), visitKingdom.getSpanDays(), visitKingdom.getDestKingdom() );
    final HttpStatus status = result == 1? HttpStatus.OK : HttpStatus.BAD_REQUEST;
    return new ResponseEntity<>( null, status );
  }

  @PostMapping( path = "/add-new-tool", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
  public ResponseEntity<ToolsEntity> addNewTool( @RequestBody NewToolModel newTool ) {
    LOGGER.info( "\naddNewTool[ {} ]: started", newTool.getResidentId() );
    LOGGER.info( "\naddNewTool[ {} ]: trying to add", newTool.getResidentId() );
    final ToolsEntity result = toolsService.addNewTool( newTool.getResidentId( ), newTool.getName( ), newTool.getSuit( ) );
    return new ResponseEntity<>( result, HttpStatus.OK );
  }

  @PostMapping(path = "add-new-registration", consumes = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<?> addNewRegistration(@RequestBody ToMoveResidentModel newRegistration) {
    LOGGER.info( "\nmoveToKingdom[ {} ]: started", newRegistration.getDestKingdom() );
    LOGGER.info( "\nmoveToKingdom[ {} ]: trying to move", newRegistration.getDestKingdom() );
    final int result = registrationsService.residentMove( newRegistration.getResidentId(), newRegistration.getDestKingdom() );
    final HttpStatus status = result == 1? HttpStatus.OK : HttpStatus.BAD_REQUEST;
    return new ResponseEntity<>(null, status);
  }

  @PostMapping( path = "/add-new-weapon", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
  public ResponseEntity<WeaponsEntity> addNewWeapon( @RequestBody NewWeaponModel newWeapon ) {
    LOGGER.info( "\naddNewWeapon[ {} ]: started", newWeapon.getResidentId() );
    LOGGER.info( "\naddNewWeapon[ {} ]: trying to add", newWeapon.getResidentId() );
    final WeaponsEntity result = weaponsService.addNewWeapon( newWeapon.getResidentId( ), newWeapon.getName( ), newWeapon.getSuit( ) );
    return new ResponseEntity<>( result, HttpStatus.OK );
  }

  @PostMapping( path = "/add-new-resident", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
  public ResponseEntity<ResidentsEntity> addNewResident( @RequestBody NewResidentModel newResident ) {
    LOGGER.info( "\naddNewResident[ {} ]: started", newResident.getName() );
    LOGGER.info( "\naddNewResident[ {} ]: trying to add", newResident.getName() );
    final ResidentsEntity result = residentsService.addNewResident( newResident.getName(),
        newResident.getFkSexName(),
        newResident.getFkSuitName(),
        newResident.getFkRoleName()
    );

    if ( Objects.equals( result.getFkRoleName( ), "правитель" ) ) {
      LOGGER.info( "\naddNewResident[ {} ]: trying to add new leader", result.getId() );
      final KingdomsEntity kingdom = kingdomsService.findAllKingdoms().stream().filter( ( k ) -> ( Objects.equals( k.getFkSuitName( ), result.getFkSuitName( ) ) ) ).findAny().get();
      LeadersEntity leader = leadersService.addNewLeader( result.getId(), kingdom.getId(), new Date( System.currentTimeMillis() ), null );
      LOGGER.info( "\naddNewResident[ {} ]: succcessfully added new leader[ {} ]", leader.getFkResidentId(), leader.getId() );
      LOGGER.info( "\naddNewResident[ {} ]: trying to coronate new leader", leader.getFkResidentId() );
      final int is_coronate = leadersService.coronate( leader.getId() );
      LOGGER.info( "\naddNewResident[ {} ]: added [ {] ]", leader.getId(), is_coronate );
      LOGGER.info( "\naddNewResident[ {} ]: successfully coronated new leader", leader.getFkResidentId() );
    }
    return new ResponseEntity<>( result, HttpStatus.OK );
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

  @DeleteMapping( path = "/delete-resident-registration-by-id/{id}" )
  public ResponseEntity<?> deleteResidentRegistrationById( @PathVariable int id ) {
    LOGGER.info( "\ndeleteResidentRegistrationById[ {} ]: deleting started", id );
    registrationsService.deleteById( id );
    LOGGER.info( "\ndeleteResidentRegistrationById[ {} ]: successfully deleted resident's registration", id );
    return new ResponseEntity<>( null, HttpStatus.OK );
  }

  public ResidentsController( @Autowired ResidentsService residentsService,
                              @Autowired ResidencesService residencesService,
                              @Autowired RegistrationsService registrationsService,
                              @Autowired WeaponsService weaponsService,
                              @Autowired ToolsService toolsService,
                              @Autowired LeadersService leadersService,
                              @Autowired KingdomsService kingdomsService ) {
    this.residentsService = residentsService;
    this.residencesService = residencesService;
    this.registrationsService = registrationsService;
    this.weaponsService = weaponsService;
    this.toolsService = toolsService;
    this.leadersService = leadersService;
    this.kingdomsService = kingdomsService;
  }
}