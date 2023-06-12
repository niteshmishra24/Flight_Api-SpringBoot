package com.flight_api.model;

import java.time.LocalDateTime;

public class ArrivalAirport {
    private LocalDateTime time;
    private String code;
    private String tz;
    private String timeZone;
    private String type;
    private String label;
    public LocalDateTime getTime() {
        return time;
    }
    public void setTime(LocalDateTime time) {
        this.time = time;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getTz() {
        return tz;
    }
    public void setTz(String tz) {
        this.tz = tz;
    }
    public String getTimeZone() {
        return timeZone;
    }
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public ArrivalAirport(LocalDateTime time, String code, String tz, String timeZone, String type, String label) {
        this.time = time;
        this.code = code;
        this.tz = tz;
        this.timeZone = timeZone;
        this.type = type;
        this.label = label;
    }
    public ArrivalAirport() {
    }

    
}
