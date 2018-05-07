package com.oprotsen.JavaOOP.familyBudget.io;

import com.oprotsen.JavaOOP.familyBudget.MoneyMovement;

public class MMStringConverter implements ToStringConverter<MoneyMovement> {

    @Override
    public String toString(MoneyMovement value) {
        return value.toString();
    }
}
