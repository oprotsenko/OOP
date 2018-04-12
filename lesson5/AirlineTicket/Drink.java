package com.oprotsen.JavaOOP.lesson5.AirlineTicket;

public enum  Drink {
    YES("with drink"),
    NO("without drink");

    private final String description;

    Drink(String description) {
        this.description = description;
    }
}
