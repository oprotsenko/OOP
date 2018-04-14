package com.oprotsen.JavaOOP.lesson8.cleaner;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

public class Cleaner {
    static void removeNulls(Collection<?> collection) {
        for (Iterator<?> i = collection.iterator(); i.hasNext();){
            if (i.next() == null)
                i.remove();
        }
    }

    static <T> void remove(Collection<T> collection, Predicate<T> predicate) {
        for (Iterator<T> i = collection.iterator(); i.hasNext();) {
            if (predicate.test(i.next()))
                i.remove();
        }
    }

}
