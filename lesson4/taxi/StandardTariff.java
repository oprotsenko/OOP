package com.oprotsen.JavaOOP.lesson4.taxi;

public class StandardTariff implements Tariff {
    private final Ride ride;

    public StandardTariff() {
        ride = getRide();
    }

    public Ride getRide() {
        return ride;
    }

    @Override
    public long calculatePrice(Ride ride) {
        return 30 + 5 * ride.getDistance() + 2 * ride.getDuration();
    }
}
