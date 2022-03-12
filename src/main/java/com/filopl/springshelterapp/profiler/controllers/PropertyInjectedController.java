package com.filopl.springshelterapp.profiler.controllers;

import com.filopl.springshelterapp.profiler.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    public GreetingsService greetingsService;

    public String getGreetings() {
        return greetingsService.sayGreeting();
    }

}
