package com.filopl.springshelterapp;

import com.filopl.springshelterapp.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringShelterAppApplication {

    public static void main(String[] args) {
        ApplicationContext ctx =  SpringApplication.run(SpringShelterAppApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        String greetings = myController.sayHello();
        System.out.println(greetings);

    }
}
