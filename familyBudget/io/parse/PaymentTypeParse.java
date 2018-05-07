package com.oprotsen.JavaOOP.familyBudget.io.parse;

import com.oprotsen.JavaOOP.familyBudget.PaymentType;
import com.oprotsen.JavaOOP.familyBudget.io.Parser;
import com.oprotsen.JavaOOP.familyBudget.io.parser.PaymentTypeParser;

public class PaymentTypeParse implements Parser<PaymentType>{

    @Override
    public PaymentType parse(String str) {
        PaymentType type = new PaymentTypeParser().parse(str);
        return type;
    }
}
