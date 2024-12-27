package tn.esprit.TV.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.TV.Repositories.IChaineRepository;
import tn.esprit.TV.Repositories.IProgrammeRepository;

@Service
public class ChaineService implements IChaineService {
    @Autowired
    private IChaineRepository chaineRepository;
    @Autowired
    private IProgrammeRepository programmeRepository;



}
