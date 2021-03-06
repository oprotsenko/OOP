package com.oprotsen.JavaOOP.familyBudget;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FamilyBudgetRunner {
    public static void main(String[] args) {

        List<Card> cards = new ArrayList<>();
        Card mc = new Card("salary", 1000, CardType.MASTERCARD);
        Card visa = new Card("bonus", 1000, CardType.VISA);
        Cash wallet = new Cash(1000);
        cards.add(mc);
        cards.add(visa);

        User olena = new User("Olena", new Money(wallet, cards));
        //ToPrint toPrint = new ToPrint(olena);
//        System.out.println("All money " + olena.getMoney().getMoney());
//        System.out.println("Cards " + olena.getMoney().getCardsMoney());
//        System.out.println("Cash " + olena.getMoney().getCash().getMoney());
//        System.out.println();

        CategoryMovements salary = new CategoryMovements("salary");
        salary.addCategory(new MoneyMovement.Builder()
                .name("bonuses")
                .cost(2000)
                .paymentType(mc)
                .localDate(LocalDate.of(2018, 1, 15))
        .build());
        olena.addEarnings(salary);
        salary.addCategory(new MoneyMovement.Builder()
                .name("salary")
                .cost(5000)
                .paymentType(wallet)
                .localDate(LocalDate.of(2018, 2, 1))
        .build());
        olena.addEarnings(salary);
        salary.addCategory(new MoneyMovement.Builder()
                .name("salary")
                .cost(5000)
                .paymentType(visa)
                .localDate(LocalDate.of(2018, 3, 1))
        .build());
        olena.addEarnings(salary);

        olena.countEarnings();

//        System.out.println("All money " + olena.getMoney().getMoney());
//        System.out.println("Cards " + olena.getMoney().getCardsMoney());
//        System.out.println("Cash " + olena.getMoney().getCash().getMoney());
//        System.out.println();

//        CategoryMovements consumptions = new CategoryMovements("food");
//        CategoryMovements apartment = new CategoryMovements("apartment");
//        consumptions.addCategory(new MoneyMovement("aushan", 500, visa, LocalDate.of(2018, 2, 5)));
//        olena.addConsumptions(consumptions);
//        consumptions.addCategory(new MoneyMovement("silpo", 500, wallet, LocalDate.of(2018, 2, 25)));
//        olena.addConsumptions(consumptions);
//        apartment.addCategory(new MoneyMovement("communal", 200, wallet, LocalDate.of(2018, 3, 4)));
//        olena.addConsumptions(apartment);
//        olena.countConsumptions();
//
//        System.out.println("All money " + olena.getMoney().getMoney());
//        System.out.println("Cards " + olena.getMoney().getCardsMoney());
//        System.out.println("Cash " + olena.getMoney().getCash().getMoney());
//        System.out.println();

        Family family = new Family();
        family.addUser(olena);

        ArrayList<Card> cardsE = new ArrayList<>();
        Card mcE = new Card("salary", 2000, CardType.MASTERCARD);
        Card visaE = new Card("bonus", 1000, CardType.VISA);
        Cash walletE = new Cash(5000);
        cardsE.add(mcE);
        cardsE.add(visaE);

        User evhen = new User("Evhen", new Money(walletE, cardsE));
        //ToPrint toPrintE = new ToPrint(evhen);
//        System.out.println("EVHEN");
//        System.out.println("All money " + evhen.getMoney().getMoney());
//        System.out.println("Cards " + evhen.getMoney().getCardsMoney());
//        System.out.println("Cash " + evhen.getMoney().getCash().getMoney());
//        System.out.println();

//        CategoryMovements salaryE = new CategoryMovements("salary");
//        salaryE.addCategory(new MoneyMovement("bonuses", 1000, mcE, LocalDate.of(2018, 1, 15)));
//        evhen.addEarnings(salaryE);
//        salaryE.addCategory(new MoneyMovement("salary", 10000, walletE, LocalDate.of(2018, 2, 1)));
//        evhen.addEarnings(salaryE);
//        salaryE.addCategory(new MoneyMovement("salary", 4000, visaE, LocalDate.of(2018, 3, 1)));
//        evhen.addEarnings(salaryE);

        evhen.countEarnings();

//        System.out.println("All money " + evhen.getMoney().getMoney());
//        System.out.println("Cards " + evhen.getMoney().getCardsMoney());
 //       System.out.println("Cash " + evhen.getMoney().getCash().getMoney());
//        System.out.println();

//        CategoryMovements consumptionsE = new CategoryMovements("food");
//        CategoryMovements apartmentE = new CategoryMovements("apartment");
//        consumptionsE.addCategory(new MoneyMovement("aushan", 800, visaE, LocalDate.of(2018, 2, 5)));
//        evhen.addConsumptions(consumptionsE);
//        consumptionsE.addCategory(new MoneyMovement("silpo", 700, walletE, LocalDate.of(2018, 2, 25)));
//        evhen.addConsumptions(consumptionsE);
//        apartmentE.addCategory(new MoneyMovement("communal", 300, walletE, LocalDate.of(2018, 3, 4)));
//        evhen.addConsumptions(apartmentE);
//        evhen.countConsumptions();
//        System.out.println("Cash " + evhen.getMoney().getCash().getMoney());
//        System.out.println("Cards " + evhen.getMoney().getCardsMoney());
//        System.out.println();
        family.addUser(evhen);
        //toPrintE.categoryViweC();
        //family.countEarnings();
//        System.out.println("family cash = " + family.familyCash());
//        System.out.println("family cards = " + family.familyCard());
        //family.calendarViweE();
        Printer print = new ToPrint(family);
       //print.calendarViewConsumptions();
       // print.calendarViewEarnings();

        salary.sort(MoneyMovementComparator.byCost());
        System.out.println(salary);

//        System.out.println(budgetIN.csv.filter(MoneyMovementPredicate.containsName("silpo")));
//        System.out.println(budgetIN.csv.filter(MoneyMovementPredicate.hasCostBetween(500, 1500)));
//        System.out.println(budgetIN.csv.filter(MoneyMovementPredicate.hasPaymentType(CardType.VISA)));
    }
}
