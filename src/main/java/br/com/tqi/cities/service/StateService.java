package br.com.tqi.cities.service;

import br.com.tqi.cities.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;
}
