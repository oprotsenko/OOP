package com.oprotsen.JavaOOP.lesson5.AirlineTicket;

public enum  TypeOfMeal {
    VEGETABLES(1),
    CHICKEN(2),
    MEAT(3);

    private final int number;

    TypeOfMeal(int number) {
        this.number = number;
    }
}
