package com.oprotsen.JavaOOP.lesson7;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Max {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bob", "Alexander", "Sophia", "Zoe");
        String longestName = Max.max(names, new LengthComparator());
        System.out.println(longestName);

        List<LocalDate> birthDays = Arrays.asList(
                LocalDate.of(1995, 8, 4),
                LocalDate.of(1986, 3, 15),
                LocalDate.of(1990, 10, 3),
                LocalDate.of(1990, 2, 26)
        );
        LocalDate latestBirthDayInYear = Max.max(birthDays, new DayInYearComparator());
        System.out.println(latestBirthDayInYear);
    }

    static <T> T max(List<T> list, Comparator<T> comparator) {
          T max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (comparator.compare(list.get(i), max) > 0) {
                max = list.get(i);
             }
        }
        return max;
    }
}

class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return Integer.compare(a.length(), b.length());
    }
}

class DayInYearComparator implements Comparator<LocalDate> {
    @Override
    public int compare(LocalDate a, LocalDate b) {
        return Long.compare(a.getMonthValue(), b.getMonthValue());
    }
}

