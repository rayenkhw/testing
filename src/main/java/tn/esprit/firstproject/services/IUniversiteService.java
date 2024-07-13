package tn.esprit.firstproject.services;

import tn.esprit.firstproject.entities.Universite;

import java.util.List;

public interface IUniversiteService {

    public List<Universite> retrieveAllUniversites();

    public Universite retrieveUniversite(Long iduniversite);

    public Universite addUniversite(Universite c);

    public void removeUniversite(Long iduniversite);



    public Universite modifyUniversite(Universite universite);

    public Universite affectFoyerUniversite(long idfoyer, long iduniversite);
}
