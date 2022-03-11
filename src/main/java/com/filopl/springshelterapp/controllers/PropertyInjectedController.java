package com.filopl.springshelterapp.controllers;

import com.filopl.springshelterapp.services.GreetingsService;

public class PropertyInjectedController {

    public GreetingsService greetingsService;

    public String getGreetings() {
        return greetingsService.sayGreeting();
    }

}
