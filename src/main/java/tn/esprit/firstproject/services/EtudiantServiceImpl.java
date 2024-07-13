package tn.esprit.firstproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entities.Etudiant;
import tn.esprit.firstproject.repository.IEtudiantRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EtudiantServiceImpl implements IEtudiantService{

    @Autowired
    IEtudiantRepository iEtudiantRepository;


    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return (List<Etudiant>) iEtudiantRepository.findAll();
    }

    @Override
    public Optional<Etudiant> retrieveEtudiant(Long idetudiant) {
        return  iEtudiantRepository.findById(idetudiant) ;
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return iEtudiantRepository.save(e);
    }

    @Override
    public void removeEtudiant(Long EtudiantId) {
        iEtudiantRepository.deleteById(EtudiantId);
    }

    @Override
    public Etudiant modifyEtudiant(Etudiant etudiant) {
        return iEtudiantRepository.save(etudiant) ;
    }
}
