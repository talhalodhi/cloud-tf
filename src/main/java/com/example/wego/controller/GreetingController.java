package com.example.wego.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class GreetingController {

    private static final String template = "you will obey or molten silver will poured into your eyes, %s!";


    @GetMapping("/v1/fortune")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "here wego") String name) {
        return new Greeting(String.format(template, name));
    }
    @GetMapping("/healthcheck")
    public health health(@RequestParam(value = "name", defaultValue = "true") String name) {
        return new health(String.format( name));
    }

}
