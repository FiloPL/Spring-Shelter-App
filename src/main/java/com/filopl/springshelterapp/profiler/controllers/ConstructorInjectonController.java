package com.filopl.springshelterapp.profiler.controllers;

import com.filopl.springshelterapp.profiler.services.GreetingsService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectonController {

    private final GreetingsService greetingsService;

    public ConstructorInjectonController(@Qualifier("constructorGreetingService") GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String getGreetings() {
        return greetingsService.sayGreeting();
    }
}
