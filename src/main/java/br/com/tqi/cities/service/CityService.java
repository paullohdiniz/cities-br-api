package br.com.tqi.cities.service;

import br.com.tqi.cities.model.entity.City;
import br.com.tqi.cities.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    private CityRepository cityRepository;

    @Autowired
    public CityService(CityRepository _cityRepository){
        cityRepository = _cityRepository;
    }

    public Page<City> getAll(Pageable page){
        return cityRepository.findAll(page);
    }
}
