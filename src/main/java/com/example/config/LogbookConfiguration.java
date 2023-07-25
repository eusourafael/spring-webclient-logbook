package com.example.config;

import org.springframework.boot.web.reactive.function.client.WebClientCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import org.zalando.logbook.Logbook;
import org.zalando.logbook.spring.webflux.LogbookExchangeFilterFunction;

@Configuration
public class LogbookConfiguration {

//    @Bean
//    public WebClientCustomizer webClientCustomizer(final ExchangeFilterFunction logbookClientExchangeFunction) {
//        return webClientBuilder -> webClientBuilder.filter(logbookClientExchangeFunction);
//    }

    @Bean
    public ExchangeFilterFunction logbookClientExchangeFunction(final Logbook logbook) {
        return new LogbookExchangeFilterFunction(logbook);
    }

}
