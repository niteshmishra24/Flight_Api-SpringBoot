package com.flight_api.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Flight {
    
    @JsonProperty("results")
    private List<Result> result;

    

    public Flight() {
    }



    public List<Result> getResult() {
        return result;
    }



    public void setResult(List<Result> result) {
        this.result = result;
    }



    public Flight(List<Result> result) {
        this.result = result;
    }

    
    
}
