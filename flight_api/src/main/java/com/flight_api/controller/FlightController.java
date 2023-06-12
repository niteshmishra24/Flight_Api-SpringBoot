package com.flight_api.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.flight_api.model.Flight;

import reactor.core.publisher.Mono;

@RestController
public class FlightController {
    
    @Autowired
    private WebClient.Builder webClientBuilder;

    @GetMapping("/api/flight")
    public Mono<Flight> getFlightData(String from, String to, String date, int adult, String type, String currency) {
    return webClientBuilder.build()
            .get()
            .uri(String.format("https://flight-fare-search.p.rapidapi.com/v2/flight/?from=%s&to=%s&date=%s&adult=%d&type=%s&currency=%s", 
                                from, to, date, adult, type, currency))
            .header("X-RapidAPI-Key", "de15e63f8emshcce663e2811d74cp1debe9jsn52245d3bc818")
            .header("X-RapidAPI-Host", "flight-fare-search.p.rapidapi.com")
            .retrieve()
            .bodyToMono(Flight.class);
    }

    @GetMapping("/api/flight/stops")
    public Mono<String> getNumberOfStops(String from, String to, String date, int adult, String type, String currency) {
        return getFlightData(from, to, date, adult, type, currency)
                .map(flight -> flight.getResult().isEmpty() ? "No results" : flight.getResult().get(0).getStops());
    }
    
}
