package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/instant")
public class InstantController {

    private final WebClient webClient;

    public InstantController(WebClient webClient) {
        this.webClient = webClient;
    }

    @GetMapping
    public Mono<String> instant() {

        return webClient
                .get()
                .uri("/dumb/instant")
                .exchangeToMono(response -> response.bodyToMono(String.class));
    }

}
