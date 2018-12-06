package com.mihaisaizu.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello!!! - Injected by the Constructor Controller";
    }
}
