package br.com.tqi.cities.service;

import br.com.tqi.cities.model.dto.CityDTO;
import br.com.tqi.cities.model.entity.City;
import br.com.tqi.cities.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public Page<City> getAll(Pageable page){
        return cityRepository.findAll(page);
    }

    public CityDTO getById(Long id) {
        City city = cityRepository.getOne(id);
        return CityDTO.map(city.getId(), city.getNome(), city.getUf(), city.getIbge(), city.getLat_lon(), city.getLatitude(),city.getLongitude(), city.getCodTom());
    }

    public double getDistanceBetweenCity(Long firstCityId, Long secondCityId) {
        Point firstPoint = cityRepository.getById(firstCityId).getLat_lon();
        Point secondPoint = cityRepository.getById(secondCityId).getLat_lon();
        assert secondPoint != null;
        return Math.sqrt((secondPoint.getY() - firstPoint.getY()) * (secondPoint.getY() - firstPoint.getY()) + (secondPoint.getX() - firstPoint.getX()) * (secondPoint.getX() - firstPoint.getX()));
    }
}
