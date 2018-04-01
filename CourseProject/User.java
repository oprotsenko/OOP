package com.oprotsen.JavaOOP.courseProject;

import java.util.ArrayList;
import java.util.List;

public class User{
    private final String login;
    private final Money money;
    private final List<TypeOfProduct> earnings = new ArrayList<>();
    private final ArrayList<TypeOfProduct> consumptions = new ArrayList<>();

    public User(String login, Money money) {
        this.login = login;
        this.money = money;
    }

    public void addEarnings(TypeOfProduct category) {
        earnings.add(category);
    }

    public void addConsumptions(TypeOfProduct category) {
        consumptions.add(category);
    }

    public List<TypeOfProduct> getEarnings() {
        return earnings;
    }

    public ArrayList<TypeOfProduct> getConsumptions() {
        return consumptions;
    }

    public String getLogin() {
        return login;
    }

    public void setCash() {
        long money = 0 ;
        for (TypeOfProduct elem: earnings) {
            if (elem.getType().equals(getMoney().getCard()))
                money += elem.getType().setMoney(elem.getCost());
        }
        for (TypeOfProduct elem: consumptions) {
            if (elem.getType().equals(getMoney().getCash()))
                money -= elem.getType().setMoney(elem.getCost());
        }
        getMoney().getCash().setMoney(money);
    }

    public void setCard() {
        long money = 0 ;
        for (TypeOfProduct elem: earnings) {
            if (elem.getType().equals(getMoney().getCard()))
                money += elem.getType().setMoney(elem.getCost());
        }
        for (TypeOfProduct elem: consumptions) {
            if (elem.getType().equals(getMoney().getCard()))
                money -= elem.getType().setMoney(elem.getCost());
        }
        getMoney().getCard().setMoney(money);
    }


    public Money getMoney() {
        return money;
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
