package com.oprotsen.JavaOOP.familyBudget;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Family implements Iterable<User>, Printer{
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

    public void calendarViweE() {
        System.out.println("EARNINGS: ");

        for (User user: family) {
            int i = 0;
            for (CategoryMovements elem : user.getEarnings()) {
                System.out.print(elem.getCategory(i).getLocalDate() + ": ");
                System.out.print(elem.getCategory(i).getName() + " ");
                if (elem.getCategory(i).getPaymentType().getCardType() != null)
                    System.out.print(elem.getCategory(i).getPaymentType().getCardType() + " ");
                System.out.println(elem.getCategory(i).getCost() + " UAH");
                i++;
            }
        }
    }

    public void calendarViweC() {
        System.out.println("CONSUMPTIONS: ");
        for (User user: family) {
            int i = 0;
            for (CategoryMovements elem : user.getConsumptions()) {
                System.out.print(elem.getCategory(i).getLocalDate() + ": ");
                System.out.print(elem.getCategory(i).getName() + " ");
                if (elem.getCategory(i).getPaymentType().getCardType() != null)
                    System.out.print(elem.getCategory(i).getPaymentType().getCardType() + " ");
                System.out.println(elem.getCategory(i).getCost() + " UAH");
                i++;
            }
        }
    }

    public void categoryViweE() {
        System.out.println("EARNINGS: ");

        for (User user: family) {
            int i = 0;
            for (CategoryMovements elem : user.getEarnings()) {
                System.out.println(elem.getName() + " " + elem.getCategory(i).getLocalDate() + " " + elem.getCategory(i).getCost());
                i++;
            }
        }
    }

    public void categoryViweC() {
        System.out.println("CONSUMPTIONS: ");

        for (User user: family) {
            int i = 0;
            for (CategoryMovements elem : user.getConsumptions()) {
                System.out.println(elem.getName() + " " + elem.getCategory(i).getLocalDate() + " " + elem.getCategory(i).getCost());
                i++;
            }
        }
    }

    public void cardViwe() {
        System.out.println("EARNINGS: ");

        for (User user: family) {
            int e = 0;
            for (CategoryMovements elem : user.getEarnings()) {
                if (elem.getCategory(e).getPaymentType().getCardType() != null)
                    System.out.println(elem.getCategory(e).getPaymentType().getCardType() + " " + elem.getCategory(e).getCost());
                e++;
            }
        }
        System.out.println("CONSUMPTIONS: ");

        for (User user: family) {
            int c = 0;
            for (CategoryMovements elem : user.getConsumptions()) {
                if (elem.getCategory(c).getPaymentType().getCardType() != null)
                    System.out.println(elem.getCategory(c).getPaymentType().getCardType() + " " + elem.getCategory(c).getCost());
                c++;
            }
        }
    }

    @Override
    public Iterator<User> iterator() {
        return family.iterator();
    }
}
