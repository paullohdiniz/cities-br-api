package br.com.tqi.cities.model.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class CountryDTO {

    private Long id;
    private String nome;
    private String nomePT;
    private String sigla;
    private Integer bacen;

    public static CountryDTO map(Long id, String nome, String nomePT, String sigla, Integer bacen){
        return CountryDTO.builder().id(id).nome(nome).nomePT(nomePT).sigla(sigla).bacen(bacen).build();
    }

}
