package com.flight_api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Airport {
    private ArrivalAirport arrivalAirport;
    private DepartureAirport departureAirport;
    
    public ArrivalAirport getArrivalAirport() {
        return arrivalAirport;
    }
    public void setArrivalAirport(ArrivalAirport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }
    public DepartureAirport getDepartureAirport() {
        return departureAirport;
    }
    public void setDepartureAirport(DepartureAirport departureAirport) {
        this.departureAirport = departureAirport;
    }

    public Airport(ArrivalAirport arrivalAirport, DepartureAirport departureAirport) {
        this.arrivalAirport = arrivalAirport;
        this.departureAirport = departureAirport;
    }
    public Airport() {
    }

    
}
