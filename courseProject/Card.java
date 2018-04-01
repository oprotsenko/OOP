package com.oprotsen.JavaOOP.courseProject;

public class Card implements CardOrCash{
    private String name;
    private long money;

    public Card(String name, long money) {
        this.name = name;
        this.money = money;
    }

    @Override
    public long getMoney() {
        return money;
    }

    @Override
    public long setMoney(long money) {
        return this.money + money;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Card{" +
                "money=" + money +
                '}';
    }
}
