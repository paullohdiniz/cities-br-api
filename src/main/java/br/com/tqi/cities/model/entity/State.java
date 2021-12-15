package br.com.tqi.cities.model.entity;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "ESTADO")
@TypeDefs({
        @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})
public class State implements Serializable {

    private static final long serialVersionUID = 1L;

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

    @Type(type = "jsonb")
    @Column(name = "ddd", nullable = false, columnDefinition = "jsonb")
    private List<Integer> ddd;

}
