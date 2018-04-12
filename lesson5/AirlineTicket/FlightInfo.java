package com.oprotsen.JavaOOP.lesson5.AirlineTicket;

import java.time.LocalDate;

public class FlightInfo {
    private final long flightNumber;
    private final String startPlace;
    private final String finishPlace;
    private final LocalDate startData;
    private final int placeNumber;
    private final long price;

    public FlightInfo(long flightNumber, String startPlace, String finishPlace, LocalDate startData, int placeNumber, long price) {
        this.flightNumber = flightNumber;
        this.startPlace = startPlace;
        this.finishPlace = finishPlace;
        this.startData = startData;
        this.placeNumber = placeNumber;
        this.price = price;
    }

    public long getPrice() {
        return price;
    }
}
