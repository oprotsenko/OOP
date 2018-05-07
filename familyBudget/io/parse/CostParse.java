package com.oprotsen.JavaOOP.familyBudget.io.parse;

import com.oprotsen.JavaOOP.familyBudget.io.Parser;
import com.oprotsen.JavaOOP.familyBudget.io.parser.LongParser;

public class CostParse implements Parser<Long> {

    @Override
    public Long parse(String str) {
        long cost = new LongParser().parse(str);
        return cost;
    }
}
