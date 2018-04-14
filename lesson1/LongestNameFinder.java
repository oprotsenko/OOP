package com.oprotsen.JavaOOP.lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestNameFinder {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Phil" , "Anny", "Richard", "Chris"));
        System.out.println(longestName(names));
    }
    public static String longestName(ArrayList<String> name) {
        if (name.size() == 0)
            throw new   IllegalArgumentException("Empty array");
        String longestName = "";
        for (String elem : name) {
            if (elem.length() > longestName.length())
                longestName = elem;
        }
        return longestName;
    }

}
