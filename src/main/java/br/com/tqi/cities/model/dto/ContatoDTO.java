package br.com.tqi.cities.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.geo.Point;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class CityDTO {

    private String nome;
}
