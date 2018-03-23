package com.oprotsen.JavaOOP.CourseProject;

public class Cash implements CardOrCash{
    private long money;

    public Cash() {
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
        return "Cash{" +
                "money=" + money +
                '}';
    }
}
