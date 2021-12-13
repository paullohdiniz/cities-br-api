package br.com.tqi.cities.controller;

import br.com.tqi.cities.model.entity.City;
import br.com.tqi.cities.model.entity.Country;
import br.com.tqi.cities.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {

    private final CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping
    public ResponseEntity<List<City>> getCity(){
        return ResponseEntity.ok(cityService.getAll());
    }
}
