package com.filopl.springshelterapp.controllers;

import com.filopl.springshelterapp.profiler.controllers.PropertyInjectedController;
import com.filopl.springshelterapp.profiler.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingsService = new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreetings());
    }

}