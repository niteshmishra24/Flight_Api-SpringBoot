package com.flight_api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Baggage {
    private Cabin cabin;
    private CheckIn checkIn;

    public Cabin getCabin() {
        return cabin;
    }
    public void setCabin(Cabin cabin) {
        this.cabin = cabin;
    }
    public CheckIn getCheckIn() {
        return checkIn;
    }
    public void setCheckIn(CheckIn checkIn) {
        this.checkIn = checkIn;
    }
    public Baggage(Cabin cabin, CheckIn checkIn) {
        this.cabin = cabin;
        this.checkIn = checkIn;
    }
    public Baggage() {
    }
}
