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

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "uf")
    private int uf;

    @Column(name = "ibge", nullable = false)
    private int ibge;

    @Column(name = "lat_lon", nullable = false)
    private double lat_lon;

    @Column(name = "latitude", nullable = false)
    private double latitude;

    @Column(name = "longitude", nullable = false)
    private double longitude;

    @Column(name = "cod_tom", nullable = false)
    private short codTom ;

}
