package br.com.tqi.cities.service;

import br.com.tqi.cities.model.entity.State;
import br.com.tqi.cities.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    public Page<State> getAll(Pageable page) {

        return stateRepository.findAll(page);
    }
}
