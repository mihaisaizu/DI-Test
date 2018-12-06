package com.mihaisaizu.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingSerivice implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Primarer GrumBdienst";
    }
}
