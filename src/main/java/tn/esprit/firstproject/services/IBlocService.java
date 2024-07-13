package tn.esprit.firstproject.services;

import tn.esprit.firstproject.entities.Bloc;


import java.util.List;
import java.util.Optional;

public interface IBlocService {

    public List<Bloc> retrieveAllBlocs();

    public Optional<Bloc> retrieveBloc(Long idbloc);

    public Bloc addBloc(Bloc c);

    public void removeBloc(Long idbloc);

    public Bloc modifyBloc(Bloc bloc);


}
