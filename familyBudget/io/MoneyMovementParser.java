package com.oprotsen.JavaOOP.familyBudget.io;

import com.oprotsen.JavaOOP.familyBudget.CategoryMovements;
import com.oprotsen.JavaOOP.familyBudget.MoneyMovement;
import com.oprotsen.JavaOOP.familyBudget.PaymentType;
import com.oprotsen.JavaOOP.familyBudget.io.parse.CostParse;
import com.oprotsen.JavaOOP.familyBudget.io.parse.LDParse;
import com.oprotsen.JavaOOP.familyBudget.io.parse.PaymentTypeParse;

import java.time.LocalDate;

public class MoneyMovementParser implements Parser<CategoryMovements>{

    private final String delimiter;
    private final Parser<Long> costParser = new CostParse();
    private final Parser<PaymentType> paymentTypeParser = new PaymentTypeParse();
    private final Parser<LocalDate> localDateParser = new LDParse();

    public MoneyMovementParser(String delimiter) {
        this.delimiter = delimiter;
    }

    @Override
    public CategoryMovements parse(String str) {
        String[] tokens = str.split(delimiter);
        if (tokens.length < 5) {
            throw new IllegalArgumentException("some values are missed: " + str);
        }
        CategoryMovements categoryMovements = new CategoryMovements(tokens[0]);
        categoryMovements.addCategory(new MoneyMovement.Builder()
                .name(tokens[1])
                .cost(costParser.parse(tokens[2]))
                .paymentType(paymentTypeParser.parse(tokens[3]))
                .localDate(localDateParser.parse(tokens[4]))
                .build());
        return categoryMovements;
    }



}
