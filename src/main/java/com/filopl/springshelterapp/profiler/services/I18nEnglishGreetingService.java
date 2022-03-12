package com.filopl.springshelterapp.profiler.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ENG")
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingsService{

    @Override
    public String sayGreeting() {
        return "Hello World - English";
    }
}
