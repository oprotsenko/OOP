package com.oprotsen.JavaOOP.lesson12.cloner;

public class ClonerRunner {
    public static void main(String[] args) {

        Integer integer = 1234567890;
        Integer clonedInteger = Cloner.clone(integer);
        System.out.println(clonedInteger);
    }
}
