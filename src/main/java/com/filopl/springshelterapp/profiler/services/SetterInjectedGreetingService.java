package com.filopl.springshelterapp.profiler.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingsService{

    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
