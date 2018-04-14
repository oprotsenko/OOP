package com.oprotsen.JavaOOP.familyBudget;

public class Cash implements PaymentType {
    private long money;

    public Cash(long money) {
        this.money = money;
    }

    @Override
    public long getMoney() {
        return money;
    }

    @Override
    public void addMoney(long money) {
        this.money += money;
    }

    @Override
    public CardType getCardType() {
        return CardType.CASH;
    }

    @Override
    public String toString() {
        return "Cash " + money;
    }
}
