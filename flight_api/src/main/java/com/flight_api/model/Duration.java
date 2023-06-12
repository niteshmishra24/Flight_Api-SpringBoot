package com.flight_api.model;

public class Duration {
    private String text;
    private String value;
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public Duration(String text, String value) {
        this.text = text;
        this.value = value;
    }
    public Duration() {
    }

    
}
