package com.oprotsen.JavaOOP.lesson8.binarySearch;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BinarySearchRunner {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 30, 50};
        System.out.println(BinarySearch.binarySearch(array, 30)); // 3
        System.out.println(BinarySearch.binarySearch(array, 20)); // 2
        System.out.println(BinarySearch.binarySearch(array, 60)); // -5
        System.out.println();
        int[] array1 = {10, 20, 20, 30, 50, 60, 80, 90, 110};
        System.out.println(BinarySearch.binarySearch(array1, 10)); // 0
        System.out.println(BinarySearch.binarySearch(array1, 60)); // 5
        System.out.println(BinarySearch.binarySearch(array1, 90)); // 7
        System.out.println(BinarySearch.binarySearch(array1, 120)); // -9
        System.out.println();
        int[] array2 = {10, 20, 20, 30, 50, 60, 80, 90};
        System.out.println(BinarySearch.binarySearch(array2, 10)); // 0
        System.out.println(BinarySearch.binarySearch(array2, 60)); // 5
        System.out.println(BinarySearch.binarySearch(array2, 90)); // 7
        System.out.println(BinarySearch.binarySearch(array2, 70)); // -6
        System.out.println();

        List<Integer> array3 = Arrays.asList(10, 20, 20, 30, 50, 60, 80, 90);
        System.out.println(BinarySearch.binarySearch(array3, Integer.valueOf(10), byValue())); // 0
        System.out.println(BinarySearch.binarySearch(array3, Integer.valueOf(60), byValue())); // 5
        System.out.println(BinarySearch.binarySearch(array3, Integer.valueOf(90), byValue())); // 7
        System.out.println(BinarySearch.binarySearch(array3, Integer.valueOf(70), byValue())); // -6
    }

    public static Comparator<Integer> byValue() {
        return new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.intValue() - o2.intValue();
            }
        };
    }
}
