package com.kumarvicky.demo.services;

import com.kumarvicky.demo.models.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kumarvicky.demo.repositories.CountryRepository;

import java.util.List;

@Service
public class CountryService {

    @Autowired
   private  CountryRepository countryRepository;
    public List<Country> getCountries()
    {
        return countryRepository.findAll();
    }
}
