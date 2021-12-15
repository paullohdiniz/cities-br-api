package br.com.tqi.cities.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "PAIS")
public class Country implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @SequenceGenerator(name="pais_id_seq", sequenceName = "pais_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "pais_id_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "nome_pt", nullable = false)
    private String nomePT;

    @Column(name = "sigla", nullable = false)
    private String sigla;

    @Column(name = "bacen", nullable = false)
    private Integer bacen;

}
