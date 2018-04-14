package com.oprotsen.JavaOOP.lesson4.taxi;

import java.util.ArrayList;

public class RidesHistory {
    private final ArrayList<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride) {
        rides.add(ride);
    }

    public long getTotalPrice() {
        long totalPrice = 0;
        for (Ride elem : rides) {
            totalPrice += elem.getPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "RidesHistory{" +
                "rides=" + rides +
                '}';
    }
}
