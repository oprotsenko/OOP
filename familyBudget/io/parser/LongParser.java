package com.oprotsen.JavaOOP.familyBudget.io.parser;

import com.oprotsen.JavaOOP.familyBudget.io.Parser;

public class LongParser implements Parser<Long> {

    @Override
    public Long parse(String str) {
        return Long.parseLong(str);
    }
}
