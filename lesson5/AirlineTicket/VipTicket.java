package com.oprotsen.JavaOOP.lesson5.AirlineTicket;

public class VipTicket extends Ticket {
    private Baggage baggage;
    private Meal meal;

    public VipTicket(long number, PassengerInfo passengerInfo, FlightInfo flightInfo, Baggage baggage, Meal meal) {
        super(number, passengerInfo,flightInfo);
        this.baggage = baggage;
        this.meal = meal;
    }

    public long getCost() {
        return super.getCost() + baggage.getCost() + meal.getCost();
    }
}
