package com.oprotsen.JavaOOP.lesson7.comparablre;

import com.oprotsen.JavaOOP.lesson7.comparablre.ComparablePair;

import java.time.LocalDate;

public class ComparablePairRunner {
    public static void main(String[] args) {
        ComparablePair<String> names = new ComparablePair<>("Alexander", "Bob");
        System.out.println(names.bigger()); // Bob
        System.out.println(names.smaller()); // Alexander

        ComparablePair<LocalDate> dates = new ComparablePair<>(
                LocalDate.of(1995, 8, 4),
                LocalDate.of(1990, 10, 3)
        );
        System.out.println(dates.bigger()); // 1995-08-04
        System.out.println(dates.smaller()); // 1990-10-03

    }
}
