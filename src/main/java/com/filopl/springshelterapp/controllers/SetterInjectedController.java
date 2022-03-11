package com.filopl.springshelterapp.controllers;

import com.filopl.springshelterapp.services.GreetingsService;

public class SetterInjectedController {

    private GreetingsService greetingsService;

    public void setGreetingsService(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String getGreetings() {
        return greetingsService.sayGreeting();
    }

}
