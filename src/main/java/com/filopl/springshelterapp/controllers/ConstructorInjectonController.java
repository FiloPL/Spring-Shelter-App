package com.filopl.springshelterapp.controllers;

import com.filopl.springshelterapp.services.GreetingsService;

public class ConstructorInjectonController {

    private final GreetingsService greetingsService;

    public ConstructorInjectonController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String getGreetings() {
        return greetingsService.sayGreeting();
    }
}
