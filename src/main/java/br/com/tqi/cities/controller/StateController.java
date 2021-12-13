package br.com.tqi.cities.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/states")
public class StateController {

    @GetMapping
    public ResponseEntity<String> getCountry(){


        return ResponseEntity.ok("");
    }
}
