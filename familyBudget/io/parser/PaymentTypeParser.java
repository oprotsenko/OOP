package com.oprotsen.JavaOOP.familyBudget.io.parser;

import com.oprotsen.JavaOOP.familyBudget.Card;
import com.oprotsen.JavaOOP.familyBudget.CardType;
import com.oprotsen.JavaOOP.familyBudget.PaymentType;
import com.oprotsen.JavaOOP.familyBudget.io.Parser;

public class PaymentTypeParser implements Parser<PaymentType> {
    @Override
    public PaymentType parse(String str) {
        PaymentType type = new Card(null, 0, CardType.valueOf(str));
        return type;
    }
}
