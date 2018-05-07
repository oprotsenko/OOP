package com.oprotsen.JavaOOP.familyBudget.io.parse;

import com.oprotsen.JavaOOP.familyBudget.io.Parser;
import com.oprotsen.JavaOOP.familyBudget.io.parser.LDParser;

import java.time.LocalDate;

public class LDParse implements Parser<LocalDate>{
    @Override
    public LocalDate parse(String str) {
        LocalDate date = new LDParser().parse(str);
        return date;
    }
}
