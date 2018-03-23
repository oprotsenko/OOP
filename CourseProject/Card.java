package com.oprotsen.JavaOOP.CourseProject;

public class Card implements CardOrCash{
    private long money;

    public Card() {
        this.money = getMoney();
    }

    @Override
    public long getMoney() {
        return money;
    }

    @Override
    public long setMoney(long money) {
        return this.money + money;
    }

    @Override
    public String toString() {
        return "Card{" +
                "money=" + money +
                '}';
    }
}
