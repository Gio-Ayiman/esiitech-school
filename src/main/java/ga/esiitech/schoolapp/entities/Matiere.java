package ga.esiitech.schoolapp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table( name = "MATIERE")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Matiere {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private int coefficient;

    @Column(nullable = false)
    private int volumeHoraire;

    @ManyToMany
    private List<Filiere> filieres;
}
