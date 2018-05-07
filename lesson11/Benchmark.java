package com.oprotsen.JavaOOP.lesson11;

public class Benchmark {
    public static void main(String[] args) {
        final long endTime, startTime = System.nanoTime();
        FactorialIO.threadFactorial(10, 100);
        endTime = System.nanoTime();
        double runTime = (endTime - startTime);
        System.out.println("Code took " + runTime + " seconds");
    }
}
