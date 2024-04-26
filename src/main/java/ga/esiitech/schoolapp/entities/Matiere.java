package ga.esiitech.schoolapp.entities;

import jakarta.persistence.*;

import java.io.File;

@Entity
@Table( name = "MATIERE")
public class Matiere {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "FILIERE_ID", referencedColumnName = "ID")
    private Filiere filiere;
}
