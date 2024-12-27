package tn.esprit.TV.Entities;

import jakarta.persistence.*;
import lombok.*;
import tn.esprit.TV.Enum.Profession;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int usrid;
    private String usrNom;
    private Date usrDateInscription;
    @Enumerated(EnumType.STRING)
    private Profession profession;

    @ManyToMany
    private List<Programme> programmes;

}