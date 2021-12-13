package br.com.tqi.cities.service;

import br.com.tqi.cities.model.entity.City;
import br.com.tqi.cities.model.entity.Country;
import br.com.tqi.cities.repository.CityRepository;
import br.com.tqi.cities.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public List<City> getAll(){
        return cityRepository.findAll();
    }
}
