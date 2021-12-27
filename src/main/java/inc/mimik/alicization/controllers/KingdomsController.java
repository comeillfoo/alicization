package inc.mimik.alicization.controllers;

import inc.mimik.alicization.entities.*;
import inc.mimik.alicization.services.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class KingdomsController {

    private final KingdomsService kingdomsService;
    private final KingdomCountFemalesViewService kingdomCountFemalesViewService;
    private final KingdomCountMalesViewService kingdomCountMalesViewService;
    private final KingdomCountWeaponsService kingdomCountWeaponsService;
    private final KingdomCountToolsViewService kingdomCountToolsViewService;


    private static final Logger LOGGER = LoggerFactory.getLogger(KingdomsController.class);

    @GetMapping(path = "/get-kingdom-by-id/{id}")
    public ResponseEntity<KingdomsEntity> getKingdomById(@PathVariable int id) {
        LOGGER.info("\ngetKingdomById[ {} ]: started", id);

        LOGGER.info("getKingdomById[ {} ]: trying to get kingdom", id);
        return new ResponseEntity<>(kingdomsService.findKingdomById(id), HttpStatus.OK);
    }

    @GetMapping(path = "/get-kingdoms")
    public ResponseEntity<List<KingdomsEntity>> getKingdoms() {
        LOGGER.info("\ngetKingdoms: started");

        LOGGER.info("getKingdoms: trying to get kingdom");
        return new ResponseEntity<>(kingdomsService.findAllKingdoms(), HttpStatus.OK);
    }

    @GetMapping(path = "/get-females-count/{kingdom}")
    public ResponseEntity<KingdomsCountFemalesViewEntity> getFemales(@PathVariable String kingdom) {
        LOGGER.info("\n Kingdom-getFemales: start");
        LOGGER.info("\n Kingdom-getFemales: trying to get females count from {}", kingdom);

        return new ResponseEntity<>(kingdomCountFemalesViewService.findByKingdom(kingdom), HttpStatus.OK);
    }

    @GetMapping("/get-females-count")
    public ResponseEntity<List<KingdomsCountFemalesViewEntity>> getFemales() {
        LOGGER.info("\n Kingdom-getFemales: start");

        LOGGER.info("\n Kingdom-getFemales: trying to get females count");

        return new ResponseEntity<>(kingdomCountFemalesViewService.findAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/get-males-count/{kingdom}")
    public ResponseEntity<KingdomsCountMalesViewEntity> getMales(@PathVariable String kingdom) {
        LOGGER.info("\n Kingdom-getMales: start");
        LOGGER.info("\n Kingdom-getMales: trying to get females count from {}", kingdom);

        return new ResponseEntity<>(kingdomCountMalesViewService.findByKingdom(kingdom), HttpStatus.OK);
    }

    @GetMapping("/get-males-count")
    public ResponseEntity<List<KingdomsCountMalesViewEntity>> getMales() {
        LOGGER.info("\n Kingdom-getMales: start");

        LOGGER.info("\n Kingdom-getMales: trying to get females count");

        return new ResponseEntity<>(kingdomCountMalesViewService.findAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/get-weapons-count/{kingdom}")
    public ResponseEntity<KingdomsCountWeaponsViewEntity> getWeapons(@PathVariable String kingdom) {
        LOGGER.info("\n Kingdom-getWeapons: start");
        LOGGER.info("\n Kingdom-getWeapons: trying to get females count from {}", kingdom);

        return new ResponseEntity<>(kingdomCountWeaponsService.findByKingdom(kingdom), HttpStatus.OK);
    }

    @GetMapping("/get-weapons-count")
    public ResponseEntity<List<KingdomsCountWeaponsViewEntity>> getWeapons() {
        LOGGER.info("\n Kingdom-getWeapons: start");

        LOGGER.info("\n Kingdom-getWeapons: trying to get females count");

        return new ResponseEntity<>(kingdomCountWeaponsService.findAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/get-tools-count/{kingdom}")
    public ResponseEntity<KingdomsCountToolsViewEntity> getTools(@PathVariable String kingdom) {
        LOGGER.info("\n Kingdom-getTools: start");
        LOGGER.info("\n Kingdom-getTools: trying to get females count from {}", kingdom);

        return new ResponseEntity<>(kingdomCountToolsViewService.findByKingdom(kingdom), HttpStatus.OK);
    }

    @GetMapping("/get-tools-count")
    public ResponseEntity<List<KingdomsCountToolsViewEntity>> getTools() {
        LOGGER.info("\n Kingdom-getTools: start");

        LOGGER.info("\n Kingdom-getTools: trying to get females count");

        return new ResponseEntity<>(kingdomCountToolsViewService.findAll(), HttpStatus.OK);
    }

    public KingdomsController(@Autowired KingdomsService kingdomsService,
                              @Autowired KingdomCountFemalesViewService kingdomCountFemalesViewService,
                              @Autowired KingdomCountMalesViewService kingdomCountMalesViewService,
                              @Autowired KingdomCountWeaponsService kingdomCountWeaponsService,
                              @Autowired KingdomCountToolsViewService kingdomCountToolsViewService) {
        this.kingdomsService = kingdomsService;
        this.kingdomCountFemalesViewService = kingdomCountFemalesViewService;
        this.kingdomCountMalesViewService = kingdomCountMalesViewService;
        this.kingdomCountWeaponsService = kingdomCountWeaponsService;
        this.kingdomCountToolsViewService = kingdomCountToolsViewService;
    }
}
