package com.oprotsen.JavaOOP.familyBudget;

public interface PaymentType {
    long getMoney();
    void addMoney(long money);
    CardType getPaymentType();
}
