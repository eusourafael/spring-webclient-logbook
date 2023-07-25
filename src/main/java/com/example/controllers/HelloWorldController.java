package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping
    public Mono<String> sayHello(@RequestParam(required = false) String name) {
        if (name == null) {
            return Mono.just("Hello World!");
        } else {
            return Mono.just("Hello " + name);
        }
    }

}
