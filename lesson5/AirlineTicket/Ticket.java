package com.oprotsen.JavaOOP.lesson5.AirlineTicket;

public class Ticket {
    private long number;
    private PassengerInfo passengerInfo;
    private FlightInfo flightInfo;

    public Ticket(long number, PassengerInfo passengerInfo, FlightInfo flightInfo) {
        this.number = number;
        this.passengerInfo = passengerInfo;
        this.flightInfo = flightInfo;
    }

    public long getCost() {
        return flightInfo.getPrice();
    }
}
