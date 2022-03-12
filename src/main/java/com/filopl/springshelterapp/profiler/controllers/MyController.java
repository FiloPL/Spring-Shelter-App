package com.filopl.springshelterapp.profiler.controllers;


import com.filopl.springshelterapp.profiler.services.GreetingsService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingsService greetingsService;

    public MyController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String sayHello(){
        return greetingsService.sayGreeting();
    }
}
