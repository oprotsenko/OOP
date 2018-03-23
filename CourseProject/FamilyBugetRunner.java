package com.oprotsen.JavaOOP.CourseProject;

import java.time.LocalDate;

public class FamilyBugetRunner {
    public static void main(String[] args) {
        Family family = new Family();
        Card card = new Card();
        Cash cash = new Cash();
        Money money = new Money(card, cash);

        User olena = new User("olena",money);

        TypeOfProduct advance = new TypeOfProduct("advance", 2299, LocalDate.now(), card);
        olena.addEarnings(advance);
        TypeOfProduct salary = new TypeOfProduct("salary", 2599, LocalDate.now(), cash);
        olena.addEarnings(salary);
        TypeOfProduct advance1 = new TypeOfProduct("advance", 2299, LocalDate.now(), card);
        olena.addEarnings(advance1);

        Category food = new Category("food");
        TypeOfProduct aushan = new TypeOfProduct("aushan", 1000, LocalDate.now(), card);
        olena.addConsumption(aushan);
        food.addType(aushan);
        TypeOfProduct silpo = new TypeOfProduct("silpo", 500, LocalDate.now(), cash);
        olena.addConsumption(silpo);
        food.addType(silpo);

        family.addUser(olena);

        System.out.println(olena.getEarnings());
        System.out.println(olena.setCash());
        System.out.println(olena.setCard());
        System.out.println(olena.calculateConsumptions());
        System.out.println(olena.calculateEarnings());



    }
}
