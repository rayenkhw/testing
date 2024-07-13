package tn.esprit.firstproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entities.Foyer;
import tn.esprit.firstproject.repository.IFoyerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FoyerServiceImpl implements IFoyerService {

    @Autowired
    IFoyerRepository iFoyerRepository;
    @Override
    public List<Foyer> retrieveAllFoyers() {
        return iFoyerRepository.findAll();
    }

    @Override
    public Optional<Foyer> retrieveFoyer(Long idfoyer) {
        return iFoyerRepository.findById(idfoyer);
    }

    @Override
    public Foyer addFoyer(Foyer c) {
        return iFoyerRepository.save(c);
    }

    @Override
    public void removeFoyer(Long idfoyer) {
        iFoyerRepository.deleteById(idfoyer);
    }

    @Override
    public Foyer modifyFoyer(Foyer foyer) {
        return iFoyerRepository.save(foyer);
    }
}
