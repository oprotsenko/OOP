package com.oprotsen.JavaOOP.familyBudget;

import java.time.LocalDate;

public class MoneyMovement {
    private final String name;
    private final long cost;
    private final PaymentType paymentType;
    private final LocalDate localDate;

    public MoneyMovement(Builder builder) {
        this.name = builder.name;
        this.cost = builder.cost;
        this.paymentType = builder.paymentType;
        this.localDate = builder.localDate;
    }

    public String getName() {
        return name;
    }

    public long getCost() {
        return cost;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    @Override
    public String toString() {
        return "MoneyMovement{" +
                "name ='" + name + '\'' +
                ", cost = " + cost + " UAH" +
                ", paymentType = " + paymentType +
                ", localDate = " + localDate +
                '}';
    }

    public static class Builder {

        private String name;
        private long cost;
        private PaymentType paymentType;
        private LocalDate localDate;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder cost(long cost) {
            this.cost = cost;
            return this;
        }

        public Builder paymentType(PaymentType paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        public Builder localDate(LocalDate localDate) {
            this.localDate = localDate;
            return this;
        }
        public MoneyMovement build(){
            return new MoneyMovement(this);
        }
    }
}
