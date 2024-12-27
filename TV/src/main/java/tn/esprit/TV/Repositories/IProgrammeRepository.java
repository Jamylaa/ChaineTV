package tn.esprit.TV.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.TV.Entities.Programme;

public interface IProgrammeRepository extends JpaRepository<Programme, Long> {
}
