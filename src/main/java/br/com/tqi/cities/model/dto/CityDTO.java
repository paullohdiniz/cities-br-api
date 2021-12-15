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

    private Long id;
    private String nome;
    private int uf;
    private int ibge;
    private Point lat_lon;
    private double latitude;
    private double longitude;
    private short codTom;

    public static CityDTO map(Long id, String nome, int uf, int ibge, Point lat_lon, double latitude, double longitude, short codTom) {
        return CityDTO.builder()
                .id(id)
                .nome(nome)
                .uf(uf)
                .ibge(ibge)
                .lat_lon(lat_lon)
                .latitude(latitude)
                .longitude(longitude)
                .codTom(codTom).build();
    }
}
