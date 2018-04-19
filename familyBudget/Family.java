package com.oprotsen.JavaOOP.familyBudget;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Family implements Iterable<User> {
    private final List<User> family = new ArrayList<>();

    public void addUser(User user) {
        family.add(user);
    }

    public long familyCash() {
        long familyCash = 0;
       for (User user: family) {
           familyCash += user.getMoney().getCash().getMoney();
       }
       return familyCash;
    }

    public long familyCard() {
        long familyCard = 0;
        for (User user: family) {
            familyCard += user.getMoney().getCardsMoney();
        }
        return familyCard;
    }

    public void countEarnings() {
        for (User user: family) {
            user.countEarnings();
        }
    }

    @Override
    public Iterator<User> iterator() {
        return family.iterator();
    }
}
