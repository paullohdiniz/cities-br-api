package br.com.tqi.cities.service;

import br.com.tqi.cities.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    public List<br.com.tqi.cities.model.entity.State> getAll() {

        return stateRepository.findAll();
    }
}
