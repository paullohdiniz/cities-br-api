package br.com.tqi.cities.service;

import br.com.tqi.cities.model.entity.Country;
import br.com.tqi.cities.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getAll(){
        return countryRepository.findAll();
    }
}
