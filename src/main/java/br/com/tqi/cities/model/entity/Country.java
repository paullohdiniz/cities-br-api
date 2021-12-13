package br.com.tqi.cities.model.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@Builder
@NoArgsConstructor
public class Country {

    @Id
    @Column(name = "id", nullable = false)
    @SequenceGenerator(name="pais_id_seq", sequenceName = "pais_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "pais_id_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nome;

    private String nome_pt;

    private String sigla;

    private Integer bacen;

}
