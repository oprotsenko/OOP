package com.oprotsen.JavaOOP.familyBudget;

import java.time.LocalDate;

public class MoneyMovement {
    private final String name;
    private final long cost;
    private final PaymentType paymentType;
    private final LocalDate localDate;

    public MoneyMovement(String name, long cost, PaymentType paymentType, LocalDate localDate) {
        this.name = name;
        this.cost = cost;
        this.paymentType = paymentType;
        this.localDate = localDate;
    }

    public String getName() {
        return name;
    }

    public long getCost() {
        return cost;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    @Override
    public String toString() {
        return "MoneyMovement{" +
                "name ='" + name + '\'' +
                ", cost = " + cost + " UAH" +
                ", paymentType = " + paymentType +
                ", localDate = " + localDate +
                '}';
    }
}
