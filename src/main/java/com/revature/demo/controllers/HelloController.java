package com.revature.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello from Spring Boot App!";
    }

    @GetMapping("/froot")
    public String froot() {
        return "Living life Dulce Vida";
    }

    @GetMapping("/froot2")
    public String froot2() {
        return "Couldn't get any Sweeter";
    }
}
