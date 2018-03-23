package com.oprotsen.JavaOOP.CourseProject;

import java.util.ArrayList;

public class User {
    private final String login;
    private final Money money;
    private final long moneyCash;
    private final long moneyCard;
    private final ArrayList<TypeOfProduct> earnings = new ArrayList<>();
    private final ArrayList<TypeOfProduct> consumptions = new ArrayList<>();

    public User(String login, Money money) {
        this.login = login;
        this.money = money;
        this.moneyCash = setCash();
        this.moneyCard = setCard();
    }

    public void addEarnings(TypeOfProduct category) {
        earnings.add(category);
    }

    public long setCash() {
        long mone = 0 ;
        for (TypeOfProduct elem: earnings) {
            if (elem.getType().equals(money.getCash()))
            mone += elem.getType().setMoney(elem.getCost());
        }
        for (TypeOfProduct elem: consumptions) {
            if (elem.getType().equals(money.getCash()))
                mone -= elem.getType().setMoney(elem.getCost());
        }
        return mone;
    }

//    public long setMoney() {
//        long mone = 0 ;
//        for (TypeOfProduct elem: earnings) {
//            mone += elem.getType().setMoney(elem.getCost());
//        }
//        return mone;
//    }

    public long setCard() {
        long mone = 0 ;
        for (TypeOfProduct elem: earnings) {
            if (elem.getType().equals(money.getCard()))
            mone += elem.getType().setMoney(elem.getCost());
        }
        for (TypeOfProduct elem: consumptions) {
            if (elem.getType().equals(money.getCard()))
                mone -= elem.getType().setMoney(elem.getCost());
        }
        return mone;
    }
    public long calculateConsumptions() {
        long cost = 0;
        for (TypeOfProduct elem: consumptions) {
            cost += elem.getCost();
        }
        return -1* cost;
    }

    public long calculateEarnings() {
        long cost = 0;
        for (TypeOfProduct elem: earnings) {
            cost += elem.getCost();
        }
        return cost;
    }

    public ArrayList<TypeOfProduct> getEarnings() {
        return earnings;
    }

    public ArrayList<TypeOfProduct> getConsumptions() {
        return consumptions;
    }

    public void addConsumption(TypeOfProduct category) {
        consumptions.add(category);
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", earnings=" + earnings +
                ", consumptions=" + consumptions +
                '}';
    }
}
