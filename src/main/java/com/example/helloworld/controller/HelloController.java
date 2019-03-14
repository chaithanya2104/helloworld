package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/greet")
    public String showGreeting(){
        return "Greetings from Hello World Application";
    }

    @GetMapping("/hello")
    public String showHello(){
        return "Hello !!!";
    }

}
