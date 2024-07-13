package tn.esprit.firstproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstproject.entities.Etudiant;
import tn.esprit.firstproject.entities.Universite;
import tn.esprit.firstproject.services.IUniversiteService;

import java.util.List;

@RestController
@RequestMapping("/universitectrl")
public class UniversiteController {

    @Autowired
    IUniversiteService UniversiteService;

    @PostMapping("/adduniversite")
    public Universite addUniversite(@RequestBody Universite c) {
        return UniversiteService.addUniversite(c);
    }

    @PostMapping("/retrieveAllUniversites")
    public List<Universite> retrieveAllUniversites(){ return UniversiteService.retrieveAllUniversites(); }

    @PostMapping("/retrieveUniversite")
    public Universite retrieveUniversite(@RequestBody Universite c) {return UniversiteService.retrieveUniversite(c.getIduniversite()) ;}

    @PostMapping("/removeUniversite")
    public void removeUniversite(@RequestBody Universite c) {UniversiteService.removeUniversite(c.getIduniversite()); ;}

    @PostMapping("/modifyUniversite")
    public Universite modifyUniversite(@RequestBody Universite c) {return UniversiteService.modifyUniversite(c) ;}

    @PostMapping("/affectFoyerUniversite/{idfoyer}/{iduniversite}")
    public Universite affectFoyerUniversite(@PathVariable("idfoyer")  long idfoyer,@PathVariable("iduniversite") long iduniversite){



        Universite universite = UniversiteService.affectFoyerUniversite(idfoyer,iduniversite);

        return universite;

    }


}
