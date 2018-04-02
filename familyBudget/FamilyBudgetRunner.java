package com.oprotsen.JavaOOP.familyBudget;

import java.util.ArrayList;

public class FamilyBudgetRunner {
    public static void main(String[] args) {
        ArrayList<Card> cards = new ArrayList<>();
        Card mc = new Card("salary", 1000, CardType.MASTERCARD);
        cards.add(mc);
        Cash wallet = new Cash(1000);
        User olena = new User("Olena", new Money(wallet, cards));
        CategoryOfMovements consum = new CategoryOfMovements();
        MoneyMovements food = new MoneyMovements("food", 500, mc);
        consum.addCategory(food);
        olena.addConsumptions(consum);

        System.out.println(olena.getMoney().getCard().getMoney());

        CategoryOfMovements earn = new CategoryOfMovements();
        MoneyMovements salary = new MoneyMovements("salary", 5000, wallet);
        earn.addCategory(salary);
        olena.addEarnings(earn);

        System.out.println(olena.getMoney().getCash().getMoney());
    }
}
