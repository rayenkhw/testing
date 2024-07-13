package tn.esprit.firstproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.firstproject.entities.Foyer;
import tn.esprit.firstproject.services.IFoyerService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/foyerctrl")
public class FoyerController {

    @Autowired
    IFoyerService FoyerService;

    @PostMapping("/addfoyer")
    public Foyer addfoyer(@RequestBody Foyer c) {
        return FoyerService.addFoyer(c);
    }

    @PostMapping("/retrieveAllFoyers")
    public List<Foyer> retrieveAllFoyers(){return FoyerService.retrieveAllFoyers() ;}

    @PostMapping("/retrieveFoyer")
    public Optional<Foyer> retrieveFoyer(@RequestBody Foyer c) {return FoyerService.retrieveFoyer(c.getIdfoyer()); }

    @PostMapping("/removeFoyer")
    public void removeFoyer(@RequestBody Foyer c){FoyerService.removeFoyer(c.getIdfoyer()); ;}

    @PostMapping("/modifyFoyer")
    public Foyer modifyFoyer(@RequestBody Foyer c){return FoyerService.modifyFoyer(c);}
}
