package com.oprotsen.JavaOOP.lesson6;

public class RandomAccount implements Account {
    private final double notEnoughFundsProbability;
    private final double accountExpiredProbability;
    private final double lostConnectionProbability;

    public RandomAccount(
            double notEnoughFundsProbability,
            double accountExpiredProbability,
            double lostConnectionProbability) {
        this.accountExpiredProbability = accountExpiredProbability;
        this.lostConnectionProbability = lostConnectionProbability;
        this.notEnoughFundsProbability = notEnoughFundsProbability;
    }

    @Override
    public void withdraw(long money) throws AccountException {
        double outOfMoney = notEnoughFundsProbability;
        double expiredData = outOfMoney + accountExpiredProbability;
        double connectionError = expiredData + lostConnectionProbability;
        double randomNumber = Math.random();

        if (randomNumber >= 0 && randomNumber < outOfMoney) {
            throw new NotEnoughFundsException("You don't have enough money.");
        } else if (randomNumber >= outOfMoney && randomNumber < expiredData) {
            throw new AccountExpiredException("Your account has expired data.");
        } else if (randomNumber >= expiredData && randomNumber < connectionError) {
            throw new AccountConnectionException("Connection error.");
        } else {
            return;
        }
    }
}

