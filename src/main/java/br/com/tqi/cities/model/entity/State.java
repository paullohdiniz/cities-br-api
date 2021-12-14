package br.com.tqi.cities.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "ESTADO")
public class State {

    @Id
    @Column(name = "id", nullable = false)
    @SequenceGenerator(name="estado_id_seq", sequenceName = "estado_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "estado_id_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "uf")
    private String uf;

    @Column(name = "ibge", nullable = false)
    private int ibge;

    @ManyToOne
    @JoinColumn(name = "pais")
    private Country pais;

    @Column(name = "ddd", nullable = false)
    private String ddd;

}
