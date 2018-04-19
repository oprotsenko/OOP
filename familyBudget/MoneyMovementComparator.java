package com.oprotsen.JavaOOP.familyBudget;

import java.util.Comparator;

public class MoneyMovementComparator {
    public static Comparator<MoneyMovement> byName() {
        return new Comparator<MoneyMovement>() {
            @Override
            public int compare(MoneyMovement a, MoneyMovement b) {
                return a.getName().compareToIgnoreCase(b.getName());
            }
        };
    }

    public static Comparator<MoneyMovement> byCost() {
        return new Comparator<MoneyMovement>() {
            @Override
            public int compare(MoneyMovement a, MoneyMovement b) {
                return (int) ((int)a.getCost() - b.getCost());
            }
        };
    }

    public static Comparator<MoneyMovement> byPaymentType() {
        return new Comparator<MoneyMovement>() {
            @Override
            public int compare(MoneyMovement a, MoneyMovement b) {
                return a.getPaymentType().getPaymentType().compareTo(b.getPaymentType().getPaymentType());
            }
        };
    }

    public static Comparator<MoneyMovement> byDate() {
        return new Comparator<MoneyMovement>() {
            @Override
            public int compare(MoneyMovement a, MoneyMovement b) {
                return a.getLocalDate().compareTo(b.getLocalDate());
            }
        };
    }
}
