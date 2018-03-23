package com.oprotsen.JavaOOP.CourseProject;

public class Money {
    private long money;
    private final Card card;
    private final Cash cash;

    public Money(Card card, Cash cash) {
        this.money = getMoney();
        this.card = card;
        this.cash = cash;
    }

    public long getMoney() {
        return money;
    }

    public Card getCard() {
        return card;
    }

    public Cash getCash() {
        return cash;
    }

    public long setMoney() {
        return card.getMoney() + cash.getMoney();
    }

    @Override
    public String toString() {
        return "Money{" +
                "money=" + money +
                ", card=" + card +
                ", cash=" + cash +
                '}';
    }
}
