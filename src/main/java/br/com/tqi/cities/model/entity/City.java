package br.com.tqi.cities.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "CIDADE")
public class City {

    @Id
    @Column(name = "id", nullable = false)
    @SequenceGenerator(name="cidade_id_seq", sequenceName = "cidade_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "cidade_id_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nome;
    private int uf;
    private int ibge;
    private double lat_lon;
    private double latitude;
    private double longitude;
    @Column(name = "cod_tom", nullable = false)
    private short codTom ;

}
