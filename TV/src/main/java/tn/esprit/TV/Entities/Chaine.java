package tn.esprit.TV.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.TV.Enum.Profession;
import tn.esprit.TV.Enum.Thematique;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chaine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int chid;
    private String ChNom;
    @Enumerated(EnumType.STRING)
    private Thematique thematique;
     }
