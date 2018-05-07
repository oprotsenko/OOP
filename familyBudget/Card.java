package com.oprotsen.JavaOOP.familyBudget;

public class Card implements PaymentType {
    private final String name;
    private long money;
    private final CardType cardType;

    public Card(String name, long money, CardType cardType) {
        this.name = name;
        this.money = money;
        this.cardType = cardType;
    }

    public String getName() {
        return name;
    }

    @Override
    public long getMoney() {
        return money;
    }

    public CardType getPaymentType() {
        return cardType;
    }

    public void addMoney(long money) {
        this.money += money;
    }

    @Override
    public String toString() {
        return "Card " + name + " " + money + " " + cardType;
    }
}
