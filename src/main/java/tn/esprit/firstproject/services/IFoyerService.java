package tn.esprit.firstproject.services;

import tn.esprit.firstproject.entities.Foyer;

import java.util.List;
import java.util.Optional;

public interface IFoyerService {

    public List<Foyer> retrieveAllFoyers();

    public Optional<Foyer> retrieveFoyer(Long idfoyer);

    public Foyer addFoyer(Foyer c);

    public void removeFoyer(Long idfoyer);

    public Foyer modifyFoyer(Foyer foyer);


}
