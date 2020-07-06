package com.kumarvicky.demo.controllers;

import com.kumarvicky.demo.models.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.kumarvicky.demo.services.CountryService;

import java.util.List;

@Controller
public class CountryController {



     CountryService countryService=new CountryService();
    @GetMapping("/country")
    public String Home()
    {
        List<Country> countryList=countryService.getCountries();
        System.out.println(countryList);
        return "country";
    }
}
