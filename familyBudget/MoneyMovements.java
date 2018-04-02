package com.oprotsen.JavaOOP.familyBudget;

public class MoneyMovements {
    private final String name;
    private final long cost;
    private final PaymentType paymentType;

    public MoneyMovements(String name, long cost, PaymentType paymentType) {
        this.name = name;
        this.cost = cost;
        this.paymentType = paymentType;
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
}
