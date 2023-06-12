package com.flight_api.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
    
    private String id;
    private String careerCode;
    @JsonProperty("flight_code")
    private String flightCode;
    @JsonProperty("flight_name")
    private String flightName;
    @JsonProperty("stops")
    private String stops;
    private String cabinType;
    private Baggage baggage;
    private Airport airport;
    private Duration duration;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getCareerCode() {
        return careerCode;
    }
    public void setCareerCode(String careerCode) {
        this.careerCode = careerCode;
    }
    public String getFlightCode() {
        return flightCode;
    }
    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }
    public String getFlightName() {
        return flightName;
    }
    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }
    public String getStops() {
        return stops;
    }
    public void setStops(String stops) {
        this.stops = stops;
    }
    public String getCabinType() {
        return cabinType;
    }
    public void setCabinType(String cabinType) {
        this.cabinType = cabinType;
    }
    public Baggage getBaggage() {
        return baggage;
    }
    public void setBaggage(Baggage baggage) {
        this.baggage = baggage;
    }

    public Airport getAirport() {
        return airport;
    }
    public void setAirport(Airport airport) {
        this.airport = airport;
    }
    
    public Duration getDuration() {
        return duration;
    }
    public void setDuration(Duration duration) {
        this.duration = duration;
    }
    
    public Result(String id, String careerCode, String flightCode, String flightName, String stops, String cabinType,
            Baggage baggage, Airport airport, Duration duration) 
            {
        this.id = id;
        this.careerCode = careerCode;
        this.flightCode = flightCode;
        this.flightName = flightName;
        this.stops = stops;
        this.cabinType = cabinType;
        this.baggage = baggage;
        this.airport = airport;
        this.duration = duration;
    }
    public Result() {
    }

    
}
