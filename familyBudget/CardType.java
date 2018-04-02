package com.oprotsen.JavaOOP.familyBudget;

public enum  CardType {
    MASTERCARD(1),
    VISA(2);

    private final int num;

    CardType(int num) {
        this.num = num;
    }
}
