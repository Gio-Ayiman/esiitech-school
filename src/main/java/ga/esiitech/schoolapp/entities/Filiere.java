package ga.esiitech.schoolapp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "FILIERE")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Filiere {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nom;

    @OneToMany
    private List<Matiere> matieres;

    @ManyToOne
    @JoinColumn(name = "ECOLE_ID", referencedColumnName = "ID")
    private Ecole ecole;
}
