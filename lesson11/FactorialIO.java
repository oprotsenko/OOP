package com.oprotsen.JavaOOP.lesson11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;

public class FactorialIO {
    public static void main(String[] args) {
        threadFactorial(3, 10);
    }

    public static void io(int n){
        String fileName = "C:\\Users\\Elena\\JavaProjects\\src\\com\\oprotsen\\JavaOOP\\lesson11\\factorial" + n + ".txt";
        String fileContent = factorial(n).toString();

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            bufferedWriter.write(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static BigInteger factorial(int n) {
        BigInteger factorial = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++)
            factorial = factorial.multiply(BigInteger.valueOf(i));
        return factorial;
    }

    public static void threadFactorial(int threads, int n) {
        for (int elem = 1; elem <= threads; elem++) {
            int factNum = n*elem;
            Thread thread = new Thread(() -> io(factNum));
            thread.start();
        }
    }

}
