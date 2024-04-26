package ga.esiitech.schoolapp.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.File;
import java.util.List;

@Table(name = "ECOLE")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Ecole {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "NOM", length = 20, nullable = false)
    private String nom;

    @Column(name = "ADRESSE", length = 25, nullable = false)
    private String   adresse;

    @Column(name = "NUMERO", length = 9, unique = true)
    private String numeroTelephone;

    @Column(name = "EMAIL", length = 30, unique = true, nullable = false)
    private String email;

}
