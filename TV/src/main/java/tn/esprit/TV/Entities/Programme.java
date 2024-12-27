package tn.esprit.TV.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Programme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int prid;
    private String prname;

    public int getPrid() {return prid;}

    public void setPrid(int prid) {this.prid = prid;}

    public String getPrname() {return prname;}

    public void setPrname(String prname) {this.prname = prname;}

    @ManyToMany(mappedBy = "programmes")
    private List<Utilisateur> utilisateurs;

    @ManyToOne
    private Chaine chaine;
}