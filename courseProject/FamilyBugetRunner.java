package com.oprotsen.JavaOOP.courseProject;

import com.oprotsen.JavaOOP.courseProject.countMoney.CountMoney;
import com.oprotsen.JavaOOP.courseProject.countMoney.PrintConsumptions;

import java.time.LocalDate;

public class FamilyBugetRunner {
    public static void main(String[] args) {
        Family family = new Family();
        Card olenaMCard = new Card("MasterCard", 1000);
        Cash olenaCash = new Cash(2000);
        Money olenaMoney = new Money(olenaMCard, olenaCash);

        User olena = new User("olena",olenaMoney);

        Category work = new Category("work");
        TypeOfProduct advance = new TypeOfProduct("advance", work, 3000, LocalDate.now(), olenaMCard);
        olena.addEarnings(advance);
        TypeOfProduct salary = new TypeOfProduct("salary", work,7000, LocalDate.now(), olenaCash);
        olena.addEarnings(salary);

        Card evhenMCard = new Card("MC", 5000);
        Cash evhenCash = new Cash(2000);
        Money evhenMoney = new Money(evhenMCard, evhenCash);
        User evhen = new User("evhen",evhenMoney);
        TypeOfProduct advance1 = new TypeOfProduct("advance", work, 5000, LocalDate.now(), evhenMCard);
        evhen.addEarnings(advance1);

        Category food = new Category("food");
        Category closes = new Category("closes");
        TypeOfProduct aushan = new TypeOfProduct("aushan",food,1000, LocalDate.now(), evhenMCard);
        evhen.addConsumptions(aushan);
       food.addType(aushan);
        TypeOfProduct silpo = new TypeOfProduct("silpo", food,500, LocalDate.now(), olenaCash);
        olena.addConsumptions(silpo);
        food.addType(silpo);
        TypeOfProduct dress = new TypeOfProduct("dress", closes, 800, LocalDate.now(), olenaMCard);
        olena.addConsumptions(dress);
        closes.addType(dress);
        TypeOfProduct novus = new TypeOfProduct("novus", food,500, LocalDate.now(), evhenCash);
        evhen.addConsumptions(novus);
        food.addType(novus);

        family.addUser(olena);
        family.addUser(evhen);


        System.out.println(olenaMCard.setMoney(100));
        CountMoney countMoney = new CountMoney(olena);
        System.out.println(olena.getMoney());
        olena.setCard();
        olenaMCard.setMoney(100);
        System.out.println(olena.getMoney());
//        System.out.println(countMoney.setCash());
//        System.out.println(countMoney.setCard());
        System.out.println(countMoney.calculateConsumptions());
        System.out.println(countMoney.calculateEarnings());
        System.out.println(olena.getMoney());
        PrintConsumptions printer = new PrintConsumptions(olena);
        countMoney = new CountMoney(evhen);
        System.out.println(countMoney.setCard());
        System.out.println(countMoney.calculateConsumptions());

        printer.printCalendar();
        printer.printByCategory();

    }
}
