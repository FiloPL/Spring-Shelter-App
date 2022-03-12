package com.filopl.springshelterapp;

import com.filopl.springshelterapp.profiler.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringShelterAppApplication {
    private static ApplicationContext ctx;

    public static void main(String[] args) {
         ctx =  SpringApplication.run(SpringShelterAppApplication.class, args);



    }

    private void contexxx() {
        PetController petController = ctx.getBean("petController", PetController.class);
        System.out.println("--- The Best Pet is ---");
        System.out.println(petController.whichPetIsTheBest());


        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());

        MyController myController = (MyController) ctx.getBean("myController");

        System.out.println("----- primary bean -----");
        System.out.println(myController.sayHello());

        System.out.println("----- propert -----");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController)  ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreetings());

        System.out.println("-----Setter-----");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreetings());

        System.out.println("-----Constructor-----");

        ConstructorInjectonController constructorInjectonController = (ConstructorInjectonController) ctx.getBean("constructorInjectonController");
        System.out.println(constructorInjectonController.getGreetings());

    }
}
