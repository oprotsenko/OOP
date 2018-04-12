package com.oprotsen.JavaOOP.lesson6;

public class AccountRunner {
    public static void main(String[] args) {
        Account randomAccount = new RandomAccount(0.1, 0.2, 0.6);

        Account connectionRetryAccount = new ConnectionRetryAccount(randomAccount, 5);
        try {
            connectionRetryAccount.withdraw(10);
        } catch (AccountException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
