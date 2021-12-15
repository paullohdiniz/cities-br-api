package br.com.tqi.cities.controller;

import br.com.tqi.cities.model.dto.CityDTO;
import br.com.tqi.cities.model.entity.City;
import br.com.tqi.cities.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
public class CityController {

    private final CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping
    public ResponseEntity<Page<City>> getCity(Pageable page){
        return ResponseEntity.ok(cityService.getAll(page));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CityDTO> getCity(@PathVariable("id") Long id){
        return ResponseEntity.ok(cityService.getById(id));
    }

    @GetMapping("/distance/{first_city_id}/{second_city_id}")
    public ResponseEntity<Double> getDistanceBetweenCity(@PathVariable("first_city_id") Long first_city_id,
                                                          @PathVariable("second_city_id") Long second_city_id){
        return ResponseEntity.ok(cityService.getDistanceBetweenCity(first_city_id, second_city_id));
    }
}
