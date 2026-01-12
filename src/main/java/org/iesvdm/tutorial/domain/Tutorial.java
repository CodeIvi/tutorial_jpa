package org.iesvdm.tutorial.domain;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

@Entity
public class Tutorial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private long id;

    @Column(unique = false, length = 30, nullable = false)
    private String titulo;

    @OneToMany( mappedBy = "tutorial", orphanRemoval = true, cascade = CascadeType.ALL)
    private Set<Comentario> comentarios;

}
