package com.mihaisaizu.controllers;

import com.mihaisaizu.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        return greetingService.sayGreeting();
    }
}
