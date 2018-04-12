package com.oprotsen.JavaOOP.lesson7.comparablre;

public class ComparablePair<T extends Comparable<? super T>>{
    private final T a;
    private final T b;

    public ComparablePair(T a, T b) {
        this.a = a;
        this.b = b;
    }

    public T bigger() {
        if (a.compareTo(b) > 0)
        return a;
        else
            return b;
    }

    public T smaller() {
        if (a.compareTo(b) < 0)
            return a;
        else
            return b;
    }
}
