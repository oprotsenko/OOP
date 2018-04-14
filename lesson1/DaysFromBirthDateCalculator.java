package com.oprotsen.JavaOOP.lesson1;

import java.time.LocalDate;

public class DaysFromBirthDateCalculator {
    public static void main(String[] args) {
        System.out.println(daysFromBirthDate("1972-12-28"));
        System.out.println(daysFromBirthDate("2005-05-01"));
    }
    public static long daysFromBirthDate(String birthDateString) {
        LocalDate birthData = LocalDate.parse(birthDateString);
        return LocalDate.now().toEpochDay() - birthData.toEpochDay();
    }
}
