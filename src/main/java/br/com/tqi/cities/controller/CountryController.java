package br.com.tqi.cities.controller;

import br.com.tqi.cities.model.entity.Country;
import br.com.tqi.cities.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping
    public ResponseEntity<Page<Country>> getCity(Pageable page){
        return ResponseEntity.ok(countryService.getAll(page));
    }
}
