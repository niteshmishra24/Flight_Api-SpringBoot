package com.flight_api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CheckIn {
    
    private int allowance;
    private String qty;
    private String unit;
    private String text;
    private int refNumber;
    private int quantity;

    public int getAllowance() {
        return allowance;
    }
    public void setAllowance(int allowance) {
        this.allowance = allowance;
    }
    public String getQty() {
        return qty;
    }
    public void setQty(String qty) {
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
    public int getRefNumber() {
        return refNumber;
    }
    public void setRefNumber(int refNumber) {
        this.refNumber = refNumber;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public CheckIn(int allowance, String qty, String unit, String text, int refNumber, int quantity) {
        this.allowance = allowance;
        this.qty = qty;
        this.unit = unit;
        this.text = text;
        this.refNumber = refNumber;
        this.quantity = quantity;
    }

    public CheckIn() {
    }
    
}
