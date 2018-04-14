package com.oprotsen.JavaOOP.lesson8.binarySearch;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BinarySearch {
    static <T> int binarySearch (List<T> list, T elem, Comparator<T> comparator) {
        if (list.size() == 1) {
            if ((comparator.compare(list.get(0), elem) == 0) || (comparator.compare(elem, list.get(0)) < 0))
                return 0;
            else
                return -1;
        }
        int half = list.size() / 2;
        if (comparator.compare(list.get(half), elem) == 0)
            return half;
        if (comparator.compare(elem, list.get(half)) < 0) {
            int flag = binarySearch(list.subList(0, half), elem, comparator);
            return flag;
        }
        if (comparator.compare(elem, list.get(half)) > 0) {
            int flag = binarySearch(list.subList(half, list.size()), elem, comparator);
            if (flag > 0)
                return flag + half;
            else
                return flag + (-half);
        }
        return 0;
    }

    static int binarySearch(int[] array, int elem) {
        if (array.length == 1) {
            if (elem == array[0] || elem < array[0])
                return 0;
            else
                return -1;
        }
        int half = array.length / 2;
        if (elem == array[half])
            return half;
        if (elem < array[half]) {
            int flag = binarySearch(Arrays.copyOfRange(array, 0, half), elem);
            return flag;
        }
        if (elem > array[half]) {
            int flag = binarySearch(Arrays.copyOfRange(array, half, array.length), elem);
            if (flag > 0)
            return flag + half;
            else
                return flag + (-half);
        }
        return 0;
    }
}
