package tn.esprit.TV.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.TV.Entities.Chaine;

public interface IChaineRepository extends JpaRepository<Chaine, Long> {
}
