package com.oprotsen.JavaOOP.lesson5.AirlineTicket;

public class Baggage {
    private final int quantity;
    private final long price;

    public Baggage(int quantity, long price) {
        this.quantity = quantity;
        this.price = price;
    }

    public long getCost() {
        return quantity * price;
    }
}
