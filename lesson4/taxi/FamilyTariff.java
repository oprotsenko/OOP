package com.oprotsen.JavaOOP.lesson4.taxi;

public class FamilyTariff implements Tariff {
    private final Ride ride;

    public FamilyTariff() {
        ride = getRide();
    }

    public Ride getRide() {
        return ride;
    }

    @Override
    public long calculatePrice(Ride ride) {
        return 50 + 20 * ride.getDistance() / ride.getPassengers();
    }
}
