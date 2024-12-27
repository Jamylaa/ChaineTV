package tn.esprit.TV.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.TV.Entities.Utilisateur;

public interface IUtilisateurRepository extends JpaRepository<Utilisateur, Long> {
}
