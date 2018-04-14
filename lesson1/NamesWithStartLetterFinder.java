package com.oprotsen.JavaOOP.lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class NamesWithStartLetterFinder {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Phil", "Anny", "Aaron", "Bob"));
        System.out.println(namesWithStartLetter(names, 'A'));

        ArrayList<String> nam = new ArrayList<>(Arrays.asList("Phil", "Anny", "Aaron", "Bob"));
        System.out.println(namesWithStartLetter(nam));
    }

    public static ArrayList<String> namesWithStartLetter(ArrayList<String> names, char startLetter) {
        ArrayList<String> namesWithStartLetter = new ArrayList<>();
        for (String name : names) {
            if (name.charAt(0) == startLetter)
                namesWithStartLetter.add(name);
        }
        return namesWithStartLetter;
    }
    public static ArrayList<String> namesWithStartLetter(ArrayList<String> names) {
       return namesWithStartLetter(names, 'a');
    }
}
