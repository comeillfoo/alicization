package inc.mimik.alicization.controllers;

import inc.mimik.alicization.entities.RolesEntity;
import inc.mimik.alicization.services.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping( "/api" )
public class RolesController {

  private RolesService rolesService;

  public RolesController( @Autowired RolesService rolesService ) {
    this.rolesService = rolesService;
  }

  @GetMapping( path="get-all-roles" )
  public ResponseEntity<List<RolesEntity>> getRoles() {
    return new ResponseEntity<>( rolesService.getAll(), HttpStatus.OK );
  }
}
