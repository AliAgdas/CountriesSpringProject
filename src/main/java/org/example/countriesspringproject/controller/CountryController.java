package org.example.countriesspringproject.controller;

import org.example.countriesspringproject.entity.Country;
import org.example.countriesspringproject.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CountryController {

    private final CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @PostMapping("/search")
    public String search(@RequestParam("iso") String iso) {
        /*Optional<Country> country = countryService.findByIso(iso.toUpperCase());
        if (country.isPresent()) {
            return country.get().getName();
        } else {
            return "Country not found";
        }*/

        String countryName = countryService.findNameByIso(iso.toUpperCase());
        if (countryName == null) {return "Country not found";}
        else{ return countryName;}
    }
}


