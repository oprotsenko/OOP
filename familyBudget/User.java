package com.oprotsen.JavaOOP.familyBudget;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String login;
    private Money money;
    private List<CategoryOfMovements> earnings = new ArrayList<>();
    private List<CategoryOfMovements> consumptions = new ArrayList<>();

    public User(String login, Money money) {
        this.login = login;
        this.money = money;
    }

    public void addEarnings(CategoryOfMovements movements) {
        earnings.add(movements);
        for (CategoryOfMovements category: earnings) {
            if (category.getMove().getPaymentType().equals(money.getCard()))
            money.getCard().setMoney(category.getMove().getCost());
            else
                money.getCash().setMoney(category.getMove().getCost());
        }
    }
    public void addConsumptions(CategoryOfMovements movements) {
        consumptions.add(movements);
        for (CategoryOfMovements category: consumptions) {
            if (category.getMove().getPaymentType().equals(money.getCard()))
                money.getCard().setMoney(-category.getMove().getCost());
            else
                money.getCash().setMoney(-category.getMove().getCost());
        }
    }

    public String getLogin() {
        return login;
    }

    public Money getMoney() {
        return money;
    }
}
