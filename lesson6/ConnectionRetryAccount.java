package com.oprotsen.JavaOOP.lesson6;

public class ConnectionRetryAccount implements Account {
    private final Account account;
    private final int retries;

    public ConnectionRetryAccount(Account account, int retries) {
        this.account = account;
        this.retries = retries;
    }

    @Override
    public void withdraw(long money) throws AccountException {
        triesToConnect(money, retries);
        System.out.println("Success!");
    }

    private void triesToConnect(long money, int tries) throws AccountException {
       if (tries < 1) {
           throw new OutOfMemoryError("Out of tries.");
       }
                try {
                    System.out.println("tries left " + (tries - 1));
                    account.withdraw(money);
                    return;
                } catch (AccountConnectionException ex) {
                    while ( tries > 0) {
                        triesToConnect(money, tries--);
                        return;
                    }
                }
    }

}