package com.oprotsen.JavaOOP.courseProject.countMoney;

import com.oprotsen.JavaOOP.courseProject.TypeOfProduct;
import com.oprotsen.JavaOOP.courseProject.User;

public class CountMoney {
    private final User user;

    public CountMoney(User user) {
        this.user = user;
    }

    public long setCash() {
        long mone = 0 ;
        for (TypeOfProduct elem: user.getEarnings()) {
            if (elem.getType().equals(user.getMoney().getCash()))
                mone += elem.getType().setMoney(elem.getCost());
        }
        for (TypeOfProduct elem: user.getConsumptions()) {
            if (elem.getType().equals(user.getMoney().getCash()))
                mone -= elem.getType().setMoney(elem.getCost());
        }
        return mone;
    }

    public long setCard() {
        long mone = 0 ;
        for (TypeOfProduct elem: user.getEarnings()) {
            if (elem.getType().equals(user.getMoney().getCard()))
                mone += elem.getType().setMoney(elem.getCost());
        }
        for (TypeOfProduct elem: user.getConsumptions()) {
            if (elem.getType().equals(user.getMoney().getCard()))
                mone -= elem.getType().setMoney(elem.getCost());
        }
        return mone;
    }

    public long calculateConsumptions() {
        long cost = 0;
        for (TypeOfProduct elem: user.getConsumptions()) {
            cost += elem.getCost();
        }
        return -1* cost;
    }

    public long calculateEarnings() {
        long cost = 0;
        for (TypeOfProduct elem: user.getEarnings()) {
            cost += elem.getCost();
        }
        return cost;
    }
}
