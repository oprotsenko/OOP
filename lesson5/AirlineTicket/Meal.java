package com.oprotsen.JavaOOP.lesson5.AirlineTicket;

public class Meal {
    private final TypeOfMeal typeOfMeal;
    private final Drink drink;
    private long price;

    public Meal(TypeOfMeal typeOfMeal, Drink drink) {
        this.typeOfMeal = typeOfMeal;
        this.drink = drink;
        this.price = getCost();
    }

    public long getCost() {
        if (typeOfMeal.equals(TypeOfMeal.VEGETABLES))
            price = 10;
        else if (typeOfMeal.equals(TypeOfMeal.CHICKEN))
            price = 15;
        else if (typeOfMeal.equals(TypeOfMeal.MEAT))
            price = 20;
        if (drink.equals(Drink.NO))
            return price;
        else
            return price + 5;
    }
}
