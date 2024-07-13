package tn.esprit.firstproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.firstproject.entities.Bloc;
import tn.esprit.firstproject.entities.Chambre;
import tn.esprit.firstproject.services.IBlocService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/blocctrl")
public class BlocController {

    @Autowired
    IBlocService BlocService;

    @PostMapping("/addbloc")
    public Bloc addbloc(@RequestBody Bloc b) {
        return BlocService.addBloc(b);
    }

    @PostMapping("/retrieveAllBlocs")
    public List<Bloc> retrieveAllBlocs(){return BlocService.retrieveAllBlocs(); }

    @PostMapping("/retrieveBloc")
    public Optional<Bloc> retrieveBloc(@RequestBody Bloc b){return BlocService.retrieveBloc(b.getIdbloc()); }

    @PostMapping("/removeBloc")
    public void removeBloc(@RequestBody Bloc b){ BlocService.removeBloc(b.getIdbloc());  ; }

    @PostMapping("/modifyBloc")
    public Bloc modifyBloc(@RequestBody Bloc b){return BlocService.modifyBloc(b) ;}

}
