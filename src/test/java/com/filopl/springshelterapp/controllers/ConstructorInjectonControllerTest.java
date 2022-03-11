package com.filopl.springshelterapp.controllers;

import com.filopl.springshelterapp.services.GreetingsServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectonControllerTest {

    ConstructorInjectonController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectonController(new GreetingsServiceImpl());
    }

    @Test
    void getGreetingsService() {
        System.out.println(controller.getGreetings());
    }
}