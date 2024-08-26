package org.example.countriesspringproject.service;

import org.example.countriesspringproject.entity.Country;
import org.example.countriesspringproject.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryService {

    private final CountryRepository countryRepository;

    @Autowired
    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public Optional<Country> findByIso(String iso) {
        return countryRepository.findByIso(iso);
    }

    public String findNameByIso(String iso) {
        return countryRepository.findNameByIso(iso);
    }

}


