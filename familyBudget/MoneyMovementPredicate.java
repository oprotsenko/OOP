package com.oprotsen.JavaOOP.familyBudget;

import java.time.LocalDate;
import java.util.function.Predicate;

public class MoneyMovementPredicate {

    public static Predicate<MoneyMovement> containsName (String substring) {
        return new Predicate<MoneyMovement>() {
            @Override
            public boolean test(MoneyMovement moneyMovement) {
                return moneyMovement.getName().contains(substring);
            }
        };
    }

    public static Predicate<MoneyMovement> hasPaymentType (CardType type) {
        return new Predicate<MoneyMovement>() {
            @Override
            public boolean test(MoneyMovement moneyMovement) {
                return moneyMovement.getPaymentType().getPaymentType().equals(type);
            }
        };
    }

    public static Predicate<MoneyMovement> isBetweenDate (LocalDate from, LocalDate to) {
        return new Predicate<MoneyMovement>() {
            @Override
            public boolean test(MoneyMovement moneyMovement) {
                return (moneyMovement.getLocalDate().isAfter(from) || moneyMovement.getLocalDate().isEqual(from))
                        && (moneyMovement.getLocalDate().isBefore(to) || moneyMovement.getLocalDate().isEqual(to));
            }
        };
    }

    public static Predicate<MoneyMovement> hasCostBetween (long from, long to) {
        return new Predicate<MoneyMovement>() {
            @Override
            public boolean test(MoneyMovement moneyMovement) {
                return moneyMovement.getCost() >= from && moneyMovement.getCost() <= to;
            }
        };
    }
}
