package tn.esprit.firstproject.services;

import tn.esprit.firstproject.entities.Etudiant;

import java.util.List;
import java.util.Optional;

public interface IEtudiantService {

    public List<Etudiant> retrieveAllEtudiants();

    public Optional<Etudiant> retrieveEtudiant(Long EtudiantId);

    public Etudiant addEtudiant(Etudiant c);

    public void removeEtudiant(Long EtudiantId);

    public Etudiant modifyEtudiant(Etudiant etudiant);

}
