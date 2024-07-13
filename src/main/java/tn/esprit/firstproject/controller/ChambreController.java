package tn.esprit.firstproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstproject.entities.Chambre;
import tn.esprit.firstproject.services.IChambreService;

import java.util.List;

@RestController
@RequestMapping("/chambrectrl")
public class ChambreController {
    @Autowired
    IChambreService chambreService;

    @PostMapping("/addchambre")
    public Chambre addchambre(@RequestBody Chambre c) {
        return chambreService.addChambre(c);
    }

    @PostMapping("/removeChambre")
    public  void removeChambre(@RequestBody Chambre c) {chambreService.removeChambre(c.getId()); ;}

    @PostMapping("/retrieveChambre")
    public Chambre retrieveChambre(@RequestBody Chambre c) {return chambreService.retrieveChambre(c.getId()) ;}

    @PostMapping("/retrieveAllChambres")
    public List<Chambre> retrieveAllChambres() { return (List<Chambre>) chambreService.retrieveAllChambres() ; }

    @PostMapping("/modifyChambre")
    public Chambre modifyChambre(@RequestBody Chambre c){return chambreService.modifyChambre(c) ;}


    @GetMapping("/getChambresParNomUniversite")
    public List<Chambre > getChambresParNomUniversite(@RequestBody String nomUniversite){

    return chambreService.getChambresParNomUniversite(nomUniversite);



    }


}
