package com.filopl.springshelterapp.controllers;

import com.filopl.springshelterapp.profiler.controllers.ConstructorInjectonController;
import com.filopl.springshelterapp.profiler.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectonControllerTest {

    ConstructorInjectonController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectonController(new ConstructorGreetingService());
    }

    @Test
    void getGreetingsService() {
        System.out.println(controller.getGreetings());
    }
}