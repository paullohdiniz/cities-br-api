package br.com.tqi.cities.service;

import br.com.tqi.cities.model.dto.CountryDTO;
import br.com.tqi.cities.model.entity.Country;
import br.com.tqi.cities.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public Page<Country> getAll(Pageable page){
        return countryRepository.findAll(page);
    }

    public CountryDTO getCountryById(Long id) {
        Country country = countryRepository.getById(id);
        return CountryDTO.map(country.getId(), country.getNome(), country.getNomePT(), country.getSigla(), country.getBacen());
    }
}
