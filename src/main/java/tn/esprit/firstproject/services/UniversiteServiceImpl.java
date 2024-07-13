package tn.esprit.firstproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entities.Foyer;
import tn.esprit.firstproject.entities.Universite;
import tn.esprit.firstproject.repository.IFoyerRepository;
import tn.esprit.firstproject.repository.IUniversiteRepository;

import java.util.List;

@Service
public class UniversiteServiceImpl implements IUniversiteService{


    @Autowired
    IUniversiteRepository iUniversiteRepository;

    @Autowired
    IFoyerRepository iFoyerRepository;

    @Override
    public List<Universite> retrieveAllUniversites() {
        return iUniversiteRepository.findAll();
    }

    @Override
    public Universite retrieveUniversite(Long iduniversite) {
        return iUniversiteRepository.findById(iduniversite).get();
    }

    @Override
    public Universite addUniversite(Universite c) {
        return iUniversiteRepository.save(c);
    }

    @Override
    public void removeUniversite(Long iduniversite) {
        iUniversiteRepository.deleteById(iduniversite);

    }




    @Override
    public Universite modifyUniversite(Universite universite) {
        return iUniversiteRepository.save(universite);
    }

    @Override
    public Universite affectFoyerUniversite(long idfoyer, long iduniversite) {

        Foyer foyer = iFoyerRepository.findById(idfoyer).get();

        Universite universite = iUniversiteRepository.findById(iduniversite).get();

        universite.setFoyer(foyer);





        return universite;
    }
}
