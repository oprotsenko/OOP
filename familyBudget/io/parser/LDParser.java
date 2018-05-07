package com.oprotsen.JavaOOP.familyBudget.io.parser;

import com.oprotsen.JavaOOP.familyBudget.io.Parser;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class LDParser implements Parser<LocalDate> {
    @Override
    public LocalDate parse(String str) {
        String[] date = str.split(Pattern.quote("."));
        return LocalDate.of(Integer.parseInt(date[2]), Integer.parseInt(date[1]), Integer.parseInt(date[0]));
    }
}
