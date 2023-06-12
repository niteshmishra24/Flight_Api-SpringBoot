package com.flight_api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Cabin {
    private int qty;
    private String unit;
    private String text;
    private int allowance;
    
    public Cabin(int qty, String unit, String text, int allowance) {
        this.qty = qty;
        this.unit = unit;
        this.text = text;
        this.allowance = allowance;
    }

    public Cabin() {
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getAllowance() {
        return allowance;
    }

    public void setAllowance(int allowance) {
        this.allowance = allowance;
    }

    
}
