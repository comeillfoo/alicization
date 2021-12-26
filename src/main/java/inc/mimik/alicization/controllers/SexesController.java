package inc.mimik.alicization.controllers;

import inc.mimik.alicization.entities.SexesEntity;
import inc.mimik.alicization.services.SexesService;
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
public class SexesController {

  private SexesService sexService;

  public SexesController( @Autowired SexesService sexService ) {
    this.sexService = sexService;
  }

  @GetMapping( path = "/get-all-sexes" )
  public ResponseEntity<List<SexesEntity>> getSexes() {
    return new ResponseEntity<>( sexService.getAll(), HttpStatus.OK );
  }
}
