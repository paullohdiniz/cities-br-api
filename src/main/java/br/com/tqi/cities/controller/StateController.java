package br.com.tqi.cities.controller;

import br.com.tqi.cities.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/states")
public class StateController {

    @Autowired
    private StateService stateService;

    @GetMapping
    public ResponseEntity<List<br.com.tqi.cities.model.entity.State>> getStates(){

        return ResponseEntity.ok(stateService.getAll());
    }
}
