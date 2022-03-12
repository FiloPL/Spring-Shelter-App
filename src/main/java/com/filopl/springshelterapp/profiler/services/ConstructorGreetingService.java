package com.filopl.springshelterapp.profiler.services;

import org.springframework.stereotype.Service;


@Service
public class ConstructorGreetingService implements GreetingsService{

    @Override
    public String sayGreeting() {
        return "Hello - Construcotr";
    }
}
