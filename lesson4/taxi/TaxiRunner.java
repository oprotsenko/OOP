package com.oprotsen.JavaOOP.lesson4.taxi;

public class TaxiRunner {
    public static void main(String[] args) {
        RidesHistory ridesHistory = new RidesHistory();
        Tariff tariff = new FamilyTariff();
        Tariff tariff1 = new StandardTariff();

        ridesHistory.addRide(new Ride(2,15,10,tariff));
        ridesHistory.addRide(new Ride(2,15,10,tariff1));
        System.out.println(ridesHistory.getTotalPrice());
    }
}
