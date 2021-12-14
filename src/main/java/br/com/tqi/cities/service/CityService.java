package br.com.tqi.cities.service;

import br.com.tqi.cities.model.entity.City;
import br.com.tqi.cities.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    private CityRepository cityRepository;

    @Autowired
    public CityService(CityRepository _cityRepository){
        cityRepository = _cityRepository;
    }

    public List<City> getAll(){
        return cityRepository.findAll();
    }
}
