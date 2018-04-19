package com.oprotsen.JavaOOP.familyBudget;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class User implements Iterable<CategoryMovements>{
    private final String login;
    private final Money money;
    private final List<CategoryMovements> earnings = new ArrayList<>();
    private final List<CategoryMovements> consumptions = new ArrayList<>();

    public User(String login, Money money) {
        this.login = login;
        this.money = money;
    }

    public void addEarnings(CategoryMovements movements) {
        earnings.add(movements);
    }

    public void addConsumptions(CategoryMovements movements) {
        consumptions.add(movements);
    }

    public void countEarnings() {
        int move = 0;
        for (CategoryMovements category: earnings) {
            move++;
            if (category.getMove(move).getPaymentType().equals(money.getCard(category.getMove(move).getPaymentType().getPaymentType())))
            money.getCard(category.getMove(move).getPaymentType().getPaymentType()).addMoney(category.getMove(move).getCost());
            else
                money.getCash().addMoney(category.getMove(move).getCost());
        }
    }

    public void countConsumptions() {
        int move = 0;
        for (CategoryMovements category: consumptions) {
            move++;
            if (category.getMove(move).getPaymentType().equals(money.getCard(category.getMove(move).getPaymentType().getPaymentType())))
                money.getCard(category.getMove(move).getPaymentType().getPaymentType()).addMoney(-category.getMove(move).getCost());
            else
                money.getCash().addMoney(-category.getMove(move).getCost());
        }
    }

    public String getLogin() {
        return login;
    }

    public Money getMoney() {
        return money;
    }

    public List<CategoryMovements> getEarnings() {
        return earnings;
    }

    public List<CategoryMovements> getConsumptions() {
        return consumptions;
    }

    @Override
    public Iterator<CategoryMovements> iterator() {
        return consumptions.iterator();
    }
}

