package tn.esprit.firstproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.firstproject.entities.Etudiant;
import tn.esprit.firstproject.services.IEtudiantService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/etudiantctrl")
public class EtudiantController {
    @Autowired
    IEtudiantService  etudiantService;

    @PostMapping("/addetudiant")
    public Etudiant addetudiant(@RequestBody Etudiant c) {
        return etudiantService.addEtudiant(c);
    }


    @PostMapping("/deleteetudiant")
    public  void deleteetudiant(@RequestBody Etudiant c) {etudiantService.removeEtudiant(c.getIdetudiant());}

    @PostMapping("/retrieveetudiant")
    public Optional<Etudiant> retrieveEtudiant(@RequestBody Etudiant c) {return etudiantService.retrieveEtudiant(c.getIdetudiant());}

    @PostMapping("/retirevealletudiants")
    public List<Etudiant> retrieveAllEtudiants() { return (List<Etudiant>) etudiantService.retrieveAllEtudiants(); }

    @PostMapping("/modifyetudiant")
    public Etudiant modifyEtudiant(@RequestBody Etudiant c){return etudiantService.modifyEtudiant(c);}

}
