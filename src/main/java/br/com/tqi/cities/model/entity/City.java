package br.com.tqi.cities.model.entity;

import br.com.tqi.cities.model.dto.PointType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.data.geo.Point;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "CIDADE")
@TypeDefs({
        @TypeDef(name = "POINT", typeClass = PointType.class)
})
public class City implements Serializable {

    private static final long serialVersionUID = 1L;

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

    @Type(type = "POINT")
    @Column(name = "lat_lon", nullable = false)
    private Point lat_lon;

    @Column(name = "latitude", nullable = false)
    private double latitude;

    @Column(name = "longitude", nullable = false)
    private double longitude;

    @Column(name = "cod_tom", nullable = false)
    private short codTom ;

}
